package com.UserDefinedMethod;

public class MethodExample2 {
	// User defined Method can be created in a  Java Class
	// User defined method though created in a Java Class - will not get executed by themself
	// a Java Class can have any number of User Defined methods
	// to perform the operation related to User defined then an Object Should be created in
//	    the main method for the Class - and using the objected created the User defined
//	       method should be called

	// User defined methods should never be created within the main method

	// A java Class can have any number of user defined methods even without a main method
	// User defined methods either can be created above the main method or below the main method

	// only the user defined methods called in the Main method will be executed

	// User defined method names should be always be unique

	public void addition()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3 );
	}
	public static void main(String[] args) {

	MethodExample2 m2 = new MethodExample2();
	m2.addition();

	m2.subtraction();

	}

	public void subtraction()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1-var2;
	System.out.println(" The value of the variable var3 after Subtraction is :- "+var3 );
	}



	}




