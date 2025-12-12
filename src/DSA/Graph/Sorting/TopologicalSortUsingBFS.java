package DSA.Graph.Sorting;
import java.util.*;
//TopologicalSort Always used In Directed Graph
// Also called Kanh's Algorithm
public class TopologicalSortUsingBFS {
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n= adj.size();
        int[]inDegree= new int[n];
        Queue<Integer> q=new LinkedList<>();
        // 1st step
        for(int u=0; u<n; u++){
            for(int v:adj.get(u)){
                inDegree[v]++;
            }
        }
        //2nd step fill q , indegree with jiski 0 ho
        for(int i=0; i<n; i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
        // 3simple bfs
        ArrayList<Integer> res= new ArrayList<>();
        while(!q.isEmpty()){
            int u= q.poll();
            res.add(u);
            for(int v:adj.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0){
                    q.offer(v);
                }
            }
        }
        return res;


    }
}

