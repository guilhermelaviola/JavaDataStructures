package com.java.data_structures.linear.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		
		String phrase = input.nextLine();
		
		int i = 0;
		while (i < phrase.length()) {
			char c = phrase.charAt(i);
			if (Character.isLetter(c)) {
				queue.offer(Character.toLowerCase(c));
				stack.push(Character.toLowerCase(c));
			}
			i++;
		}
		
		while (!stack.isEmpty() && queue.peek() == stack.peek()) {
			queue.remove();
			stack.pop();
		}
		if (queue.isEmpty()) {
			System.out.println(phrase + " is palindrome.");
		} else {
			System.out.println(phrase + "is not a palindrome.");
		}
		
		System.out.println(queue);
		System.out.println(stack);
	}
}
