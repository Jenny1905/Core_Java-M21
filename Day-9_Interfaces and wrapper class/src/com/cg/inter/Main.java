package com.cg.inter;


interface inf
{
	int x=10;
	
	//by default its abstract method
	 void display();
	//void print();

}
class Demo implements inf
{
	//provided the implementation for abstract method inside the Demo class
	@Override
	public void display() {
		System.out.println("Interface"+" the value of x is : "+x);
		
	}
	
}
public class Main
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.display();
		
	}
}
