package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CustomerService_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();


		/*
		<a href="/gp/help/customer/display.html?nodeId=200507590&amp;ref_=nav_cs_help"
		class="nav-a  " tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_6"
		data-csa-c-content-id="nav_cs_help"
		data-csa-c-id="4xcaoc-myaqf5-j28tup-m3n5lp">Customer Service</a>
		*/

		/*

		xpath using contains:
		       //tagname[contains(text(),'partialtextvalue')]

		*/


		// By customerServiceProperty=By.partialLinkText("Customer");

		//a[contains(text(),'Customer')]
		By customerServiceProperty=By.xpath("//a[contains(text(),'Customer')]");
		WebElement customerService=driver.findElement(customerServiceProperty);
		customerService.click();



		}

		}


	
