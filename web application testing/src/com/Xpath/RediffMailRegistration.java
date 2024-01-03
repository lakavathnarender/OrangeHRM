package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="https://register.rediff.com/register/register.php?FormName=user_details";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();

		// <input type="text" onblur="fieldTrack(this);"
		//name="name95572714" value="" style="width:185px;" maxlength="61">
		// name="name95572714"
		// name="name96a71eed"
		// name="namee21c5adc"

		// By fullNameProperty=By.name("name95572714");
		By fullNameProperty=By.xpath("//*[starts-with(@name,'name')]");

		WebElement fullName=driver.findElement(fullNameProperty);
		fullName.sendKeys("Laddu");

		}

		}



	
