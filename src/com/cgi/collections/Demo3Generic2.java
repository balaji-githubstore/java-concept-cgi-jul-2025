package com.cgi.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo3Generic2 {

	public static void main(String[] args) {
		
		List<Integer> colors=new ArrayList<Integer>();
		
		colors.add(78);
		colors.add(88);
		colors.add(99);

	
		System.out.println(colors);
		

		System.out.println(colors.size());
		
		System.out.println(colors.get(1));
		
		

	}

}
