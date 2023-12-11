package graph2;

import graph.*;
import java.util.*;

class Graph<T> {

	// We use Hashmap to store the edges in the graph
	private Map<Integer, List<Integer> > map = new HashMap<>();

	// This function adds a new vertex to the graph
	public void addVertex(int s)
	{
		map.put(s, new LinkedList<Integer>());
	}

	// This function adds the edge
	// between source to destination
	public void addEdge(int source, int destination, boolean bidirectional)	{

		if (!map.containsKey(source))
			addVertex(source);

		if (!map.containsKey(destination))
			addVertex(destination);

		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	// This function gives the count of vertices
	public void getVertexCount()
	{
		System.out.println("The graph has "
						+ map.keySet().size()
						+ " vertex");
	}

	// This function gives the count of edges
	public void getEdgesCount(boolean bidirection)
	{
		int count = 0;
		for (int v : map.keySet()) {
			count += map.get(v).size();
		}
		if (bidirection == true) {
			count = count / 2;
		}
		System.out.println("The graph has "
						+ count
						+ " edges.");
	}

	// This function gives whether
	// a vertex is present or not.
	public void hasVertex(int s)
	{
		if (map.containsKey(s)) {
			System.out.println("The graph contains "
							+ s + " as a vertex.");
		}
		else {
			System.out.println("The graph does not contain "
							+ s + " as a vertex.");
		}
	}

	// This function gives whether an edge is present or not.
	public void hasEdge(int s, int d)
	{
		if (map.get(s).contains(d)) {
			System.out.println("The graph has an edge between "
							+ s + " and " + d + ".");
		}
		else {
			System.out.println("The graph has no edge between "
							+ s + " and " + d + ".");
		}
	}

	// Prints the adjancency list of each vertex.
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		for (Integer v : map.keySet()) {
			builder.append(v.toString() + ": ");
			for (Integer w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}

		return (builder.toString());
	}
}

// Driver Code

