package sample;

public class WordSample {
    
    public int region;
    public String word;
    public int counter;
    
    public WordSample(int region, String word){
        this.region = region;
        this.word = word;
        this.counter = 1;
    }
    
    public void increaseCounter(){
        this.counter++;
    }
    
}
