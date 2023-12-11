/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph3;

import java.util.*;

//class Main{
//    public static void main (String[] args) {
//        // define edges of the graph 
//        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
//                   new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
//                   new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));
// 
//        // call graph class Constructor to construct a graph
//        Graph graph = new Graph(edges);
// 
//        // print the graph as an adjacency list
//        Graph.printGraph(graph);
//        
//        Edge uji = new Edge();
//        uji.setSrc(0);
//        uji.setSrc(1);
//        uji.setWeight(2);
//        
//        Graph graph2 = new Graph(edges);
//
//        int srcVertex = 0;
//        int listSize = graph.adjList.size();
//
//        System.out.println("The contents of the graph:");
//        while (srcVertex < listSize) {
//            for (Edge edge : graph.adjList.get(srcVertex)) {
//                System.out.print("Vertex: " + srcVertex + " ==> " + edge.dest + " (" + edge.weight + ")\t");
//            }
//
//            System.out.println();
//            srcVertex++;
//        }
//    }

public class Main {
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 2),
            new Edge(0, 2, 4),
            new Edge(1, 2, 4),
            new Edge(2, 0, 5),
            new Edge(2, 1, 4),
            new Edge(3, 2, 3),
            new Edge(4, 5, 1),
            new Edge(5, 4, 3)
        );

        Graph graph = new Graph(edges);

        List<List<Edge>> adjList = graph.getAdjList();

        int srcVertex = 0;
        int listSize = adjList.size();

        System.out.println("The contents of the graph:");
        while (srcVertex < listSize) {
            for (Edge edge : adjList.get(srcVertex)) {
                System.out.print("Vertex: " + srcVertex + " ==> " + edge.dest + " (" + edge.weight + ")\t");
            }

            System.out.println();
            srcVertex++;
        }
    }
}

