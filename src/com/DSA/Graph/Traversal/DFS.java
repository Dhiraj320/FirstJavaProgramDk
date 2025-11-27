package com.DSA.Graph.Traversal;
import java.util.*;
public class DFS {

        // Function to return a list containing the DFS traversal of the graph.
        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            int n=adj.size();
            ArrayList<Integer> res= new ArrayList<>();
            boolean[]visited= new boolean[n];
            dfs(adj, visited, 0, res);
            return res;


        }
        public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[]visited, int u, ArrayList<Integer> res ){
            visited[u]=true;
            res.add(u);
            for(int ngbr: adj.get(u)){
                if(!visited[ngbr]){
                    dfs(adj, visited, ngbr, res);
                }

            }
        }

}
