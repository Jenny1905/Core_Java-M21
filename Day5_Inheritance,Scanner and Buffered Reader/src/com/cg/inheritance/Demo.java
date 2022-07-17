package com.cg.inheritance;
class Mother
{
	static int val=5;
	static int display()
	{
		return val;
		//System.out.println("My Mother name is: Vandana");
		
	}
}
class Daughter extends Mother
{
	//int val=5;
	static int display()
	{
		return val;
		//System.out.println("My Father name is: Suresh");
	}
}
public class Demo 
{

	public static void main(String[] args)
	{
		
		Daughter d=new Daughter();
		System.out.println(d.display());
		
		

	}

}
