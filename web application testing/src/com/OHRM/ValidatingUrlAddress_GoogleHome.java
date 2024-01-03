package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAddress_GoogleHome {
public static void main(String[] args) {
	ChromeDriver chromeBrowser;
	String applicationUrlAddress="http://google.com";

	System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
	chromeBrowser= new ChromeDriver();

	chromeBrowser.get(applicationUrlAddress);

	// identifying the title of the current webPage
	String actual_GoogleHomePageTitle=chromeBrowser.getTitle();
	System.out.println(" The actual title of the Google Home Page is :- "+actual_GoogleHomePageTitle);

	// expected UrlAddress of the google home page should have google.com
	String expected_GoogleHomePageUrlAddress="google.com";
	System.out.println(" The expected Url address of the Google Home Page is :- "+expected_GoogleHomePageUrlAddress);

	// Identifying the url address of the Current WebPage
	String actual_GoogleHomePageUrlAddress=chromeBrowser.getCurrentUrl();
	System.out.println(" The Actual Url Address of the Google HomePage is :- "+actual_GoogleHomePageUrlAddress);

	if(actual_GoogleHomePageUrlAddress.contains(expected_GoogleHomePageUrlAddress))
	{
	System.out.println(" Google HomePage  Url Address matched - PASS ");
	}
	else
	{
	System.out.println(" Google HomePage Url Address NOT matched - FAIL ");
	}

	chromeBrowser.quit();
}
}


	

	




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


