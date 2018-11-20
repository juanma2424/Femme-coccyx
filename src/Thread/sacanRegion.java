package Thread;

import java.util.ArrayList;
import java.util.Objects;
import sample.pixelSample;

public class sacanRegion implements Runnable {

    //-----VARIEABLE--------//    
    private ImagePixel sample;
    ArrayList<pixelSample> bigdata = new ArrayList<>();
    //----------------------//

    //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
    public sacanRegion(ImagePixel sample) {
        this.sample = sample;
    }
    //----------------------------------------------------//

    @Override
    public void run() {
        try {
            for (int i = 0; i < this.sample.getRegion().size(); i++) {
                for (int j = 0; j < this.sample.getRegion().size(); j++) {
                    if (i != j && (Objects.equals(this.sample.getRegion().get(i) , this.sample.getRegion().get(j)))) {

                        this.sample.getRegion().get(i).setCantidad(((this.sample.getRegion().get(i).getCantidad()) + (1)));//incremente el contador
                        this.sample.getRegion().get(i).setPosition(this.sample.getRegion().get(j).getPosX(), this.sample.getRegion().get(j).getPosY());//guarda pos
                        this.sample.getRegion().remove(j);//remueve los datos

                    }

                }
                bigdata.add(this.sample.getRegion().get(i));
                System.out.println("dataaa  " + bigdata.get(i).getId());
            }

//        ID_One(this.sample.getRegion());
        } catch (Exception e) {
        }
    }

    

    //-------------------------------GET&SET-------------------------------//
    public ArrayList<pixelSample> getBigdata() {
        return bigdata;
    }

    public void setBigdata(ArrayList<pixelSample> bigdata) {
        this.bigdata = bigdata;
    }

}
