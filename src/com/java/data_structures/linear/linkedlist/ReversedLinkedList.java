package com.java.data_structures.linear.linkedlist;

import java.util.LinkedList;

public class ReversedLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> normal = new LinkedList<>();
		LinkedList<String> reversed = new LinkedList<>();
		
		normal.add("A");
		normal.add("B");
		normal.add("C");
		normal.add("D");
		
		System.out.println(normal);
		
		int i=0;
		while (i < normal.size()) {
			reversed.addFirst(normal.get(i));
			i++;
		}
		
		System.out.println(reversed);
	}
}
