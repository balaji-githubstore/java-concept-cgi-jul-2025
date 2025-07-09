package com.cgi.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2Generic {

	public static void main(String[] args) {
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("orange");
		colors.add("orange");
		
		System.out.println(colors);
		
		colors.remove("orange");
		
		System.out.println(colors);
		

		System.out.println(colors.size());
		
		System.out.println(colors.get(1));
		
		

	}

}
