package com.cgi.methods;

import com.cgi.formula.Area;

public class Demo1Methods {

	public static void main(String[] args) {
		
		
		Area obj=new Area();

		int radius = 10;

		double result = obj.areaOfCircle(10);
		System.out.println(result);

		result = obj.areaOfCircle(20);
		System.out.println(result);

		result = Area.areaOfRectangle(10, 10.2);
		System.out.println(result);

		System.out.println(obj.areaOfCircle(4));
		
	    String myName=obj.getAuthorName();
	    System.out.println(myName);
	    
	    Area.quit();

	}
}
