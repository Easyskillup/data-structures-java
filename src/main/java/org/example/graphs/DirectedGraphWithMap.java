package org.example.graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DirectedGraphWithMap {
    private final boolean directed;
    private final Map<Integer, List<Integer>> adj;

    public DirectedGraphWithMap(boolean directed, Map<Integer, List<Integer>> adj) {
        this.directed = directed;
        this.adj = adj;
    }

    // Add a vertex to the map if it doesn’t already exist.
    private void addNodeIfAbsent(int node) {
        adj.computeIfAbsent(node, k -> new LinkedList<>());
    }

    public void addEdge(int src, int dest) {
        addNodeIfAbsent(src);
        addNodeIfAbsent(dest);
        adj.get(src).add(dest);
        if (!directed) {
            adj.get(dest).add(src);
        }
    }

    public void printGraph() {
        System.out.println("Adjacency List (using HashMap):");
        for (Integer node : adj.keySet()) {
            System.out.print(node + ": ");
            for (Integer neighbor : adj.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraphWithMap g = new DirectedGraphWithMap(false, new HashMap<>());
        g.addEdge(10, 20);
        g.addEdge(10, 30);
        g.addEdge(20, 40);
        g.addEdge(30, 50);

        g.printGraph();
    }
}
