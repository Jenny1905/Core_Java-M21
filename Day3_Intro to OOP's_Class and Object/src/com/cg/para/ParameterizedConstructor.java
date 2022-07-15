//program on constructor
package com.cg.para;

import java.util.Scanner;

class C
{
	//declaring variables
	int rollno;
	String name;
	int rollno1;
	String name1;
	//parameterized Constructor
	C(int r,String n)
	{
		rollno=r;
		name=n;
		rollno1=r;
		name1=n;
	}
	//method
	void print()
	{
		System.out.println("Roll No is: "+rollno+" and Name is: "+name);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for First Person ");
		int rollno=s.nextInt();
		String name=s.nextLine();
		System.out.println("Enter the value for second Person ");

		int rollno1=s.nextInt();
		String name1=s.nextLine();
		//obj creation
		C obj=new C(rollno,name);
		C obj1=new C(rollno1,name1);
		obj.print();
		obj1.print();
		s.close();

	}

}
