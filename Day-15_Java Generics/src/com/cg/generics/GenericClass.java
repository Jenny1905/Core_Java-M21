package com.cg.generics;
//Generic Class
public class GenericClass<T>{
	//T is a type
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		GenericClass<Character>obj=new GenericClass<Character>();//generics advantage
		obj.num='z';
		obj.display();

	}

}
