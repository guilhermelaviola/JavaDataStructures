package com.java.data_structures.linear.stack;

import java.util.Scanner;
import java.util.Stack;

public class NaturalNumberStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		// Read numbers
		Scanner input =  new Scanner(System.in);
		int x = input.nextInt();
		while (x >= 0) {
			stack.push(x);
			x = input.nextInt();
		}
		// Deleting and displaying the deleted value
		x = stack.pop();
		System.out.println(x);
		
		// Displaying the new top number
		System.out.println(stack.peek());
		
		// Supporting the new top
		Stack<Integer> aux = new Stack<Integer>();
		System.out.println("Enter a number to check if it is on the stack: ");
		
		x = input.nextInt();
		System.out.println(stack);
		int count = 0;
		while (!stack.isEmpty() && x != stack.peek()) {
			aux.push(stack.pop());
			count++;
		}
		if (stack.isEmpty()) {
			System.out.println("There's no such number on the stack");
		} else {
			System.out.println("is in the following position " + count);
		}
		
		while (!aux.isEmpty()) {
			stack.push(aux.pop());
		}
		if (stack.isEmpty()) {
			System.out.println("Empty stack!");
		} else {
			System.out.println("The stack is not empty.");
		}
		input.close();
	}
}
