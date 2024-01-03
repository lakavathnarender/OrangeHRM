package com.Arrays;

import java.util.ArrayList;
import java.util.List;



public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Syntax:-
		// List<dataType>arrayListName = new ArrayList<>();
		// ArrayList - collections of Java

		//String array2[] = new String[2]; // static Structure with 2 indexes
		//arrayList1[0]=10;

		List<Object>arrayList1 = new ArrayList<>(); // Dynamic data structure with not indexes
		arrayList1.add(10);
		//System.out.println(arrayList1.get(0));

		arrayList1.add("LoadRunner");
		//System.out.println(arrayList1.get(1));

		arrayList1.add(10.123);
		//System.out.println(arrayList1.get(2));

		//arrayList1.add('B');
		//System.out.println(arrayList1.get(3));

		//arrayList1.add(true);

		//for(int index=0;index<=2;index++)
		for(int index=0;index<arrayList1.size();index++)
		{
		System.out.println(arrayList1.get(index));
		}



		}

		}


	


