package DSA.Graph.Sorting;
import java.util.*;
//TopologicalSort Always used In Directed Graph
public class TopologicalSortUsingDFS {
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        int v= adj.size();
        Stack<Integer> st= new Stack<>();
        boolean[]visited=new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfs(adj, i, visited, st);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!st.isEmpty()) {
            result.add(st.pop());
        }


        return result;
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int u, boolean[]visited,Stack<Integer> st ){
        if(visited[u]==true){
            return;
        }
        visited[u]=true;
        // pehle mere bachop ko dalo
        for(int neighbour: adj.get(u)){
            if(!visited[neighbour]){
                dfs(adj, neighbour, visited, st);
            }
        }
        // ab mujhe stack mein dalo
        st.push(u);

    }

}
