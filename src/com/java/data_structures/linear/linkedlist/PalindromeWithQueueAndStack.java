package com.java.data_structures.linear.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeWithQueueAndStack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		
		String input = sc.nextLine();
		
		int i = 0;
		while (i < input.length()) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				queue.offer(Character.toLowerCase(c));
				stack.push(Character.toLowerCase(c));
			}
			i++;
		}
		
		while (!queue.isEmpty() && stack.peek() == stack.peek()) {
			queue.remove();
			stack.pop();
		}
		if (queue.isEmpty()) {
			System.out.println("It's a palindrome!");
		} else {
			System.out.println("It's not a palindrome...");
		}
		
		System.out.println(queue);
		System.out.println(stack);
	}
}
