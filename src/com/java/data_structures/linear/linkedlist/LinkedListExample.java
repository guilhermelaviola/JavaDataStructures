package com.java.data_structures.linear.linkedlist;

import java.util.LinkedList;

// Linear data structure that consists of a collection of multiple nodes
public class LinkedListExample {

	// Head of the list
	Node head;

	// LinkedList Node. This inner class is static, for the main method to access it
	static class Node{

		int data;
		Node next;

		// Node Constructor
		Node(int d){
			data = d;
			next = null;
		}

		// Inserting a new Node
		public static LinkedListExample insert(LinkedListExample list, int data) {

			// Create a new node with this given data
			Node n = new Node(data);
			n.next = null;

			// If the LinkedList is empty, then make a new node as head
			if (list.head == null) {
				list.head = n;
			}else {
				// Otherwise, go to the end of the list and insert an element in there
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}
				// Inserting the new node (n) at the end of the list
				last.next = n;
			}
			// Returning the list by head
			return list;
		}

		public static void printList(LinkedListExample list) {
			Node currNode = list.head;
			System.out.println("LinkedList: ");

			// Going through the LinkedList
			while (currNode != null) {
				// Printing the data at the current node
				System.out.print(currNode.data + " | ");

				// Going to the next node
				currNode = currNode.next;
			}
		}
		
		public static LinkedList<Integer> searchValuePositions(Integer x, LinkedList<Integer> list){
			LinkedList<Integer> a = new LinkedList<>();
			for (int i = 0; i < list.size(); i++) {
				if (x == list.get(i)) {
					a.add(i);
				}
			}
			return a;
		}
	}
}
