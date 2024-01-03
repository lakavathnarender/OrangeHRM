package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Syntax
		// Object array1[] = new Object[size];
		// Object array1[][] = new Object[size][size];

		// Object array is capable of storing different dataType values
		// Object array must and should be declared with the Size

		Object array1[] = new Object[3];

		array1[0]=10;
		// System.out.println(array1[0]);

		array1[1]="WebDriver";
		// System.out.println(array1[1]);

		array1[2]='A';
		// System.out.println(array1[2]);

		for(int rowIndex=0;rowIndex<=2;rowIndex++)
		{
		System.out.println(array1[rowIndex]);
		}



	}

}
