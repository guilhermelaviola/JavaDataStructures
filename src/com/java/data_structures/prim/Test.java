package com.java.data_structures.prim;

public class Test {
	public static void main(String[] args) {
		// Creating graph
		Graph g = new Graph(7);
		
		// Adding values to the graph
		// A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6
        g.setCost(0, 1, 8);  // A-B
        g.setCost(0, 2, 10); // A-C
        g.setCost(1, 3, 5);  // B-D
        g.setCost(1, 4, 9);  // B-E
        g.setCost(2, 3, 10); // C-D
        g.setCost(2, 5, 2);  // C-F
        g.setCost(3, 4, 5);  // D-E
        g.setCost(3, 5, 7);  // D-F
        g.setCost(4, 6, 2);  // E-G
        g.setCost(5, 6, 1);  // F-G
        
        // Displaying cost matrix
        g.displayCost();
        
        // Executing the Prim algorithm
        g.prim();
        
        // Displying the minimum cost tree using the Prim algorithm
        g.displayTree();
	}
}
