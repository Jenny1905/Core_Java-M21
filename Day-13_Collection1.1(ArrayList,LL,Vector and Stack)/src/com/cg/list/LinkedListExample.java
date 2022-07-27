package com.cg.list;
//LinkedList internally uses the DLL
import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList();
		obj.add(11);
		obj.add('z');
		obj.add("Vanshika");
		obj.add(13.4f);
		obj.add('z');

		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(15.30));//false
		System.out.println(obj.indexOf(13.4f));
		System.out.println(obj.lastIndexOf('z'));
		System.out.println(obj.set(1,'S'));
		System.out.println(obj.isEmpty());
		System.out.println(obj);

	}

}
