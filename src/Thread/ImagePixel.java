package Thread;

import java.util.ArrayList;
import sample.pixelSample;

public class ImagePixel {

    //-------VARIABLE-------//
    private ArrayList<pixelSample> region = new ArrayList<>();
    //----------------------//

    //EMPY CONSTRUCTOR//
    public ImagePixel() {
    }
    //----------------//

    //-------NAME  ARRAY  CONSTRUCTO----------------//
    public ImagePixel(ArrayList<pixelSample> pregion) {
        this.region = pregion;
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
