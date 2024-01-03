package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLogInTest {

	private static String applicationUrlAddress;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//String applicationUrlAddress=
		
	System.setProperty("webdriver.chrome.driver","./WebDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	
	driver.get(applicationUrlAddress);
	
	String expected_OrangeHRMApplicatinLogInPageTitle="OrangeHRM";
	String expected_OrangeHRMApplicationLoginPageTitle = null;
	System.out.println(" The expected Title of the OrangeHRM Applicatin LogIn Page is :- "+expected_OrangeHRMApplicationLoginPageTitle);
	
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


	 By userNameProperty=By.id("txtUsername");
	  driver.findElement(userNameProperty).sendKeys("srini"); 
	  
	  By userNameProperty1=By.id("txtUsername");
	  
	  
	  
	  WebElement userName=driver.findElement(userNameProperty1);
	  
	  userName.sendKeys("srini");
	  
	  
	  String userNameTestData="srini"; 
	  By userNameProperty11=By.id("txtUsername"); 
	  WebElement userName1=driver.findElement(userNameProperty11); 
	  userName1.sendKeys(userNameTestData);
	  
	  String passwordTestData="Q@Trainer7"; 
	  By passwordProperty=By.name("txtPassword"); 
	  WebElement password=driver.findElement(passwordProperty);
	  password.sendKeys(passwordTestData); 


	
	  By logInButtonProperty=By.className("button");
	  WebElement logInButton=driver.findElement(logInButtonProperty);
	  logInButton.click();

	  driver.quit();

	  }

	  }
	  
	  
	  
	  
	  
	  

	
		

	


