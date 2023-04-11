package com.java.data_structures.binary_tree;

public class BinarySearchTree {
	// Testing all the methods from BinaryTree class
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.insert(2);
		bst.insert(3);
		bst.insert(1);
		bst.insert(3);
		bst.insert(2);
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
		bst.findMin();
		bst.findMax(null);
		bst.size();
		bst.maxDepth();
		bst.contains(0);
		bst.contains(100);
		bst.printBreadthCourse();
		bst.breadthCourse();
		bst.FB(null);
		bst.displayNodesAndFB();
		bst.breadthFirstSearch();
		bst.lookup(2);
		//System.out.println(bst.lookup(5));
		//System.out.println(bst.lookup(2));
		//System.out.println(bst.size());
		bst.insert(0);
		bst.insert(-3);
		//bst.printTree();
		//System.out.println(bst.maxDepth());
	}
}
