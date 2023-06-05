package com.java.data_structures.linear.Queue.palindrome;

import java.util.LinkedList;
import java.util.Scanner;

public class CopyLists {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> normal = new LinkedList<String>(); 
		LinkedList<String> reversed = new LinkedList<String>(); 
		
		normal.add("The");
		normal.add("quick");
		normal.add("brown");
		normal.add("fox");
		normal.add("jumped");
		normal.add("over");
		normal.add("the");
		normal.add("lazy");
		normal.add("dog.");
		
		System.out.println(normal);
		
		int i = 0;
		while (i < normal.size()) {
			reversed.addFirst(normal.get(i));
			i++;
		}
		System.out.println(reversed);
	}
}
