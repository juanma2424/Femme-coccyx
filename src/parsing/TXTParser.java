package parsing;

import structures.BPTree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sample.WordSample;

//"C:\\Users\\vi6sa\\OneDrive\\Escritorio\\ThePrince.txt"

public class TXTParser{

    private int TXTsize;
    private int block_size;
    private String direc;
    private Scanner scanner;
    private Random randint;
    
    private final String regex = "[a-z].*";
    
    private final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                                       "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                                       "u", "v", "w", "x", "y", "z"};
    private final int regions = 9;
   
    public TXTParser(String direc){
        this.direc = direc;
        this.randint = new Random();
        this.resize();
        setScanner();
    }
    
    public TXTParser(){ this.randint = new Random(); }
    
    public int getTXTsize(){
        this.setScanner();
        int nword = 0;
        while (scanner.hasNext()){
            scanner.next();
            nword++;
        }
        return nword;
    }
    
    private void loadwithVocals(BPTree tree, int N){
        for (String letter : alphabet) {
            BPTree<String, WordSample> dtree = new BPTree<>(N);
            tree.insert(letter, dtree);
        }
    }

    
    private void loadwithTXT(BPTree< String, BPTree<String, WordSample>> tree, int MIN_SIZE, int MAX_SIZE){
        
        int n = 0;
        
        this.setScanner();
        while (this.scanner.hasNext()){
            String word = scanner.next().toLowerCase();
            if (word.matches(regex) && word.length() >= MIN_SIZE && word.length() <= MAX_SIZE){
                if (0 <= randint.nextInt(100) + 1){
                   if (tree.search(word.substring(0,1)).search(word) == null){
                       WordSample sample = new WordSample( this.getRegion(n), word);
                        tree.search(word.substring(0,1)).insert(word , sample);
                   }
                   else{
                       tree.search(word.substring(0, 1)).search(word).increaseCounter();
                   }
                }
            }
            n++;
        }
        System.out.println(n);
    }
    
    public BPTree getBTree(int M, int N, int MAX_SIZE, int MIN_SIZE){
        BPTree<String,BPTree<String, WordSample> > tree = new BPTree<>(M);
        this.loadwithVocals(tree, N);
        this.loadwithTXT(tree, MAX_SIZE, MIN_SIZE);
        return tree;
    }
    
    public void setDirec(String direc){
        this.direc = direc;
        this.resize();
        this.setScanner();
    }
    
    private void resize(){
        this.TXTsize = this.getTXTsize();
        this.block_size = this.TXTsize / this.regions;
    }
    
    public String getDirec(){
        return this.direc;
    }    
    
    private void setScanner( ){
        try {
            this.scanner = new Scanner(new File(this.direc));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TXTParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    private int getRegion(int n) {
        if (n / this.block_size + 1 <= this.regions){
            return n / this.block_size + 1;
        }
        return this.regions;
    }
}
