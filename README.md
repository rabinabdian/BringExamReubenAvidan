**Instructions on how to install/build/run the project**
To start automating with Selenium Web-driver, below mentioned are the pre requisites:

Mozilla firefox browser, with Firebug & Firepath: The procedure as follows: This is used to view the source code of the application, and Take X Path for automation, Firepath is an add on to the Firefox browser, and an extension to the Firebug.

Firebug:
1. Open “Google” on Mozilla firefox & search “Firebug” 
2. Click on “addons.mozilla.org” 3. Click on “Add to firefox” button 4. Click on “Install Now”

Firepath:
   Same procedure as Firebug

2. Download Eclipse: I think Neon is the latest version currently, you can find the latest version on Google search

3. Selenium JARS: Go to URL: “seleniumhq.org”, and in the path “Download” , click on the download of latest Selenium Jars.

4. Apart from this download JDK & JRE before everything / if you are programming on Python, download the relevant things

P.S If there is any incompatibility between Firefox version, and JARS learn about “gekodriver”.

**Implementation approach**
Page Object Model (POM) & Page Factory
Page Object Model (POM) is a design pattern, popularly used in test automation that creates Object Repository for web UI elements. The advantage of the model is that it reduces code duplication and improves test maintenance.
Advantages of POM:
Page Object Design Pattern says operations and flows in the UI should be separated from verification. This concept makes our code cleaner and easy to understand.
The Second benefit is the object repository is independent of test cases, so we can use the same object repository for a different purpose with different tools. For example, we can integrate Page Object Model in Selenium with TestNG/JUnit for functional Testing and at the same time with JBehave/Cucumber for acceptance testing.
Code becomes less and optimized because of the reusable page methods in the POM classes.
Methods get more realistic names which can be easily mapped with the operation happening in UI. i.e. if after clicking on the button we land on the home page, the method name will be like 'gotoHomePage()'.
Under this model, for each web page in the application, there should be a corresponding Page Class. This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements. Name of these methods should be given as per the task they are performing, i.e., if a loader is waiting for the payment gateway to appear, POM method name can be waitForPaymentScreenDisplay().

**Challenges**
Handle synchronizations 
Dom manipulations
Pop up and Alert Handling

**Improvement implementation**
Refactoring code to increase code duplications 
Using explicit wait for all cases
Functional programing for all classes such as Login class that done for example 