package com.java.data_structures.linear.stack;

// Stack follows the LIFO logic: Last In, First Out
public class Stack {
	// Defines the maximum capacity of the Stack
	static final int MAX = 500;
	// Defines the top element to be manipulated
	int top;
	// 
	int a[] = new int [MAX];

	// Returns whether the Stack is empty or not
	boolean isEmpty() {
		return (top < 0);
	}

	// Stack Constructor. The Stack initializes at -1
	Stack(){
		top = -1;
	}

	// Adds elements into the Stack
	boolean push(int x) {
		// Once the top is full, then no more elements can be added into it
		if(top >= (MAX - 1)) {
			System.out.println("Stack overflow!");
			return false;
			// If the top is not full, then new elements can be added (pushed) into the stack
		}else {
			a[++top] = x;
			System.out.println(x + " pushed into Stack.");
			return true;
		}
	}

	// Removes elements into the Stack
	int pop() {
		// Once the Stack is -1, then it means it's under its minimum capacity
		if(top < 0) {
			System.out.println("Stack underflow!");
			return 0;
			// Otherwise, elements can be removed from the Stack
		}else {
			int x = a[top--];
			System.out.println(x + " popped from the Stack.");
			return x;
		}
	}

	// Removes elements into the Stack
	int peek() {
		// Once the Stack is -1, then it means it's under its minimum capacity
		if(top < 0) {
			System.out.println("Stack underflow!");
			return 0;
			// Otherwise, return element on the top of the Stack
		}else {
			int x = a[top];
			return x;
		}
	}
}
