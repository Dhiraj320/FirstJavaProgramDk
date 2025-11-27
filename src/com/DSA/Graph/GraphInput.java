package com.DSA.Graph;

import java.util.*;

public class GraphInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of vertices and edges
        System.out.println("Enter the number of vertices and edges:");
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        // Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Input edges
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt(); // Start vertex
            int v = sc.nextInt(); // End vertex

            adjList.get(u).add(v);
            adjList.get(v).add(u); // For undirected graph
        }

        // Display the adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
