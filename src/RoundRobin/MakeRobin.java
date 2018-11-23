//http://inaved-momin.blogspot.com/2013/02/round-robin-in-java.html
//https://es.stackoverflow.com/questions/38599/crear-n%C3%BAmeros-aleatorios-sin-que-se-repitan
package RoundRobin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class MakeRobin {

    Map<Integer, Boolean> repit = new HashMap<Integer, Boolean>();
    ArrayList<Double> conf;
    ArrayList<String> tag;
  
    Map<Integer, pixelSample> sample;
    int listpx;
     int random;

    public int getListpx() {
        return listpx;
    }

    public void setListpx(int listpx) {
        this.listpx = listpx;
    }

    int[] temp;
    int commBT, k, tq;
    int[][] d;
    int btcache;

    public void getData(int ppcount, int pm, int ptq) {

        int pcount = ppcount;
        d = new int[pcount][2];

        temp = new int[pcount];

        for (int i = 0; i < pcount; i++) {
            d[i][0] = i;

            int m = pm;
            d[i][1] = m;

            commBT += m;
        }

        tq = ptq;
        start();
        distribute();

    }

    void start() {
        for (int i = 0; i < d.length; i++) {
            int bt = d[i][1];
            if (bt > 0) {
                if (bt <= tq) {
                    temp[i] = btcache + bt;
                    btcache = temp[i];
                    k += bt;
                    bt -= bt;

                } else {
                    temp[i] = btcache + tq;
                    btcache = temp[i];
                    bt -= tq;
                    k += tq;
                }

                d[i][1] = bt;

            }
        }
        if (k != commBT) {
            start();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MakeRobin r = new MakeRobin();
        r.getData(1, 1, 2);
    }

    public void distribute() {

       double sum = 0;
       int cont = 0;
       ArrayList<String> tagging = new ArrayList();

	for (int i = 0; i < conf.size(); i++){
		sum += conf.get(i);
	}
        
	for (int i = 0; i < tag.size(); i++){
                
            double quant = (sample.size() * (((conf.get(i) * 100) / sum) / 100));
                
            if (cont + quant > sample.size()){
                quant = sample.size() - cont; 
            }
               
       	    for (int j = 0; j < quant; j++){
                tagging.add(tag.get(i));
            }
	}
        
        for (int j = 0; j < sample.size(); j++){
            int position = (int) (Math.random() * tagging.size());
            System.out.println(position);
            String tagged = tagging.remove(position);
            System.out.println(tagged);
            sample.get(j).setTag(tagged);
           
        }
        
    }

    private void display() {
        float val = 0;
        int c = 1;
        for (int i : temp) {
            System.out.println("BT for process " + c + " is " + i);
            val += i;
            c++;
        }
        System.out.println("avg BT = " + val / temp.length);
    }

    public ArrayList<Double> getConf() {
        return conf;
    }

    public void setConf(ArrayList<Double> conf) {
        this.conf = conf;
    }

    public ArrayList<String> getTag() {
        return tag;
    }

    public void setTag(ArrayList<String> tag) {
        this.tag = tag;
    }

    public Map<Integer, pixelSample> getSample() {
        return sample;
    }

    public void setSample(Map<Integer, pixelSample> sample) {
        this.sample = sample;
    }
   

}
