
package imgBuild;

import GUI.textData;

public class DataTXT {

    //---------VARIABLE--------------//
    private static DataTXT myWindow;
    private static textData datatxt;
    //---------------------------//

    //-------CONSTRUCTOR---------//
    private DataTXT() {
        datatxt = new textData();
        datatxt.setVisible(false);
    }
    //---------------------------//

    //-----------SETBOOL---------------------//
    public static void setData(boolean bool) {
        datatxt.setVisible(bool);
    }
    //---------------------------------------//

    //----------------GET----WINDOWS------------------//
    public static DataTXT getSingletonInstance() {
        if (myWindow == null) {
            myWindow = new DataTXT();
        } else {
            datatxt.setVisible(false);
        }
        return myWindow;
    }
    //--------------------------------------------//
}
