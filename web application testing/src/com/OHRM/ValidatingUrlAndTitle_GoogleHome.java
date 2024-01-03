package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAndTitle_GoogleHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver chromeBrowser;
		String applicationUrlAddress="http://google.com";

		System.setProperty("webdriver.chrome.driver", "./WebDriverFiles/chromedriver.exe");
		chromeBrowser= new ChromeDriver();

		chromeBrowser.get(applicationUrlAddress);

		// Expected Title of the Google Home page - should be Google
		String expected_GoogleHomePageTitle="Google";
		System.out.println(" The Expected title of the Google Home Page is :- "+expected_GoogleHomePageTitle);

		// identifying the title of the current webPage
		String actual_GoogleHomePageTitle=chromeBrowser.getTitle();
		System.out.println(" The actual title of the Google Home Page is :- "+actual_GoogleHomePageTitle);

		if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
		{
		System.out.println(" Title of the Google Home Page Matched - PASS ");
		}
		else
		{
		System.out.println(" Title of the Google Home Page NOT matched - FAIL");
		}
		chromeBrowser.quit();


	}

	}


		

		

	


