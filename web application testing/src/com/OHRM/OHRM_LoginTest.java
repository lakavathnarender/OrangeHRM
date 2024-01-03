package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);

		// Validating OrangeHRM Application LogIN Page Title

		// Expected Title of the OrangeHRM Application LogIn Page should be - OrangeHRM
		String expected_OrangeHRMApplicatinLogInPageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRM Applicatin LogIn Page is :- "+expected_OrangeHRMApplicatinLogInPageTitle);

		// OPeration on the WebPage
		String actual_OrangeHRMApplicatinLogInPageTitle=driver.getTitle();
		System.out.println(" The Actual Title of the OrangeHRM Applicatin LogIn Page is :- "+actual_OrangeHRMApplicatinLogInPageTitle);

		if(actual_OrangeHRMApplicatinLogInPageTitle.equals(expected_OrangeHRMApplicatinLogInPageTitle))
		{
		System.out.println(" OrangeHRM Application LogIn Page Title Matched - PASS ");
		}
		else
		{
		System.out.println(" OrangeHRM Application LogIn Page Title NOT Matched - FAIL  ");
		}

		System.out.println();
		// validating Url Address

		// Expected - OrangeHRM Application Url address should have a text orangehrm-4.2.0.1
		String expected_OrangeHRMApplicationUrlAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected Url address of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationUrlAddress);

		String actual_OrangeHRMApplicationUrlAddress=driver.getCurrentUrl();
		System.out.println(" The Actual Url address of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationUrlAddress);

		if(actual_OrangeHRMApplicationUrlAddress.contains(expected_OrangeHRMApplicationUrlAddress))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address Matched - PASS ");
		}
		else
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address NOT Matched - FAIL ");
		}


		// Verifying and Validating UserName (Element)

		// the element of the WebPage is identified based on its properties

		// Properties of the elements are identified by inspecting it - right click on the
		 //    element under test- select inspect option

		// Right click on the Highlighted source code - select Copy - select Outer HTML

		// <input name="txtUsername" id="txtUsername" type="text">

		// The properties of the element always contains attributes and their corresponding values

		/*


		<input name="txtUsername" id="txtUsername" type="text">

		 < - tag
		<input - input tag

		 name - attribute
		 txtUsername - value

		 id - attribute / locator
		 txtUsername - value / selector

		 type - attribute
		 text - value
		 
		*/

		// The available properties of the inspected element - we should look for an existence
		// of locator of the selenium webDriver
		// Properties contains Locators and their corresponding values

		// id - attribute / locator
		// txtUsername - value / selector

		// 1. Identifying the element uniquely out of other elements of the webPage
		// 2. Performing the Operation on the Element

		driver.findElement(By.id("txtUsername")).sendKeys("srini");

		// Password element properties
		// <input name="txtPassword"  autocomplete="off" type="password">

		// name - locator
		// txtPassword - selector


		// id="txtPassword"
		driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

		// <input type="submit"  class="button"  value="LOGIN">

		driver.findElement(By.className("button")).click();

		driver.quit();



		}

		}











	


