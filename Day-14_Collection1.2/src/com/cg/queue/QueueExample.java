package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//ArrayDeque will print the element of a queue in same insertion order
		
		Queue<Object>q=new ArrayDeque<Object>();
		q.offer(11);
		q.add(12);
		q.add(10);
		System.out.println(q);
		System.out.println(q.peek());
		//PriorityQueue will print the elements using Priority of the elements
		Queue<Object>q1=new PriorityQueue<Object>();
		q1.add(24);
		q1.add(2);
		q1.add(35);
		System.out.println(q1);
		System.out.println(q1.element());
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.poll());		
		System.out.println(q1);
		System.out.println(q1.poll());		
		System.out.println(q1);
		System.out.println(q1.poll());		
		System.out.println(q1);
		


		

		


	}

}
