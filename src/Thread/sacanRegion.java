package Thread;

import java.util.ArrayList;
import java.util.Objects;
import sample.pixelSample;

public class sacanRegion implements Runnable {

    //-----VARIEABLE--------//    
    private ImagePixel sample;
    int contador = 0;
    private ArrayList<pixelSample> bigdata;
    //----------------------//

    //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
    public sacanRegion(ImagePixel sample, ArrayList<pixelSample> data) {
        this.sample = sample;
        this.bigdata = data;

    }
    //----------------------------------------------------//

    @Override
    public void run() {

        ArrayList<pixelSample> a = this.sample.getRegion();
        ArrayList<pixelSample> b = this.sample.getRegion();
        int posx;
        int posy;

        for (int i = 0; i < a.size(); i++) {

            for (int j = 0; j < b.size(); j++) {

                if (i != j && (a.get(i).getId() == b.get(j).getId())) {

                    a.get(i).setCantidad(((a.get(i).getCantidad()) + (1)));//incremente el contador
                    a.get(i).setPosition(a.get(j).getPosX(), a.get(j).getPosY());//guarda pos
                    a.remove(j);//remueve los datos

                }

            }
            if (i < a.size() && (a.get(i)!=null)) {
                this.bigdata.add(a.get(i));
                setBigdata(bigdata);
            }

        }

    }

    //-------------------------------GET&SET-------------------------------//
    public ArrayList<pixelSample> getBigdata() {
        return this.bigdata;
    }

    public void setBigdata(ArrayList<pixelSample> bigdata) {
        this.bigdata = bigdata;
    }

}
