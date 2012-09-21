===========================
Zilla Code Libraries (Java)
===========================

The Zilla project is set of code libraries driven by Zuora professional services that implement the most common use cases associated with building a B2C web storefront that integrates with the Zuora platform.

Installation & Configuration
----------------------------

	1.)	Git clone the latest version of this repo into a Java workspace.
	2.)	Import the project into Eclipse
	3.)	Set up a Hosted Payments Page in Zuora to collect credit card information.
		A.)	In your Zuora tenant, navigate to Settings > Z-Payments Settings >  Set Up Hosted Pages. 
		B.)	Click create new hosted page.
		C.)	Provide a name for your page.
		D.)	Set the Hosted Domain field to the root directory of the location at which your store is hosted. This should begin with “http://” or “https://”. For example, if your store is hosted at “http://zillacloudcompany.com/store”, your Hosted Domain would be “http://zillacloudcompany.com”
		E.)	Set the Hosted Domain field to the location of the included “callback.jsp” file. For example, if the callback page is hosted at “http://zillacloudcompany.com/store/callback.jsp”, your Hosted Domain would be “/store/callback.jsp”
		F.)	On the page component, check the Enabled button for all fields except Email Address.
		G.)	To match the style of the provided subscribe form, copy the CSS from HPMStyle.css into the CSS window on the HPM configuration page.
	4.)	Navigate to src/config.properties, and use a text editor to modify the file with the following settings:
		A.)	Set username, password, and endpoint for Zuora tenant. Make sure this is account is a specially designated API-only account whose password will not change, as this will disable the integration.
		B.)	Set Page ID, Tenant ID, API Security Key and App URL for Hosted Payments Page configured in step 3. The API Security Key and Page ID can be access from the Hosted Payments Page List, and the Tenant ID can be access from Administration Settings. If you are using a production Zuora instance, the app URL will be https://www.zuora.com For a sandbox tenant, it will be https://apisandbox.zuora.com
		C.)	If integrating with Salesforce.com, set the makeSfdcAccount flag to true, and enter Salesforce Username, Password and Security token. Make sure this is account is a specially designated API account whose password and security token will not change. If testing with a SFDC sandbox, modify the endpoint to use test instead of login.
	5.) Run the ZApitest JUnit test to validate that a connection can be established to Zuora.
	6.) If using the front-end component, deploy the project and visit the directory. The supported use cases are listed below.


*** NOTE 1 *** 
To reduce load times and traffic on Zuora servers, the Product Catalog is cached locally the first time it is loaded. To manually refresh the catalog, visit <Hosted Domain>/admin.html and use the Refresh Catalog tool to trigger the refresh process. This process will also run the first time you visit the Select Products page without refreshing from Zuora first.
**************

*** NOTE 2 ***
By default, a list of charges and pricing is not displayed to the customer on the product select page. If pricing information is to be shown on the product select page, prices can be added to the description within the Zuora catalog in your tenant. Product descriptions and rate plan descriptions will each be displayed on the product select page, and the account view page. HTML is supported in these description fields as well, including bold and italics, lists, line breaks, images, etc.
**************


Supported Use Cases
-------------------

The four primary functions of a B2C web portal are Product Selector, Subscribe, Account Detail, and Amendments.

	1.) Product Selector
		1.)	Show Product Catalog from Zuora.
		2.)	User can add an item from the catalog to their cart. For catalog items that are billed by quantity, a quantity can be entered before adding the item.
		3.)	User can remove an item from their cart.
		4.)	User can clear their current cart.
		5.)	After selecting products, user clicks a button to continue to the Subscribe page.

	2.) Subscribe
		1.)	User can preview invoice amount of their selected products.
		2.)	User enters their contact information.
		3.)	User clicks subscribe.
		a.	If there is an input error, User is asked to fix it and resubmit their information.
		4.)	User's account is created and they are logged in and redirected to the account detail page.

	3.) Account Detail
		1.)	User arrives at this page through login, or immediately after subscribing.
		2.)	User can view Account information, including:
			a.	Account name
			b.	Last payment date and amount
			c.	Last invoice date
			d.	Current account balance
			e.	The PDF version of their latest invoice
		3.)	User can manage the credit cards associated with this account.
			a.	Display Credit Card holder name, Masked Credit Card number, and Expiration date of each card on file
			b.	Add a new credit card, card will be validated as soon as it's submitted
			c.	Switch to a different credit card
			d.	Remove an existing credit card
		4.)	User can manage Contact information.
			a.	View Contact details associated with the account
			b.	Update Contact details
		5.)	User can view subscription information.
			a.	View current subscription, including expiration dates for plans that will be removed in the future
			b.	User can click a button to continue to the Amendments page

	4.) Amend
		1.)	Display Product Catalog and user's current subscription.
		2.)	User can select a product from the catalog to add to their current subscription.
		3.)	User can preview the amount of the additional charge they will incur before adding the new product to their subscription.
		4.)	User can remove a product from their subscription effective at the end of the bill cycle.

 
Design Structure
----------------
 
The sample implementation is made up of four layers:

	https://dl.dropbox.com/u/68657417/StructureDiagram.png

	1.) User-Facing HTML
		The files that an end user will see when using the store contained in the front-end user-facing HTML files. These pages use Javascript and AJAX to collect information and trigger events from the backend based on different user actions, by making GET calls to a backend URL. For each call, a listener is set up to capture the response from the response, which should contain all the data necessary to re-render components of the page.
	
	2.) REST-Based PHP Event Dispatch Layer
		In the backend folder is a file called index.php. Calls are made to this file from the front end to perform various actions. This page is used by accessing it via GET request with a type of action. For example, to retrieve the product catalog, you might call backend/index.php?type=GetProductCatalog. Based on the type passed, a different method of index.php will be called. This method will usually contain a call to one of the specialized PHP controllers to gather the information or perform the action requested. This controller will return a response value that indicates the success of the performed action. At the end of the execution of index.php, the data of the response is encoded in JSON and passed back to the HTML page that called it to re-render the page based on the result.

	3.) Use Case Specialized PHP Controllers
		These six classes contain methods to handle a number of common business cases necessary to integrate a B2C commerce platform with Zuora. These classes contain libraries of static methods that interface with Zuora, and perform other backend functions. These classes each return a response denoting the success of the operation, or an error description if something goes wrong.
		
		API Documentation for these classes is available at:
		http://zillacloudcompany.com/api-doc/annotated.html
	
	4.) Zuora/SFDC API Wrapper Classes
		Whenever one of the specialized controls needs to access data from Zuora or Salesforce, methods from the zApi and sApi classes are called. The credentials to log in and use these services should be specified in the configuration file upon installation.
	
		The sApi class is not a full extension of all Salesforce API services, but rather a set of methods that are useful when managing a B2C storefront with Zuora. The only integration requirement is that whenever a billing account is created in Zuora, a callout is made to create a customer account in Salesforce and retrieving the CRM Id, so that the CRM Id can be associated with the new billing account. After this step, all records relating to that billing account can be synced to SFDC using Zuora’s native integration and no additional integration is necessary.
		
		The zApi class spans the full range of API calls supported by Zuora, including create, query, update, delete, amend, and subscribe. Each of these methods will take in and return a PHP object that directly correlates to the XML requests and responses associated with their soap calls. Details of all of these objects and fields are described in the Zuora API documentation, located at http://knowledgecenter.zuora.com/D_Zuora_API_Developers_Guide. 

