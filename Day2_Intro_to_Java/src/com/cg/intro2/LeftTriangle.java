package com.cg.intro2;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//to print left-angled triangle
		//row for loop
		for(int i=1;i<=n;i++)
		{
			//column
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
				
				
				
			}
			System.out.println();
		}

	}

}
