package com.cgi.loops;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();

		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("orange");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
			if(colors.get(i).equals("blue"))
			{
				break;
			}
		}
		
		
		
		for(String color : colors)
		{
			System.out.println(color);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(0);
		numbers.add(1);
		
		System.out.println(numbers);
		
		for(int x : numbers)
		{
			System.out.println(x);
		}
	}

}
