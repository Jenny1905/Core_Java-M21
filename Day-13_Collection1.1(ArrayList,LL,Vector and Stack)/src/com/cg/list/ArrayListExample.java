package com.cg.list;
//arrayList internally uses array
import java.util.ArrayList;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		//declare the arrayList from collection class
		//ArrayList<Object> obj=new ArrayList<>();
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Shiwani");
		obj.add(13);
		obj.add(15.30);
		obj.add("Shiwani");
		System.out.println(obj);
		//size of the array
		System.out.println(obj.size());
		System.out.println(obj.contains(15.30));
		System.out.println(obj.indexOf(13));
		System.out.println(obj.lastIndexOf("Shiwani"));
		System.out.println(obj.set(1,'S'));
		System.out.println(obj);




		
	}

}
