package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeadeBlock_LinkNameDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
			
		
		
			System.out.println(" ********* Chrome Browser Launched Successfully *********");

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to TSRTC Application ");

		// Property of the Header Block of TSRTC Application HomePage
		// class="menu-wrap"

		// Identifying the Header Block of the Webpage
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);

		// Identifying the Element in the Header Block

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		// <a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>

		By headerBlock_LinksProperty=By.tagName("a");

		// going to the header Block and finding all the elements of the Header Block
		List<WebElement>headerBlock_links=tsrtc_HeaderBlock.findElements(headerBlock_LinksProperty);

		// finding the number of links in the header block

		int headBlockLinksCount=headerBlock_links.size();
		System.out.println(" The number of links in the Header Block of TSRTC Application HomePage is :- "+headBlockLinksCount);


		for(int index=0;index<headBlockLinksCount;index++)
		{

		// getting the names of the identified elements of the Header Block
		String headBlockLinkName=headerBlock_links.get(index).getText();
		System.out.println(index +" - " +headBlockLinkName);

		}

		driver.quit();

		}

		}

	


