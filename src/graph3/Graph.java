/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph3;


import java.util.*;
/// Graph class
//class Graph {
//    // node of adjacency list 
//    static class Node {
//        private int value;
//        private int weight;
//        
//        Node(int value, int weight)  {
//            this.value = value;
//            this.weight = weight;
//        }
//    };
// 
//// define adjacency list
// 
//List<List<Node>> adj_list = new ArrayList<>();
// 
//    //Graph Constructor
//    public Graph(List<Edge> edges)
//    {
//        // adjacency list memory allocation
//        for (int i = 0; i < edges.size(); i++)
//            adj_list.add(i, new ArrayList<>());
// 
//        // add edges to the graph
//        for (Edge e : edges)
//        {
//            // allocate new node in adjacency List from src to dest
//            adj_list.get(e.src).add(new Node(e.dest, e.weight));
//        }
//    }
//// print adjacency list for the graph
//    public static void printGraph(Graph graph)  {
//        int src_vertex = 0;
//        int list_size = graph.adj_list.size();
// 
//        System.out.println("The contents of the graph:");
//        while (src_vertex < list_size) {
//            //traverse through the adjacency list and print the edges
//            for (Node edge : graph.adj_list.get(src_vertex)) {
//                System.out.print("Vertex:" + src_vertex + " ==> " + edge.value + 
//                                " (" + edge.weight + ")\t");
//            }
// 
//            System.out.println();
//            src_vertex++;
//        }
//    }
//}

//class Graph {
//    private List<List<Edge>> adjancency = new ArrayList<>();
//
//    public Graph() {
//    }
//
//    public Graph(List<Edge> edges) {
//        for (int i = 0; i < edges.size(); i++) {
//            adjancency.add(i, new ArrayList<>());
//        }
//
//        for (Edge e : edges) {
//            adjancency.get(e.src).add(e);
//        }
//    }
//    
//    public static void printGraph(Graph graph) {
//    int srcVertex = 0;
//    int listSize = graph.adjancency.size();
//
//    System.out.println("The contents of the graph:");
//    while (srcVertex < listSize) {
//        // Perulangan melalui adjacency list untuk vertex ke- srcVertex
//        for (Edge edge : graph.adjancency.get(srcVertex)) {
//            // Cetak informasi edge (sisi)
//            System.out.print("Vertex: " + srcVertex + " ==> " + edge.dest + " (" + edge.weight + ")\t");
//        }
//
//        // Pindah ke vertex berikutnya
//        System.out.println();
//        srcVertex++;
//    }
//}

class Graph {
    List<List<Edge>> adjancency = new ArrayList<>();

    public Graph(List<Edge> edges) {
        for (int i = 0; i < edges.size(); i++) {
            adjancency.add(new ArrayList<>());
        }

        for (Edge e : edges) {
            adjancency.get(e.src).add(e);
        }
    }

    public void setAdjancency(List<List<Edge>> adjancency) {
        this.adjancency = adjancency;
    }
    
    public List<List<Edge>> getAdjancency() {
        return adjancency;
    }
    
    public List<List<Edge>> getAdjList() {
        return adjancency;
    }
}

