package com.cgi.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo4Maps2 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map1=new HashMap<Integer, String>();
		
		map1.put(101, "john");
		map1.put(102, "peter");
		map1.put(103, "saul");
		
		

		Map<Integer, String> map2=new HashMap<Integer, String>();
		
		map2.put(1001, "john1");
		map2.put(1002, "peter1");
		map2.put(1003, "saul1");
		
		List<Map<Integer, String>> lists=new ArrayList<Map<Integer,String>>();
		lists.add(map1);
		lists.add(map2);
		
		
		System.out.println(lists);
		System.out.println(lists.get(1));
		
		System.out.println(lists.get(1).get(1001));
	}

}
