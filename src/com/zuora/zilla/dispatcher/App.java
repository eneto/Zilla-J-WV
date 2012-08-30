package com.zuora.zilla.dispatcher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.zuora.api.SubscribeResult;
import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;

/**
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/** The catalogCache filename */
	public static final String CACHE_FILENAME = "catalogCache.txt";

	/** List of errors that may occur during the process */
	private List<String> errors;
	
	/** FIX: boolean if an array is already returned in the output.. */
	private boolean array;

    /**
     * @see HttpServlet#HttpServlet()
     */
	public App() {
	}


	/**
	 * Read the Product Catalog Data from the locally saved JSON cache. If no
	 * cache exists, this will refresh the catalog from Zuora first.
	 * 
	 * @return A model containing all necessary information needed to display
	 *         the products and rate plans in the product catalog.
	 */
	public String readCatalog() {
		String catalogJson = "";
		List<CatalogGroup> groups = null;
		BufferedReader in = null;
		// Try reading the cache first
		try {
			in = new BufferedReader(new FileReader(CACHE_FILENAME));
			catalogJson = in.readLine();

			// If the file exists but is empty -> refresh the catalog
			if (catalogJson == null) {
				return refreshCatalog();
			}

		} catch (FileNotFoundException e) {
			// Then we refresh the catalog from Zuora
			return refreshCatalog();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		this.array = true;
		return output(groups);
	}

	/**
	 * Read the Product Catalog Data from Zuora and saves it to a JSON cache
	 * stored on the server to reduce load times. This method must be called
	 * each time the Product Catalog is changed in Zuora to ensure the catalog
	 * cache is not out of date for the user.
	 * 
	 * @return A model containing all necessary information needed to display
	 *         the products and rate plans in the product catalog.
	 */
	public String refreshCatalog() {
		List<CatalogGroup> groups = null;
		try {
			// Retrieve the catalog from z-java and refresh the cache
			CatalogHelper catalogHelper=null;
			try {
				catalogHelper = new CatalogHelper();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catalogHelper.refreshCache();

			// Get the vector from catalog
			groups = catalogHelper.getCatalogGroups();

		} catch (Exception e) {
			e.printStackTrace();
		}

		this.array = true;
		return output(groups);
	}

	/**
	 * Create a new cart instance in the current HttpSession.
	 */
	public String emptyCart(HttpServletRequest request) {
		// Set a new cart in the session
		HttpSession session = request.getSession();
		session.setAttribute("cart", new CartHelper());
		return output(session.getAttribute("cart"));
	}
	
	/**
	 * Check if the user is logged in (session)
	 */
	public String isUserLoggedIn(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("email") != null && !session.getAttribute("email").equals("")) {
			this.array = false;
			return output(true);
		} else {
			errors.add("SESSION_NOT_SET");
			return output(null);
		}
	}
	
	
	/**
	 * Update a contact information.
	 */
	public String updateContact(HttpServletRequest request) {
		
		// Get the account name from the session
		HttpSession session = request.getSession();
		String accountName = (String) session.getAttribute("email");
		
		// Create a new summary contact based on the query
		SummaryContact update = new SummaryContact();
		update.setFirstName(request.getParameter("firstName"));
		update.setLastName(request.getParameter("lastName"));
		update.setAddress1(request.getParameter("address"));
		update.setAddress2(""); // TODO
		update.setCity(request.getParameter("city"));
		update.setPostalCode(request.getParameter("postalCode"));
		update.setState(request.getParameter("state"));
		update.setCountry(request.getParameter("country"));
		
		// Update the contact
		ResponseUpdateContact conResult=null;
		try {
			conResult = new AccountManager().updateContact(accountName, update);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (conResult.isSuccess()) {
			Map<String, Object> mapOutput = new HashMap<String, Object>();
			mapOutput.put("Success", true);
			
			return output(mapOutput);
		}
		
		errors.add("UPDATE_FAILED");
		return output(null);
	}
		
	/**
	 * Return the latest subscription for the user logged in.
	 */
	public String getLatestSubscription(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		AmenderSubscription subscription=null;
		try {
			subscription = new SubscriptionManager().getCurrentSubscription(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (subscription == null) {
			errors.add("SUBSCRIPTION_QUERY_FAILED");
			return output(null);
		}
		
		return output(subscription);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String getCompleteSummary(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		SummaryAccount summary=null;
		try {
			summary = new AccountManager().getCompleteDetail(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output(summary);
	}
	
	/**
	 * Add a Rate Plan to the user's subscription
	 */
	public String addRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// TODO
		return output(null);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String previewAddRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// TODO
		return output(null);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String removeRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// TODO
		return output(null);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String previewRemoveRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// TODO
		return output(null);
	}

	/**
	 * Return the current cart instance from the HttpSession.
	 */
	public String getInitialCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("cart") == null) {
			emptyCart(request);
		}
		return output(session.getAttribute("cart"));
	}

	/**
	 * Remove an item from the current cart in session.
	 */
	public String removeItemFromCart(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		int itemId = 0;
		
		if (request.getParameter("itemId") != null) {
			itemId = Integer.parseInt(request.getParameter("itemId"));
		} else {
			errors.add("Item Id not specified.");
			return output(null);
		}
		
		if (session.getAttribute("cart") != null) {
			boolean removed = ((CartHelper) session.getAttribute("cart")).removeCartItem(itemId);
			if (!removed) {
				errors.add("Item no longer exists.");
			}
		} else {
			errors.add("Cart has not been set up.");
			return output(null);
		}
		return output(session.getAttribute("cart"));
	}
	
	/**
	 * Add an item in the current cart.
	 */
	public String addItemToCart(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("cart") == null) {
			emptyCart(request);
		}
		
		// Check if the Rate Plan Id exists in the request
		if (request.getParameter("ratePlanId") == null) {
			errors.add("Incorrect or missing Rate Plan ID in the request.");
			return output(null);
		}
		String ratePlanId =request.getParameter("ratePlanId");
		
		// Set up the quantity (default = 1)
		String quantity = "null	";
		if (request.getParameter("quantity") != null && !request.getParameter("quantity").isEmpty()) {
			quantity = request.getParameter("quantity");
		}
		
		if (session.getAttribute("cart") != null) {
			((CartHelper) session.getAttribute("cart")).addCartItem(ratePlanId, quantity);
			
		} else {
			errors.add("Cart has not been set up.");
			return output(null);
		}
		
		return output(session.getAttribute("cart"));
	}
	
	/**
	 * Preview current cart in session.
	 */
	public String previewCurrentCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		if (session.getAttribute("cart") != null) {
			CartHelper cartHelper = (CartHelper) session.getAttribute("cart");
			SubscriptionManager subscriptionManager=null;
			try {
				subscriptionManager = new SubscriptionManager();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.array = false;
			try {
				BigDecimal amount = subscriptionManager.previewCurrentCart(cartHelper);
				if (amount != null) {
					return output(amount.toPlainString());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			errors.add("Cart has not been set up.");
			return output(null);
		}
		errors.add("Something bad occurred during the preview.");
		return output(null);
	}
	
	/**
	 * Return a new iframe URL containing the hosted page (for card information) URL.
	 */
	public String getNewIframeSrc() {
		String iframeUrl=null;
		try {
			iframeUrl = new PaymentManager().getNewAccountUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.array = false;
		return output(iframeUrl);
	}
	
	/**
	 * Return a new iframe URL containing the hosted page (for card information) URL.
	 */
	public String getExistingIframeSrc(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String iframeUrl=null;
		try {
			iframeUrl = new PaymentManager().getExistingIframeSrc(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.array = false;
		return output(iframeUrl);
	}
	
	/**
	 * Check if the email address is available in Zuora tenant.
	 */
	public String checkEmailAvailability(HttpServletRequest request) {
		String uEmail = request.getParameter("uEmail");
		boolean available=false;
		try {
			available = new AccountManager().checkEmailAvailability(uEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.array = false;
		return output(available);
	}
	
	/**
	 * This function allows the user to subscribe with the current cart, checking out
	 * using an iFrame informations from Zuora (Hosted Payment).
	 */
	public String subscribeWithCurrentCart(HttpServletRequest request) {
		// Get information from the POST request
		String userEmail = request.getParameter("userEmail");
		String pmId = request.getParameter("pmId");
		HttpSession session = request.getSession();
		CartHelper cartHelper = (CartHelper) session.getAttribute("cart");
		
		Map<String, Object> data=null;
		try {
			data = new SubscriptionManager().subscribeWithCurrentCart(userEmail, pmId, cartHelper);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (data.containsKey("error")) {
			String msgError = (String) data.get("error");
			
			if (msgError.equalsIgnoreCase("DUPLICATE_EMAIL")) {
				this.errors.add("This email address is already in use. Please choose another and re-submit");
				return output(null);
				
			} else if (msgError.equalsIgnoreCase("INVALID_PMID")) {
				this.errors.add("The payment ID submitted is invalid. Please try again.");
				return output(null);
				
			} else if (msgError.equalsIgnoreCase("A_PROBLEM_OCCURED")) {
				this.errors.add("There was an error processing this transaction. Please try again.");
				return output(null);
				
			}
		}
		
		// Put the return (user e-mail address) in the session
		session.setAttribute("email", userEmail);
		
		// Get the response object (from stub)
		SubscribeResult[] resp = (SubscribeResult[]) data.get("success");
		
		// TODO (add array = false?)
		return output(resp);
	}

	/**
	 * This function returns the final JSON output annotated with some security
	 * checks in a Map class.
	 */
	private String output(Object msg) {
		Writer strWriter = new StringWriter();
		try {
			// Prepare final Map output (to be parsed in JSON)
			Map<String, Object> map = new HashMap<String, Object>();

			// Check if some errors occurred
			if (errors.size() > 0) {
				map.put("login", false);
				map.put("success", false);
				map.put("msg", errors);
			} else {
				map.put("login", false);
				map.put("success", true);
				
				// This part is just to have an array in any case (because of the client)
				if (msg != null) {
					if (array) {
						map.put("msg", msg);
					}
					else {
						List<Object> msgs = new ArrayList<Object>();
						msgs.add(msg);
						map.put("msg", msgs);
					}
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return strWriter.toString();
	}

	/**
	 * This function allows the server to build a cache of the product catalog
	 * query from Zuora, reducing latency in displaying the catalog.
	 */
	private void writeCatalogCache(String catalogJson) {
		BufferedWriter bufferedWriter = null;
		try {
			// Construct the BufferedWriter object
			bufferedWriter = new BufferedWriter(new FileWriter(CACHE_FILENAME));
			// Write the JSON string to the output stream
			bufferedWriter.write(catalogJson);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Close the BufferedWriter
			try {
				if (bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
	
}
