package com.cgi.collections;

import java.util.ArrayList;
//non generic - not recommended - because boxing and unboxing happens always
public class Demo1NonGeneric {

	public static void main(String[] args) {
		
		ArrayList lists=new ArrayList();
		
		lists.add(100);  //boxing
		lists.add(20.5);
		lists.add("hello");
		
		
		System.out.println(lists.size());
		
		String z=(String) lists.get(2); //unboxing 
		
		System.out.println(z);
		
		int b=(int) lists.get(2); //unboxing
		System.out.println(b);
	
		
		
		
		

	}

}
