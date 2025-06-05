package org.example.graphs;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int V;

    // Adjacency list: represents a graph by storing, for each vertex, a list of it's adjacent vertices
    // Each index in adj corresponds to a vertex, and the inner list adj.get(i) holds the vertices that are
    // directly accessible from i
    private List<List<Integer>> adj;

    public Graph(int v) {
        V = v;
        adj = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest);
    }

    public void print() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for(var node: adj.get(1)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,1);
        g.addEdge(1,2);
        g.print();
    }
}
