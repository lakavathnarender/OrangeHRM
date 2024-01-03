package com.Arrays;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array1[][]=new String[2][2];
		
		array1[0][0]="Narender";
		array1[0][1]="Manual Testing";
		
		array1[1][0]="Srini";
		array1[1][1]="Selenium";
		
	
		System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);
		
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		
		
		for(int rowIndex=0;rowIndex<=1;rowIndex++)
		{
		for(int cellIndex=0;cellIndex<=1;cellIndex++)
			
		{
		System.out.println(array1[rowIndex][cellIndex]+"" +"|");
		}
		System.out.println();
		}
		
	}
	
}

	
		
	
	
		
		
		




