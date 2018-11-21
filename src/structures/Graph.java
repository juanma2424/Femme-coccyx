package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Relation{
    
    Relation(int a, int b){this.destiny = a; this.weight = b;};
    int destiny;
    int weight;
}

public class Graph {
    
    public HashMap<Integer, List<Relation>> representation;
    
    public Graph(){ this.representation = new HashMap<>(); }
    
    public void add(int a, int b, int c){
        if (this.representation.get(a) != null)
            this.representation.get(a).add(new Relation(b,c));
        else{
            List<Relation> relations = new ArrayList<>();
            relations.add(new Relation(b,c));
            this.representation.put(a, relations);
        }
    }
    
    public void getRelations(int n){
        for (int i = 0; i < this.representation.get(n).size(); i++){
            System.out.println("JAVA: " + n + " esta relacionado con "  + this.representation.get(n).get(i).destiny + " con un peso de " + this.representation.get(n).get(i).weight);
        }
    }
}

