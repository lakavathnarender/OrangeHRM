package com.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeMethod(description=" Launching Gmail Application ")
	public void gmailApplicationLaunch()
	{
	System.out.println(" *** Gmail Application Launched Successfully ****");
	}

	@AfterMethod(description=" ********* Application Close Test ******")
	public void ApplicationCloseTest()
	{
	System.out.println(" ******* Application Closed Successfully *******");
	}

	@Test(priority=4,description=" Validating SentMail Functionalty ")
	public void SentMailTest()
	{
	System.out.println(" SentMail Test Executed Successfully ");
	}

	@Test(priority=2,description=" Validating ComposeMail Functionalty ")
	public void composeMailTest()
	{
	System.out.println(" ComposeMail Test Executed Successfully ");
	}


	@Test(enabled=false,description=" Validating DraftsMail Functionalty ") // The TestNG will Ignore the Current Test and will proceed to run
	                    //   the rest of the Test Cases
	// TestNG is informed that is a false Test Case need not be considered during the Test Run
	public void DraftsTest()
	{
	System.out.println(" Drafts Test Executed Successfully ");
	}



	@Test(priority=1,description=" Validating LogIn Functionalty ")
	public void logInTest()
	{
	System.out.println(" LogIn Test Executed Successfully ");
	}



	}



