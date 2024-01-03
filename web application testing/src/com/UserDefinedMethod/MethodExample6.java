package com.UserDefinedMethod;

public class MethodExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample6 m6 = new MethodExample6(); // using the current class Object it is not
        // possible to call any user defined methods
//  of another Java Classes
		MethodExample2 m2 = new MethodExample2();
		System.out.println("****** Addition Method of MethodExample2 Java Class ******");
		m2.addition();
		System.out.println(" Subtraction method cannot be called - because its a private Method");
		System.out.println();

		MethodExample3 m3 = new MethodExample3();
		m3.multiplication();
		System.out.println(" ************* Multiplication method of MethodExample3 Java Class ***********");
		System.out.println();

		MethodExample5 m5 = new MethodExample5();
		m5.divisionByZero();
		System.out.println(" ************* DivisionByZero method of MethodExample5 Java Class ***********");
		System.out.println();

		MethodExample4 m4 = new MethodExample4();
		m4.division();
		System.out.println(" ************* Division method of MethodExample4 Java Class ***********");
		System.out.println();
	}
}

		






		
		

	
