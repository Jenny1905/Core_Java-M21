package com.cg.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		//Map<Integer,String>obj=new HashMap<Integer,String>();
		Map<Integer,String>obj=new LinkedHashMap<Integer,String>();

		//1.HashMap is unordered
		//1.LinkedHashMap is ordered
		obj.put(6, "Shabnam");
		obj.put(4, "Siddhi");
		obj.put(1, "Sneha");
		
		System.out.println(obj);
		System.out.println(obj.get(4));

		

	}

}
