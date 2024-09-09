package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceDemo {
	public static void main(String[] args) {
		// FIFO
		Queue<String> myData = new PriorityQueue<>();
		myData.add("hello");
		myData.add("hi");
		myData.add("Wassup");
		myData.add("ola");
		System.out.println(myData);
		String var = myData.peek();
		System.out.println(var);
		System.out.println(myData.poll());
		System.out.println(myData);
	}
}
