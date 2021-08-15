package DataStructures.examples.linear.LinkedList;

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
		// Test
		public static void main(String[] args) {

			// Creating the LinkedListExample Object (an empty list)
			LinkedListExample list = new LinkedListExample();

			// Inserting data into the LinkedList
			list = insert(list, 14);
			list = insert(list, 21);
			list = insert(list, 20);
			list = insert(list, 29);
			list = insert(list, 33);
			list = insert(list, 31);
			list = insert(list, 13);
			list = insert(list, 19);

			// Printing the LinkedList
			printList(list);
		}	
	}
}
