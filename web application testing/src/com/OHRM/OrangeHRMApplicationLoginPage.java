package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationLoginPage {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
ChromeDriver driver;
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

		driver.quit();

		}

		}


		