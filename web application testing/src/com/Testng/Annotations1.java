package com.Testng;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1,description=" Launching Gmail Application ")// Test Case
	public void gmailApplicationLaunch() // Test Case Name
	// any functionality which is under Test Should be always be written within the Method implemented
	 //  with TestNG Annotation @Test only
	//  Name of the Method is always called as Test Case Name
	// If a class contains multiple Methods - then the TestNG will executed the Test Cases
	  //  based on the alphabetical order of the given Test case Name

	// If a class contains multiple Methods - then the TestNG will executed the Test Cases
   // based on the alphabetical order of the given Test case Name - fist priority will
     //given to the Test Case name starting with Upper case Letter


	{
	System.out.println(" *** Gmail Application Launched Successfully ****");
	}

	@Test(priority=6,description=" ********* Application Close Test ******")
	public void ApplicationCloseTest()
	{
	System.out.println(" ******* Application Test Executed Successfully *******");
	}

	@Test(priority=5,description=" Validating SentMail Functionalty ")
	public void SentMailTest()
	{
	System.out.println(" SentMail Test Executed Successfully ");
	}

	@Test(priority=3,description=" Validating ComposeMail Functionalty ")
	public void composeMailTest()
	{
	System.out.println(" ComposeMail Test Executed Successfully ");
	}


	@Test(enabled=false,description=" Validating DraftsMail Functionalty ") // The TestNG will Ignore the Current Test and will proceed to run
	                    //   the rest of the Test Cases
	// TestNG is informed that is a false Test Case need not be considered during the Test Run

	// * The default status of the Test Case is - enabled=true
	public void DraftsTest()
	{
	System.out.println(" Drafts Test Executed Successfully ");
	}



	@Test(priority=2,description=" Validating LogIn Functionalty ")
	public void logInTest()
	{
	System.out.println(" LogIn Test Executed Successfully ");
	}

	/*
	public static void main(String[] args) {

	Annotations1 a1 = new Annotations1();
	a1.gmailApplicationLaunch();

	}
	*/
	}


