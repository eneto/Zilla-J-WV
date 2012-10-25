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

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.StdSerializerProvider;

import com.zuora.api.SubscribeResult;
import com.zuora.zilla.util.NullSerializer;
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
		CatalogModel data = null;
		try {
			// Retrieve the catalog from z-java and refresh the cache
			data = Catalog.readCatalog();
		} catch (Exception e) {
			data = new CatalogModel();
			data.setError(e.getMessage());
			data.setSuccess(true);			
		}

		return output(data);
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
		CatalogModel data = null;
		try {
			// Retrieve the catalog from z-java and refresh the cache
			data = Catalog.refreshCatalog();
		} catch (Exception e) {
			data = new CatalogModel();
			data.setError(e.getMessage());
			data.setSuccess(true);
		}

		return output(data);
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
		ResponseAction resp = new ResponseAction();
		try{
			if (session.getAttribute("username") != null && !session.getAttribute("username").equals("")) {
				resp.setSuccess(true);
			} else {
				resp.setSuccess(false);
			}
		} catch (Exception e){
			resp.setSuccess(false);
			resp.setError(e.getMessage());
		}
		return output(resp);
	}
	
	
	/**
	 * Update a contact information.
	 */
	public String updateContact(HttpServletRequest request) {
		//TODO This belongs in AccountManager 
		
		// Get the account name from the session
		HttpSession session = request.getSession();
		String accountName = (String) session.getAttribute("username");
		
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
		ResponseAction conResult=null;
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
		
		return output(null);
	}
		
	/**
	 * Return the latest subscription for the user logged in.
	 */
	public String getLatestSubscription(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("username");
		AmenderSubscription subscription=null;
		try {
			subscription = new SubscriptionManager().getCurrentSubscription(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (subscription == null) {
			//TODO This should have a response code that tells you why it failed
			return output(null);
		}
		
		return output(subscription);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String getCompleteSummary(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("username");
		SummaryAccount summary=null;
		try {
			summary = new AccountManager().getCompleteDetail(email);
		} catch (Exception e) {
			summary.setSuccess(false);
			summary.setError(e.getMessage());
		}
		return output(summary);
	}

	/**
	 * Return payment method summary for the user with the given account name
	 */
	public String getPaymentMethodSummary(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("username");
		SummaryAccount summary=null;
		try {
			summary = new AccountManager().getPaymentMethodDetail(email);
		} catch (Exception e) {
			summary.setSuccess(false);
			summary.setError(e.getMessage());
		}
		return output(summary);
	}
	
	/**
	 * Add a Rate Plan to the user's subscription
	 */
	public String addRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AmenderResult amRes = null;
		String username = (String) session.getAttribute("username");
		String ratePlanId =request.getParameter("itemId");
		String qty =request.getParameter("itemQty");
		BigDecimal bdQty = null;
		if(!qty.equals("null")){
			try{
				bdQty = new BigDecimal(qty);
			} catch (Exception e){
				amRes = new AmenderResult();
				amRes.setSuccess(false);
				amRes.setError("INVALID_QTY");
				return output(amRes);
			}
		}
		try{
			Amender amender = new Amender();
			amRes = amender.addRatePlan(username, ratePlanId, bdQty, false);			
		} catch (Exception e){
			amRes = new AmenderResult();
			amRes.setSuccess(false);
			amRes.setError(e.getMessage());
		}
		return output(amRes);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String previewAddRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AmenderResult amRes = null;
		String username = (String) session.getAttribute("username");
		String ratePlanId =request.getParameter("itemId");
		String qty =request.getParameter("itemQty");
		BigDecimal bdQty = null;
		if(!qty.equals("null")){
			try{
				bdQty = new BigDecimal(qty);
			} catch (Exception e){
				amRes = new AmenderResult();
				amRes.setSuccess(false);
				amRes.setError("INVALID_QTY");
				return output(amRes);
			}
		}
		try{
			Amender amender = new Amender();
			amRes = amender.addRatePlan(username, ratePlanId, bdQty, true);			
		} catch (Exception e){
			amRes = new AmenderResult();
			amRes.setSuccess(false);
			amRes.setError(e.getMessage());
		}
		return output(amRes);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String removeRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String ratePlanId =request.getParameter("itemId");
		AmenderResult amRes = null;
		try{
			Amender amender = new Amender();
			amRes = amender.removeRatePlan(username, ratePlanId, false);
		} catch (Exception e){
			amRes = new AmenderResult();
			amRes.setSuccess(false);
			amRes.setError(e.getMessage());
		}
		return output(amRes);
	}
	
	/**
	 * Return complete summary for the given user's email
	 */
	public String previewRemoveRatePlan(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String ratePlanId =request.getParameter("itemId");
		AmenderResult amRes = null;
		try{
			Amender amender = new Amender();
			amRes = amender.removeRatePlan(username, ratePlanId, true);
		} catch (Exception e){
			amRes = new AmenderResult();
			amRes.setSuccess(false);
			amRes.setError(e.getMessage());
		}
		return output(amRes);
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
			//TODO errors.add("Item Id not specified.");
			return output(null);
		}
		
		if (session.getAttribute("cart") != null) {
			boolean removed = ((CartHelper) session.getAttribute("cart")).removeCartItem(itemId);
			if (!removed) {
				//TODO errors.add("Item no longer exists.");
			}
		} else {
			//TODO errors.add("Cart has not been set up.");
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
			//TODO errors.add("Incorrect or missing Rate Plan ID in the request.");
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
			//TODO errors.add("Cart has not been set up.");
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
				SubscribePreview preview = subscriptionManager.previewCurrentCart(cartHelper);
				return output(preview);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return output(null);
		}
		return output(null);
	}
	
	/**
	 * Return a new iframe URL containing the hosted page (for card information) URL.
	 */
	public String getNewIframeSrc() {
		ResponseAction iframeResp=null;
		try {
			iframeResp = new PaymentManager().getNewAccountUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output(iframeResp);
	}
	
	/**
	 * Return a new iframe URL containing the hosted page (for card information) URL.
	 */
	public String getExistingIframeSrc(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("username");
		ResponseAction iframeResp=null;
		try {
			iframeResp = new PaymentManager().getExistingIframeSrc(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.array = false;
		
		return output(iframeResp);
	}
	
	/**
	 * Remove Payment Method.
	 */
	public String removePaymentMethod(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String accountName = (String) session.getAttribute("username");
		String pmId = (String) request.getParameter("pmId");
		ResponseAction resp=null;
		try {
			resp = new PaymentManager().removePaymentMethod(accountName, pmId);
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
		}
		return output(resp);
	}

	/**
	 * Change Default Payment Method.
	 */
	public String changeDefaultPaymentMethod(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String accountName = (String) session.getAttribute("username");
		String pmId = (String) request.getParameter("pmId");
		ResponseAction resp=null;
		try {
			resp = new PaymentManager().changePaymentMethod(accountName, pmId);
		} catch (Exception e) {
			resp.setSuccess(false);
			resp.setError(e.getMessage());
		}
		return output(resp);
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
		
		ResponseSubscribe data=null;
		try {
			data = new SubscriptionManager().subscribeWithCurrentCart(userEmail, pmId, cartHelper);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!data.isSuccess()) {
			String msgError = (String) data.getError();
			
			if (msgError.equalsIgnoreCase("DUPLICATE_EMAIL")) {
				data.setError("This email address is already in use. Please choose another and re-submit");
				data.setSuccess(false);
				return output(data);				
			} else if (msgError.equalsIgnoreCase("INVALID_PMID")) {
				data.setError("The payment ID submitted is invalid. Please try again.");
				data.setSuccess(false);
				return output(data);	
			} else {
				data.setError(msgError);
				data.setSuccess(false);
				return output(data);
				
			}
		}
		
		// Put the return (user e-mail address) in the session
		session.setAttribute("username", userEmail);

		data.setSuccess(true);
		return output(data);
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

			//Initialize Object Mapper for JSON encoding
			ObjectMapper mapper = new ObjectMapper();
			
			//Suppress 'Null' values in output
			StdSerializerProvider sp = new StdSerializerProvider();
			sp.setNullValueSerializer(new NullSerializer());
			mapper.setSerializerProvider(sp);

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
			// Parse in JSON
			mapper.writeValue(strWriter, map);
			strWriter.flush();
			strWriter.close();

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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


	public String getUpgradeDowngrade(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String accountName = (String) session.getAttribute("username");
		if (accountName == null) {
			return output("Error: username not set in session");
		}
		UpgradeManager manager = new UpgradeManager(accountName);
		
		// Get the Catalog Rate Plan from the list of downgrade plan
		List<CatalogRatePlan> lowerRatePlan = new ArrayList<CatalogRatePlan>();
		for (String prpId : manager.getLowerPrpId()) {
			lowerRatePlan.add(Catalog.getRatePlan(prpId));
		}
		
		// Same with the list of upgrade plans
		List<CatalogRatePlan> upperRatePlan = new ArrayList<CatalogRatePlan>();
		for (String prpId : manager.getUpperPrpId()) {
			upperRatePlan.add(Catalog.getRatePlan(prpId));
		}
		
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("lowerRatePlan", lowerRatePlan);
		res.put("upperRatePlan", upperRatePlan);
		res.put("currentRatePlan", Catalog.getRatePlan(manager.getCurrentPrpId()));
		
		return output(res);
	}
}
