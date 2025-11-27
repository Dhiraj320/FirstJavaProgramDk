package com.DSA.Graph.CycleDetection;
import java.util.*;
public class UDGUsingBFS {
    // IF adj given
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int v= adj.size();
        boolean []visited= new boolean[v];
        for(int i=0; i<v; i++){
            if (!visited[i] && isCycleBfs(adj, i, visited)) {
                return true;
            }
        }
        return false;

        // Code here
    }
    public boolean isCycleBfs(ArrayList<ArrayList<Integer>> adj, int u, boolean []visited){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(u, -1));
        visited[u] = true;

        while (!queue.isEmpty()) {
            int curr = queue.peek().first;
            int parent = queue.peek().second;
            queue.poll();

            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    queue.offer(new Pair(neighbor, curr));
                    visited[neighbor] = true;
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
    // Helper class to hold the pair of current node and its parent
    public class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

}
