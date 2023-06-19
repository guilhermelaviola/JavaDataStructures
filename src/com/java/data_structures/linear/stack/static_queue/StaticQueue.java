package com.java.data_structures.linear.stack.static_queue;

public class StaticQueue {
	int amount;
	String[] stack;
	int top;
	
	public StaticQueue(int amount) {
		this.amount = amount;
		top = 0;
		stack = new String[amount];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == amount;
	}
	
	public void stackUp(String a) {
		if (!isFull()) {
			stack[top] = a;
			top++;
		} else {
			System.out.println("The Stack is full.");
		}
	}
	
	public String unstack() {
		if (!isEmpty()) {
			top--;
			return stack[top];
		}
		return "The Stack is empty";
	}
}
