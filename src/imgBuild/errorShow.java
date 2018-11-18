
package imgBuild;

import GUI.ErrorURL;

public class errorShow {
    
    //---------VARIABLE--------------//
    private static errorShow myWindow;
    private static ErrorURL error;
    //---------------------------//

    
     //-------CONSTRUCTOR---------//
    private errorShow() {
         error = new ErrorURL();
         error.setVisible(false);
    }
    //---------------------------//
   
    
    //-----------SETBOOL---------------------//
    public static void setError(boolean bool) {
        error.setVisible(bool); 
    }
    //---------------------------------------//

    //----------------GET----WINDOWS------------------//
    public static errorShow getSingletonInstance() {
        if (myWindow == null){
            myWindow = new errorShow();
        }
        else{
            error.setVisible(false);
        }
        return myWindow;
    }
   //------------------------------------------------//
    
}
