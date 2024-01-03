package com.UserDefinedMethod;

public class MethodExample7 {
	// Global Variables / instance Variables
	int var1=50;
	int var2=40;

	public void addition() // user defined method withOut parameter
	{
	// Local Variables
	//int var1=20;
	//int var2=30;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3 );
	}

	public void addition(int var1,int var2) // its a user defined method - method with parameters
	{
	// Local Variables
	//int var1=20;
	//int var2=30;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3 );
	}

	public void subtraction()
	{
	int var3;
	var3=var1-var2;
	System.out.println(" The value of the variable var3 after Subtraction is :- "+var3 );
	}

	// Method OverLoading -- method names same with different method signature
	public void addition(int var1,int var2,double var3) // its a user defined method - method with parameters
	{
	// Local Variables
	//int var1=20;
	//int var2=30;
	// int var3;

	var3=var1+var2+var3;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3 );
	}

	public static void main(String[] args) {

	MethodExample7 m7 = new MethodExample7();
	m7.addition();
	m7.addition(90, 100);
	m7.addition(30, 90);
	m7.addition(60, 90, 50);
	m7.subtraction();


	}



	}



