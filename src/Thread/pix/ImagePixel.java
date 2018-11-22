package Thread.pix;

import java.util.ArrayList;
import sample.pixelSample;

public class ImagePixel {

    //-------VARIABLE-------//
    private ArrayList<pixelSample> region = new ArrayList<>();

    public ArrayList<pixelSample> getBigData() {
        return bigData;
    }

    public void setBigData(ArrayList<pixelSample> bigData) {
        this.bigData = bigData;
    }
    private ArrayList<pixelSample> bigData = new ArrayList<>();
    //----------------------//

    //EMPY CONSTRUCTOR//
    public ImagePixel() {
    }
    //----------------//

    //-------NAME  ARRAY  CONSTRUCTO----------------//
    public ImagePixel(ArrayList<pixelSample> pregion,ArrayList<pixelSample> data ) {
        this.region = pregion;
        this.bigData = data;
    }
    //----------------------------------------------//

    //-----------------------GET&SET-----------------------//
    public ArrayList<pixelSample> getRegion() {
        return region;
    }

    public void setRegion(ArrayList<pixelSample> region) {
        this.region = region;
    }
    //-----------------------------------------------------//

}
