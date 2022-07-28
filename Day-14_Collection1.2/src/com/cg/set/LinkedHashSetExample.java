package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		//1.HashSet/set is unordered and LinkedHashSet is an ordered
		//2.Set does not allow duplicated values while list allows duplicated values
		obj.add("Prerna");
		obj.add('p');
		obj.add(5.8);
		obj.add(null);
		obj.add(65);
		obj.add(5.8);
		obj.add(null);
		System.out.println(obj);

	}

}
