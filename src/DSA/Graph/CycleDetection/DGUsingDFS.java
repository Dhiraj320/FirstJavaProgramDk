package DSA.Graph.CycleDetection;
import java.util.*;
public class DGUsingDFS {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<Integer>[] adj= constructAdj(V, edges);
        boolean[]visited= new boolean[V];
        boolean[]inRecursion= new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i] && isCycleDFS(adj, i, visited, inRecursion)){
                return true;
            }
        }
        return true;


    }

    private boolean isCycleDFS(ArrayList<Integer>[] adj, int u, boolean[] visited, boolean[] inRecursion) {
        visited[u]=true;
        inRecursion[u]=true;
        for(int v:adj[u]){
            if(!visited[v] && isCycleDFS(adj, v, visited, inRecursion)){
                return true;
            }else if(inRecursion[v]){
                return true;
            }
        }
        inRecursion[u]=false;
        return false;

    }

    ArrayList<Integer>[] constructAdj(int V, int[][]edges){
        ArrayList<Integer>[] adj= new ArrayList[V];
        for(int i=0; i<V; i++){
            adj[i]= new ArrayList<>();
        }
        for(int[]edge:edges){
            adj[edge[0]].add(edge[1]);
        }
        return adj;

    }

}
