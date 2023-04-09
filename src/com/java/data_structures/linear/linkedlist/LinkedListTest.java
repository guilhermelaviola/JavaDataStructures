package com.java.data_structures.linear.linkedlist;

import java.util.LinkedList;

import com.java.data_structures.linear.linkedlist.LinkedListExample.Node;

public class LinkedListTest {
	// Test
	public static void main(String[] args) {
		
		Node node = new Node(0);
		// Creating the LinkedListExample Object (an empty list)
		LinkedListExample list = new LinkedListExample();

		// Inserting data into the LinkedList
		node.insert(list, 14);
		node.insert(list, 21);
		node.insert(list, 20);
		node.insert(list, 29);
		node.insert(list, 33);
		node.insert(list, 31);
		node.insert(list, 13);
		node.insert(list, 19);
		
		// Printing the LinkedList
		node.printList(list);
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		LinkedList vp = node.searchValuePositions(1, list1);
		System.out.println(vp);
		System.out.println(list1);
		
		LinkedList<String> sentence = new LinkedList<>();
		
		sentence.add("The");
		sentence.add("sky");
		sentence.add("is");
		sentence.add("blue.");
				
		node.revertStringList(sentence);
	}
}
