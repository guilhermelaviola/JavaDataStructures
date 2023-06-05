package com.java.data_structures.linear.Queue.palindrome;

import java.util.LinkedList;
import java.util.Scanner;

public class ReversingLinkedList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list3 = new LinkedList<String>();
		
		list1.add("The");
		list1.add("quick");
		list1.add("brown");
		list1.add("fox");
		list1.add("jumped");
		list1.add("over");
		list1.add("the");
		list1.add("lazy");
		list1.add("dog.");
		
		list2.add("lizard");
		list2.add("rabbit");
		list2.add("owl");
		list2.add("ferret");
		
		System.out.println(list1);
		System.out.println(list2);
		
		int i = 0;
		while (i < list1.size()) {
			list3.add(list1.get(i));
			i++;
		}
		
		i = 0;
		while (i < list2.size()) {
			list3.add(list2.get(i));
			i++;
		}
		
		System.out.println(list3);
		}
}
