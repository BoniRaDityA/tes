/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph2;

import graph.*;

/**
 *
 * @author Acer
 */
public class GraphMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Graph<Integer> g = new Graph<Integer>();

		// edges are added.
		// Since the graph is bidirectional,
		// so boolean bidirectional is passed as true.
		g.addEdge(0, 1, true);
		g.addEdge(0, 4, true);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(1, 4, true);
		g.addEdge(2, 3, true);
		g.addEdge(3, 4, true);

		// Printing the graph
		System.out.println("Graph:\n"
						+ g.toString());

		// Gives the no of vertices in the graph.
		g.getVertexCount();

		// Gives the no of edges in the graph.
		g.getEdgesCount(true);

		// Tells whether the edge is present or not.
		g.hasEdge(3, 4);

		// Tells whether vertex is present or not
		g.hasVertex(5);
	}
    }
    

