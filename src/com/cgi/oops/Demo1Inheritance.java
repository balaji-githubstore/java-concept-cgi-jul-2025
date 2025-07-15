package com.cgi.oops;


class Father
{
	public final int fAge;
	
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("father constructor!!");
	}
	public void onlyFatherStyle()
	{
		System.out.println("father style11!!!");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style11!!!");
	}
}

class Son extends Father
{
	public int sAge;
	public Son(int fAge,int sAge)
	{
		super(fAge);
		this.sAge=sAge;
		System.out.println("Son constructor!!");
	}
	
	public void sonStyle()
	{
		System.out.println("son style!!");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style11!!!");
		System.out.println("son style11+father style!!!");
		System.out.println("get title from chrome browser");
	}
}



public class Demo1Inheritance {
	
	public static void main(String[] args) {
		
//		Father f=new Father();
//		System.out.println(f.fAge);
//		f.fatherStyle();
//		
		//method overriding 
		Son s=new Son(70,30);
		
		System.out.println(s.fAge);
		//System.out.println(s.sAge);
		
		s.onlyFatherStyle();
		s.fatherStyle();
		//s.sonStyle();
		
	}

}



