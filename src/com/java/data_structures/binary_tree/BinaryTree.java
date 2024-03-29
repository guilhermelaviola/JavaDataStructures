package com.java.data_structures.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * The binary tree value structure in Java is not linear but rather, hierarchical.
 * This means that the top-most element is the "root" of the tree, and all other
 * nodes connect to it. Each node in the tree can have up to two children.
 */

/*
 * References
 * AVL tree: http://www.site.uottawa.ca/~stan/csi2514/applets/avl/BT.html
 * http://infovis.ucpel.tche.br/luzzardi/Arvores_AVL_B.pdf
 * http://webdiis.unizar.es/asignaturas/EDA/AVLTree/avltree.html
 */
public class BinaryTree {
	// Root node. It'll be null for an empty tree.
	private Node root;
	
	public static class Node {
		private Node left;
		private Node right;
		private int value;
		
		Node(int newvalue){
			left = null;
			right = null;
			value = newvalue;
		}
	}	
	/*
	 * NODE
	 * It's a binary tree built from the Node internal class.
	 * Each node can store an element e point to empty sub trees.
	 * It's not necessary to create methods to the internal class
	 * because everything that is built within the class has access
	 * inside of the class with no restrictions. 
	 */
	
	// Creating an empty tree.
	public BinaryTree() {
		root = null;
	}
	
	/*
	 * Inserting value into the tree
	 * This is a recursive process, you can notice it's done in two steps.
	 * The user doesn't know where the node will be placed, but the whole
	 * process will be shown at the end.
	 */
	public void insert(int value) {
		root = insert(root, value);
	}
	
	/* Here is the method responsible for the recursive insertion, given a
	 * reference for a node, it'll search for a place recursively and it'll
	 * insert the value once it finds the place referenced by null. This method
	 * return the location where the new node is at.
	 */
	private Node insert(Node node, int value) {
		if (node == null) {
			node = new Node(value);
		}else {
			if (value < node.value) {
				node.left = insert(node.left, value);
			}else {
				node.right = insert(node.right,value);
			}
		}
		return(node);
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println("");
	}
	
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.value + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder() {
		inOrder(root);
		System.out.println("");
	}
	
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		preOrder(root.left);
		System.out.println(root.value + " ");
		preOrder(root.right);
	}
	
	public void postOrder() {
		postOrder(root);
		System.out.println("");
	}
	
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.value + " ");
	}
	
	public int findMin() {
		return findMin(root);
	}
	
	public int findMin(Node root) {
		if (root.left == null) {
			return root.value;
		}
		return findMin(root.left);
	}
	
	public int findMax() {
		return findMax(root);
	}
	
	public int findMax(Node root) {
		if (root.right == null) {
			return root.value;
		}
		return findMax(root.right);
	}
	
	public int size() {
		return size(root);
	}
	
	public int size(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}
	
	public int maxDepth() {
		return maxDepth(root);
	}
	
	public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}else {
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			return 1 + Math.max(leftDepth, rightDepth);
		}
	}
	
	public boolean contains(int value) {
		return contains(value, root);
	}
	
	public boolean contains(int value, Node root) {
		if (root == null) {
			return false;
		}
		if (value == root.value) {
			return true;
		}else if (value < root.value) {
			return contains(value, root.left);
		}else {
			return contains(value, root.right);
		}
	}
	
	public void printBreadthCourse() {
		printBreadthCourse(root);
	}
	
	public void printBreadthCourse(Node node) {
		Queue<Node> breadth = new LinkedList<>();
		Queue<Node> copy = new LinkedList<>();
		breadth.add(node);
		copy.add(node);
		Node visitor = node;
		while (!breadth.isEmpty()) {
			if (visitor.left != null) {
				breadth.add(visitor.left);
				copy.add(visitor.right);
			}
			if (visitor.right != null) {
				breadth.add(visitor.right);
				copy.add(visitor.right);
			}
			System.out.println(visitor.value + " ");
		}
		System.out.println("\nEmpty queue? " + breadth.isEmpty());
		System.out.println("Empty copied queue? " + copy.isEmpty());
		System.out.println("Amount of elements: " + copy.size());
	}
	
	public Queue<Integer> breadthCourse(){
		return breadthCourse(root);
	}
	
	public Queue<Integer> breadthCourse(Node root){
		Queue<Node> breadth = new LinkedList<>();
		Queue<Integer> def = new LinkedList<>();
		breadth.add(root);
		def.add(root.value);
		Node visitor = null;
		while (!breadth.isEmpty()) {
			visitor = breadth.remove();
			if (visitor.left != null) {
				breadth.add(visitor.left);
				def.add(visitor.left.value);
			}
			if (visitor.right != null) {
				breadth.add(visitor.right);
				def.add(visitor.right.value);
			}
		}
		return def;
	}
	
	public int FB(Node root) {
		return maxDepth(root.left) - maxDepth(root.right);
	}
	
	public void displayNodesAndFB() {
		displayNodesAndFB(root);
	}
	
	public void displayNodesAndFB(Node root) {
		Queue<Node> breadth = new LinkedList<>();
		
		breadth.add(root);
		
		Node visitor = null;
		while (!breadth.isEmpty()) {
			visitor = breadth.remove();
			if (visitor.left != null) {
				breadth.add(visitor.left);
			}
			if (visitor.right != null) {
				breadth.add(visitor.right);
			}
			System.out.println("[" + visitor.value + ", " + FB(visitor) + "] ");
		}
	}
	
	public void breadthFirstSearch() {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		breadthFirstSearch(q);
		System.out.println("");
	}
	
	public void breadthFirstSearch(Queue queue) {
		if (queue.isEmpty()) {
			return;
		}
		
		Node node = (Node) queue.poll();
		
		System.out.println(node.value + " ");
		if (node.left != null) {
			queue.offer(node.left);
		}
		if (node.right != null) {
			queue.offer(node.right);
		}
		breadthFirstSearch(queue);
	}
	
	// This method goes through the tree until it finds the value, returning true
	public boolean lookup(int value) {
		return(lookup(root, value));
	}
	
	// Again, starting from the main root and descending recursively.
	private boolean lookup(Node node, int value) {
		if (node == null) {
			return(false);
		}
		if (value == node.value) {
			return(true);
		} else if (value<node.value) {
			return(lookup(node.left, value));
		}else {
			return(lookup(node.right, value));
		}
	}
	
}
