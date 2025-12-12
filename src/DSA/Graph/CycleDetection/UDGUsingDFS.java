package DSA.Graph.CycleDetection;
import java.util.*;
public class UDGUsingDFS {
    /* // If adj given

    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int v= adj.size();
        boolean []visited= new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i] && isCycleDfs(adj, i, visited, -1)){
                return true;
            }
        }
        return false;

    }
    public boolean isCycleDfs(ArrayList<ArrayList<Integer>> adj, int u, boolean []visited, int parent){
        visited[u]=true;
        for(int neighbour: adj.get(u)){
            if(neighbour==parent){
                continue;
            }
            if(visited[neighbour]){
                return true;
            }
            if(isCycleDfs(adj, neighbour, visited, u)){
                return true;
            }

        }

        return false;
    }

     */


    // If edges given then make adj
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<Integer>[]adj= constructed(V, edges);

        for(int[]edge:edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);

        }
        boolean[]visited= new boolean[V];
        for(int u=0; u<V; u++){
            if(!visited[u]){
                if(isCyclePresent(u, adj, visited, -1)){
                    return true;
                }

            }

        }
        return false;

    }
    List<Integer>[] constructed(int V, int[][]edges){
        List<Integer>[]adj= new ArrayList[V];
        for(int i=0; i<V; i++){
            adj[i]=new ArrayList<>();
        }
        return adj;

    }

    boolean isCyclePresent(int v, List<Integer>[]adj, boolean[]visited, int parent ){
        visited[v]=true;

        for(int i:adj[v]){
            if(!visited[i]){
                if(isCyclePresent(i, adj, visited, v)){
                    return true;
                }
            }else if(i!=parent){
                return true;
            }
        }
        return false;
    }
}
