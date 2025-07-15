package com.cgi.datatypes;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] numbers=new int[3];
		numbers[0]=10;
		
		numbers[5]=10; //new ArrayIndexOutOfBoundException(){}
		
		System.out.println(numbers);
		
		System.out.println(numbers[1]);
		
		
		int[] arr1= {2,44,444,55};
		
		System.out.println(arr1[1]);
		
		
		String[] arr2= {"yellow","green","red"};
		
		System.out.println(arr2[2]);
		
		
		String[][] arr3={{"peter","peter123"},{"john","john123"},{"9","kim123"}};
		
		System.out.println(arr3[0][0]);
		System.out.println(arr3[0][1]);
		
		System.out.println(arr3[1][0]);
		System.out.println(arr3[1][1]);
		
		
		System.out.println(arr3[2][0]);
		System.out.println(arr3[2][1]);
	}
}
