package com.cg.vector;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<Object>();
		//push method is used to add the elements into the stack 
		s.push(11);
		s.push(12);
		s.push("Neha");
		System.out.println(s);
		//pop method is used to remove the elements from the stack 

		System.out.println(s.pop());
		System.out.println(s);

		

	}

}
