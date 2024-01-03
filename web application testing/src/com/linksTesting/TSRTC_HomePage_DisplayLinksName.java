package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_DisplayLinksName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","WebDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String UrlAddress="https://www.tsrtc.telangana.gov.in/";
		driver.get(UrlAddress);
		
		System.out.println("***********Chrome Browser LaunchedSuccessfully");
		
		//Navigating to orangeHRM Application Url Address
		driver.get(UrlAddress);
		System.out.println(" Navigated to TSRTC Application ");
		
		
		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		// <a href="#" onclick="populateSearch('5231', 'Hyderabad', '1386430615487', 'Bangalore');">Hyderabad - Bangalore</a>
		
		// <input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
		// <input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		/*
		By busOnContractProperty=By.linkText("Bus on Contract");
		WebElement busOnContract=driver.findElement(busOnContractProperty);
		busOnContract.click();
		*/

		By linksProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);

		// System.out.println(tsrtc_HomePageLinks);

		int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
		System.out.println(" The number of links on the TSRTC Application HomePage is :- "+tsrtc_HomePageLinksCount);


		for(int index=0;index<tsrtc_HomePageLinksCount;index++)
		{

		String linkName=tsrtc_HomePageLinks.get(index).getText();
		System.out.println(index+" "+linkName);
		}



		driver.quit();

		}

		}





		
		
	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		