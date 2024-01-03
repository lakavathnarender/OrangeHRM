
package com.Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
@Test
	public void launchBrowesre()
	{
		ChromeDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);

	}
	

}
