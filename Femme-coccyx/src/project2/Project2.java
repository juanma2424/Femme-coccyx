package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import parsing.TXTParser;
import sample.WordSample;
import structures.BPTree;

public class Project2 {

    public static void main(String[] args) {
        TXTParser parser = new TXTParser();
        parser.setDirec("src\\books\\ThePrince.txt");
        //System.out.println(parser.getTXTsize());
        BPTree<String, BPTree<String, WordSample>> tree = parser.getBTree(6, 6, 1, 9);
        System.out.println(tree.search("a").search("asombroso").counter);
        System.out.println(tree.search("a").search("asombroso").region);
        
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\vi6sa\\OneDrive\\Escritorio\\ThePrince.txt"));
            int n = 0;
            while (scan.hasNext()){
                String a = scan.next().toLowerCase();
                if ("asombroso".equals(a)){
                    n++;
                }
            }
            System.out.println("Las veces que aparece asombroso es: " + n);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Project2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
