package com.cg.inheritance;
//Program on Single Inheritance
class Bike
{
	public int speed=50;
	//method
	void speed()
	{
		System.out.println("The speed of Bike is: "+speed+"km/hr");
	}
}
//inheritance
class Pulser extends Bike
{
	void average()
	{
		System.out.print("Good");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Pulser p=new Pulser();
		p.speed();
		p.average();

	}

}
