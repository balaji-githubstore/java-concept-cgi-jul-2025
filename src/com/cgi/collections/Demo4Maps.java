package com.cgi.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Maps {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(101, "john");
		map1.put(102, "peter");
		map1.put(103, "saul");

		map1.put(102, "kim");
		
		System.out.println(map1);
		
		System.out.println(map1.size());
		
		System.out.println(map1.get(102));
	}

}
