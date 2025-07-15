package com.cgi.exceptiondemo;

public class Demo5 {

	public static void main(String[] args) {
		
		try
		{
			
			String name="hello";
			
			System.out.println(name.charAt(2)); //new StringIndexOutOfBoundsException()
			int[] numbers=new int[3];
			
			System.out.println(numbers[2]); //new ArrayIndexOutOfBoundsException()
			
			
			int a=10;
			int b=20;
			
			System.out.println(a/b); //new ArithmeticException()
			
			//Exception ex=new StringIndexOutOfBoundsException();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		finally
		{
			//runs always
			System.out.println("close excel or pending open task");
		}
	}
}
