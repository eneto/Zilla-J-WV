package com.zuora.zilla.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zuora.api.*;
import com.zuora.api.object.*;
import com.zuora.zilla.controller.*;
import com.zuora.zilla.model.*;
import com.zuora.zilla.util.*;

/**
 * This is the main controller of the backend application for Zuora Java API Client.
 * @author Mickael Pham <mickael.pham@zuora.com>
 */
@WebServlet("/backend")
public class BackendServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		// Final output to be written
		String output = null;
		//System.out.println("Hit backend servlet: type "+type);
		// Redirect to the correct action
		if (request.getParameter("type") != null) {
			// Request redirect type
			// Started the switch
			// Get the main back end application
			App backend = new App();
			if (type.equalsIgnoreCase("AddItemToCart")) {
				output = backend.addItemToCart(request);
				
			} else if (type.equalsIgnoreCase("ReadUpgradeDowngrade")) {
				output = backend.getUpgradeDowngrade(request);
				
			} else if (type.equalsIgnoreCase("CheckEmailAvailability")) {
				output = backend.checkEmailAvailability(request);
				
			} else if (type.equalsIgnoreCase("EmptyCart")) {
				output = backend.emptyCart(request);
				
			} else if (type.equalsIgnoreCase("GetExistingIframeSrc")) {
				output = backend.getExistingIframeSrc(request);
				
			} else if (type.equalsIgnoreCase("GetInitialCart")) {
				output = backend.getInitialCart(request);
				
			} else if (type.equalsIgnoreCase("GetLatestSubscription")) {
				output = backend.getLatestSubscription(request);
				
			} else if (type.equalsIgnoreCase("GetNewIframeSrc")) {
				output = backend.getNewIframeSrc();
				
			} else if (type.equalsIgnoreCase("IsUserLoggedIn")) {
				output = backend.isUserLoggedIn(request);
				
			} else if (type.equalsIgnoreCase("PreviewCurrentCart")) {
				output = backend.previewCurrentCart(request);
				
			} else if (type.equalsIgnoreCase("PreviewAddRatePlan")) {
				output = backend.previewAddRatePlan(request);
				
			} else if (type.equalsIgnoreCase("AddRatePlan")) {
				output = backend.addRatePlan(request);
				
			} else if (type.equalsIgnoreCase("PreviewRemoveRatePlan")) {
				output = backend.previewRemoveRatePlan(request);
				
			} else if (type.equalsIgnoreCase("RemoveRatePlan")) {
				output = backend.removeRatePlan(request);	
				
			} else if (type.equalsIgnoreCase("ReadCatalog")) {
				output = backend.readCatalog();
				
			} else if (type.equalsIgnoreCase("RefreshCatalog")) {
				output = backend.refreshCatalog();
				
			} else if (type.equalsIgnoreCase("RemoveItemFromCart")) {
				output = backend.removeItemFromCart(request);
				
			} else if (type.equalsIgnoreCase("RemovePaymentMethod")) {
				output = backend.removePaymentMethod(request);
				
			} else if (type.equalsIgnoreCase("SubscribeWithCurrentCart")) {
				output = backend.subscribeWithCurrentCart(request);
				
			} else if (type.equalsIgnoreCase("UpdateContact")) {
				output = backend.updateContact(request);
				
			} else if (type.equalsIgnoreCase("ChangeDefaultPaymentMethod")) {
				output = backend.changeDefaultPaymentMethod(request);	
				
			} else if (type.equalsIgnoreCase("DowngradeTo")) {
				output = backend.downgradeOrUpgradeTo(request, false);
				
			} else if (type.equalsIgnoreCase("UpgradeTo")) {
				output = backend.downgradeOrUpgradeTo(request, true);
				
			} else if (type.equalsIgnoreCase("GetCompleteSummary")) {
				output = backend.getCompleteSummary(request);
				
			} else if (type.equalsIgnoreCase("GetPaymentMethodSummary")) {
				output = backend.getPaymentMethodSummary(request);
			} else if (type.equalsIgnoreCase("GetProductByUpgradePath")) {
				output = backend.getProductByUpgradePath(request);
			} else if (type.equalsIgnoreCase("PreviewProductDetail")) {
				output = backend.previewProductDetail(request);
			} else if (type.equalsIgnoreCase("GetLastPdf")) {
				HttpSession session = request.getSession();
				String email = (String) session.getAttribute("username");
				String body=null;
				try {
					body = new InvoiceManager().getLastInvoicePdf(email);
				} catch (Exception e) {
					e.printStackTrace();
				}
				response.setContentType("application/pdf");
				response.setHeader("Content-disposition",
						"attachment; filename=latest.pdf");
				ServletOutputStream pdfOutput = response.getOutputStream();
				if(body!=null){
					pdfOutput.write(ZuoraUtility.decodeBase64(body));
				} else {
					// TODO Handle errors when PDF is not found due to logged out user, no generated invoice, etc.
				}
//				out.print(ZuoraUtility.decodeBase64(body));
				return;
			} else if (type.equalsIgnoreCase("Logout")) {
				request.getSession().invalidate();
				response.sendRedirect("login.html");
				
			} else {
				output = "The action selected ('" + type +"') is not supported by the backend.";
			}
			// Get the output writer
			PrintWriter out = response.getWriter();
			// Write the output in the HttpServletResponse
			out.print(output);
		} else {
			// Get the output writer
			PrintWriter out = response.getWriter();
			out.println("The parameter 'type' is not set. No action selected.");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
