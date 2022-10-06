import java.util.* ;
import java.io.*; 
public class Solution {
    public static String pathMoreThanK(int n, int m, int k, int[][] edges) {
        //creare the graph
        List<List<Node>> graph = new ArrayList<>();
        
        for(int i=0;i<n;i++)
            graph.add(new ArrayList<Node>());
        
        for(int i=0;i<m;i++){
            graph.get(edges[i][0]).add(new Node(edges[i][1],edges[i][2]));
            graph.get(edges[i][1]).add(new Node(edges[i][0],edges[i][2]));
        }
        
        boolean[] visited = new boolean[n];
        if(checkPathMoreThanK(graph,0,k,0,visited))
            return "YES";
        return "NO";
    }
    
    static boolean checkPathMoreThanK(List<List<Node>> graph,int v,int k,int sum,boolean[] visited){
        if(sum>=k)
            return true;
        if(visited[v])
            return false;
        
        visited[v] = true;
        for(Node adjNode:graph.get(v)){
                if(!visited[adjNode.vertex]){
                    if(checkPathMoreThanK(graph,adjNode.vertex,k,sum+adjNode.weight,visited))
                        return true;
                }
        }
        visited[v] = false;
        return false;
        
    }
}

class Node{
    int vertex;
    int weight;
    
    public Node(int v,int w){
        vertex = v;
        weight = w;
    }
}