package com.java.data_structures.prim;

public class Graph {

	private int[][] cost;
	private boolean[][] tree;

	public Graph(int size) {
		cost = new int[size][size];
		tree = new boolean[size][size];
	}

	public void setCost(int no1, int no2, int cost) {
		this.cost[no1][no2] = cost;
		this.cost[no2][no1] = cost;
	}

	public void prim() {
		/*
        EXERCISES:
        1) Choose any node from the graph;
        2) Add the adjacent node with the lowest cost;
        3) Repeat the previous step until all the nodes are added.
         */
	}

	public void displayCost() {
		System.out.println("Cost matrix:");
		for (int i = 0; i < cost.length; i++) {
			for (int j = 0; i < cost.length; j++) {
				System.out.println(cost[i][j] + "\t");

				System.out.println();
			}
			System.out.println();
		}
	}

	public void displayTree() {
		System.out.println("Lowest cost tree:");
		for (int i = 0; i < tree.length; i++) {
			for (int j = 0; i < tree.length; j++) {
				String s = "0";
				if (tree[i][j]) {
					s = "1";

					System.out.println(s + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
