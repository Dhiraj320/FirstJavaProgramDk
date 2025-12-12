package DSA.Graph.Traversal;
import java.util.*;
public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        ArrayList<Integer> res= new ArrayList<>();
        Queue<Integer>q =new LinkedList<>();

        boolean[]visited= new boolean[n];
        int u=0;

        visited[u]=true;
        q.add(u);

        while(!q.isEmpty()){
            int curr= q.poll();
            res.add(curr);

            for(int ngbr:adj.get(curr)){
                if(!visited[ngbr]){
                    visited[ngbr]=true;
                    q.add(ngbr);
                }
            }
        }
        return res;

    }

}
