
package Thread;



import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import sample.pixelSample;

public class mainT {
    
    

    public static void main(String[] args) {
    int M = 1;
    int N =  9;
    for (int i = 0; i < (1048576) ; i++) {
            
            int num = (int) Math.floor(Math.random() * (N - M +1) + M);
            System.out.println(num);
             
        }      
}

}