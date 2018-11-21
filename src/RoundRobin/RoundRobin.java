//https://www.geeksforgeeks.org/round-robin-scheduling-with-different-arrival-times/
package RoundRobin;

import java.util.ArrayList;
import percentage.extractPixel;
import sample.pixelSample;

public class RoundRobin {

    int first;
    int second;
    ArrayList<pixelSample> bigTag = new ArrayList<>();
    
    public static void roundRobin(ArrayList<pixelSample> p, int[] a, int[] b, int n) {
        // resultado de tiempos promedio
        int res = 0;
        int resc = 0;
        

        // para almacenamiento de secuencias
        String seq = new String();

        // Copia la matriz de ráfaga y la matriz de llegada
        // por no afectar la matriz real
        int res_b[] = new int[b.length];
        int res_a[] = new int[a.length];

        for (int i = 0; i < res_b.length; i++) {
            res_b[i] = b[i];
            res_a[i] = a[i];
        }

        // tiempo crítico del sistema
        int t = 0;

        // para almacenar el tiempo de espera
        int w[] = new int[p.size()];

        //para almacenar el tiempo de finalización
        int comp[] = new int[p.size()];

        while (true) {
            boolean flag = true;
            for (int i = 0; i < p.size(); i++) {

                // estas condiciones para si
                // la llegada no está en cero
               // comprueba que si llega antes de qtime
                if (res_a[i] <= t) {
                    if (res_a[i] <= n) {
                        if (res_b[i] > 0) {
                            flag = false;
                            if (res_b[i] > n) {

                               // hacer disminuir el tiempo b
                                t = t + n;
                                res_b[i] = res_b[i] - n;
                                res_a[i] = res_a[i] + n;
                                seq += "->" + p.get(i);
                            } else {

                                // por última vez

                                t = t + res_b[i];

                                //  tiempo de compensación 
                                comp[i] = t - a[i];

                                // tiempo de espera
                                w[i] = t - b[i] - a[i];
                                res_b[i] = 0;

                                // add sequence
                                seq += "->" + p.get(i);
                            }
                        }
                    } else if (res_a[i] > n) {

                        // es alguno tiene menos tiempo de llegada
                       // el proceso venidero y luego ejecutarlo
                        for (int j = 0; j < p.size(); j++) {

                            // compare 
                            if (res_a[j] < res_a[i]) {
                                if (res_b[j] > 0) {
                                    flag = false;
                                    if (res_b[j] > n) {
                                        t = t + n;
                                        res_b[j] = res_b[j] - n;
                                        res_a[j] = res_a[j] + n;
                                        seq += "->" + p.get(i);
                                    } else {
                                        t = t + res_b[j];
                                        comp[j] = t - a[j];
                                        w[j] = t - b[j] - a[j];
                                        res_b[j] = 0;
                                        seq += "->" + p.get(i);
                                    }
                                }
                            }
                        }

                        // ahora el proceso anterior 
                        if (res_b[i] > 0) {
                            flag = false;

                            // Verificar si hay grandes
                            if (res_b[i] > n) {
                                t = t + n;
                                res_b[i] = res_b[i] - n;
                                res_a[i] = res_a[i] + n;
                                seq += "->" + p.get(i);
                            } else {
                                t = t + res_b[i];
                                comp[i] = t - a[i];
                                w[i] = t - b[i] - a[i];
                                res_b[i] = 0;
                                seq += "->" + p.get(i);
                            }
                        }
                    }
                } // // si no hay ningún proceso en estos críticos
                else if (res_a[i] > t) {
                    t++;
                    i--;
                }
            }
            // para salir del bucle while
            if (flag) {
                break;
            }
        }

        System.out.println("name  ctime  wtime");
        for (int i = 0; i < p.size(); i++) {
            System.out.println(" " + p.get(i) + "    " + comp[i]
                    + "    " + w[i]);

            res = res + w[i];
            resc = resc + comp[i];
        }

        System.out.println("Average waiting time is "
                + (float) res / p.size());
        System.out.println("Average compilation  time is "
                + (float) resc / p.size());
        System.out.println("Sequence is like that " + seq);
    }

    
    
    
    
    
    public ArrayList<pixelSample> distribute(ArrayList<Double> conf, ArrayList<String> tag ,  ArrayList<pixelSample> sample){
        System.out.println("sample " + sample.size());
        double sum = 0;
	int cont = 0;

	for (int i = 0; i < conf.size(); i++){
		sum += conf.get(i);
	}
        
	for (int i = 0; i < tag.size(); i++){
                
		double quant = (sample.size() * (((conf.get(i) * 100) / sum) / 100));
                
                if (cont + quant > sample.size()){
                    quant = sample.size() - cont; 
                }
               
		for (int j = 0; j < quant; j++){
                    System.out.println("cont " + quant);
			sample.get(cont).setTag(tag.get(i));
			cont++;
		}
                
                
	}
        return sample;
        
    }
    
    
   
    public void make(ArrayList<Double> conf, ArrayList<String> tag ,  ArrayList<pixelSample> sample){
          distribute(conf, tag, sample);
//        
//     
//       
        ArrayList<pixelSample> name = new ArrayList<>(); 
        // name.add(   (distribute(conf, tag, sample))      );
       // pixelSample namet[]= { distribute(conf, tag, sample) };
        //int name[] = { 0, 1, 2, 3};
        // llegada para cada proceso
        int arrivaltime[] = {0};

        // tiempo de ráfaga para cada proceso
        int bursttime[] = {10};

        // time quantum de cada proceso
        int q = 3;
//
        roundRobin(name, arrivaltime, bursttime, q);
    }

}
