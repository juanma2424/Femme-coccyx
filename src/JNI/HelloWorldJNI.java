package JNI;

import java.util.ArrayList;
import java.util.HashMap;
import structures.Graph;

public class HelloWorldJNI {
    
    static {
        System.load("C:\\Users\\USER\\Documents\\NetBeansProjects\\JNITester\\dist\\Debug\\MinGW-Windows\\libJNITester.dll");}
    
    public native void nativePrint(ArrayList<Integer> Ids, Graph graph, HashMap map, int MOST);
   
}
