package com.java.data_structures.linear.stack.static_queue;

public class Test {
	public static void main(String[] args) {
		StaticQueue s = new StaticQueue(5);
		s.stackUp("First");
		s.stackUp("Second");
		s.stackUp("Third");
		s.stackUp("Fourth");
		s.stackUp("Fifth");
		s.stackUp("Sixth");
		while (!s.isEmpty()) {
			System.out.println(s.unstack());
		}
		System.out.println(s.unstack());
	}
}
