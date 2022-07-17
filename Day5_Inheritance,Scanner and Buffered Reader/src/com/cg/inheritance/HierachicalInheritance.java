package com.cg.inheritance;
//program for Hierarchical Inheritance
class MobileBrand
{
	void displayName()
	{
		System.out.println("Brand is: Samsung");
	}
}
class SamsungM31 extends MobileBrand
{
	void display()
	{
		System.out.println("Samsung Galaxy M31");

	}
}

class SamsungM31s extends MobileBrand
{
	void display1()
	{
		System.out.println("Samsung Galaxy M31s");

	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		SamsungM31s m=new SamsungM31s();
		m.display1();
		m.displayName();
		
		SamsungM31 m1=new SamsungM31();
		m1.display();
	}

}
