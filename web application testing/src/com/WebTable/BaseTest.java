package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	public void applicationLaunch()
	{
	// Automating Chrome Browser
	System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" ********* Chrome Browser Launched Successfully *********");

	// Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	System.out.println(" Navigated to TimeAndDate Application ");

	driver.manage().window().maximize();

	}

	public void applicationClose()
	{
	driver.quit();
	System.out.println(" **** Application Closed Successfully ***** ");
	}

}
