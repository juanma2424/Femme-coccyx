package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javafx.util.Pair;

class Relation{
    
    Relation(int a, int b){this.destiny = a; this.weight = b;};
    int destiny;
    int weight;
}

public class Graph {
    
    private int V;
    public int head;
    private LinkedList<Pair<Integer,Integer>> adj[];
    
    
    public Graph(int v){ 
            V = v; 
            adj = new LinkedList[v]; 
            for (int i=0; i<v; ++i) 
                adj[i] = new LinkedList(); 
        } 
        
    public void add(int a,int b, int c){
        adj[a].add(new Pair<Integer,Integer>(b,c));
    }
    
        void DFSUtil(int v,boolean visited[], ArrayList<Integer> Ids) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" ");
        Ids.add(v);
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Pair<Integer,Integer>> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next().getKey(); 
            if (!visited[n]) 
                DFSUtil(n, visited, Ids); 
        } 
    } 
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    public ArrayList<Integer> DFS(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
        ArrayList<Integer> Ids = new ArrayList<>();
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited, Ids);
        return Ids;
    } 
    
    
    public void setHead(int n){this.head = n;}
    
    public int getHead(){return this.head;}
}