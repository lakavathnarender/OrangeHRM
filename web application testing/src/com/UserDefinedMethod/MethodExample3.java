package com.UserDefinedMethod;

public class MethodExample3 {
	public void multiplication()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1*var2;
	System.out.println(" The value of the variable var3 after Multiplication is :- "+var3 );
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample3 m3 = new MethodExample3();
		m3.multiplication();

		System.out.println();
		System.out.println(" ******* Addition Method of MethodExample2 Class **********");

		// m3.addition();

		MethodExample2 mm2 = new MethodExample2();
		mm2.addition();
		System.out.println();


		}
		

	}


