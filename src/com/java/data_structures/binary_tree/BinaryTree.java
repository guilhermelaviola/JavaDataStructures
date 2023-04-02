package com.java.data_structures.binary_tree;

/*
 * The binary tree data structure in Java is not linear but rather, hierarchical.
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
	
	public static class Node {
		Node left;
		Node right;
		int data;
		
		Node(int newData){
			left = null;
			right = null;
			data = newData;
		}
	}
	// Root node. It'll be null for an empty tree.
	private Node root;
	
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
	 * Inserting data into the tree
	 * This is a recursive process, you can notice it's done in two steps.
	 * The user doesn't know where the node will be placed, but the whole
	 * process will be shown at the end.
	 */
	public void insert(int data) {
		root = insert(root, data);
	}
	
	/* Here is the method responsible for the recursive insertion, given a
	 * reference for a node, it'll search for a place recursively and it'll
	 * insert the data once it finds the place referenced by null. This method
	 * return the location where the new node is at.
	 */
	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}else {
			if (data < node.data) {
				node.left = insert(node.left, data);
			}else {
				node.right = insert(node.right,data);
			}
		}
		return(node);
	}
	
	// This method goes through the tree until it finds the value, returning true
	public boolean lookup(int data) {
		return(lookup(root, data));
	}
	
	// Again, starting from the main root and descending recursively.
	private boolean lookup(Node node, int data) {
		if (node == null) {
			return(false);
		}
		
		if (data == node.data) {
			return(true);
		} else if (data<node.data) {
			return(lookup(node.left, data));
		}else {
			return(lookup(node.right, data));
		}
	}
	
}
