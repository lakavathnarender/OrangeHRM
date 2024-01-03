package com.UserDefinedMethod;

public class MethodExample5 {
	/*
	void divisionByZero() // default Method
	{
	int var1=40;
	int var2=0;
	int var3;

	var3=var1/var2;
	System.out.println(" The value of the variable var3 after Division is :- "+var3 );
	}
	*/

	void divisionByZero() // default Method
	{
	try
	{
	int var1=40;
	int var2=0;
	int var3;

	var3=var1/var2;
	System.out.println(" The value of the variable var3 after Division is :- "+var3 );
	}
	catch(Exception exceptionCaught)
	{
		System.out.println(" Unable to Perform the operation of Division Method , the expection is :- "+exceptionCaught);
	}

	}

	public static void main(String[] args) {


	System.out.println();
	System.out.println(" ******* Divsion Method of MethodExample4 Class **********");
	System.out.println();

	MethodExample4 m4 = new MethodExample4();
	m4.division();

	MethodExample5 m5 = new MethodExample5();
	m5.divisionByZero();
	
	}
	 

}
