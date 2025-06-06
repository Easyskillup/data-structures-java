package org.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectedGraph {
    private final int V;
    private final boolean directed;
    private final List<List<Integer>> adj;

    public DirectedGraph(int v, boolean directed, List<List<Integer>> adj) {
        V = v;
        this.directed = directed;
        this.adj = adj;
    }

    /**
     * Constructs a new Graph.
     *
     * @param V        number of vertices (indexed 0..V-1)
     * @param directed true if this is a directed graph; false if undirected
     */
    public DirectedGraph(int V, boolean directed) {
        this.V = V;
        this.directed = directed;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }
    }

    /**
     * Adds an edge from src -> dest.
     * If the graph is undirected, also adds dest -> src.
     *
     * @param src  source vertex (0 <= src < V)
     * @param dest destination vertex (0 <= dest < V)
     * @throws IllegalArgumentException if src or dest is out of range
     */
    public void addEdge(int src, int dest) {
        if (src < 0 || src >= V || dest < 0 || dest >= V) {
            throw new IllegalArgumentException("Vertex out of range");
        }
        adj.get(src).add(dest);
        if (!directed) {
            adj.get(dest).add(src);
        }
    }

    /**
     * Returns a string representation of the adjacency list.
     */
    public String printGraph() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adjacency List:\n");
        for (int i = 0; i < V; i++) {
            sb.append(i).append(": ");
            for (int neighbor : adj.get(i)) {
                sb.append(neighbor).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * BFS(Breadth First Search): explores the graph level by level, starts from a source node and traverses to
     * it's neighbours before going deeper.
     * @param start starting vertex (0 <= start <= V)
     */
    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        System.out.println("Traversing by BFS");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.println(node + " ");
            for (int neighbour : adj.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(6, true);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(2, 5);

        System.out.println(g.printGraph());
        g.bfs(0);

    }

}
