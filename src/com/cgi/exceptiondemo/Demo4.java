package com.cgi.exceptiondemo;

public class Demo4 {

	public static void main(String[] args) {
		
		try
		{
			
			String name="hello";
			
			System.out.println(name.charAt(10)); //new StringIndexOutOfBoundsException()
			int[] numbers=new int[3];
			
			System.out.println(numbers[10]); //new ArrayIndexOutOfBoundsException()
			
			
			int a=10;
			int b=0;
			
			System.out.println(a/b); //new ArithmeticException()
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
