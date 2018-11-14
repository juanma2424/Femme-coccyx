/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imgBuild;

import GUI.ErrorURL;

public class errorShow {
    private static errorShow myWindow;
    private static ErrorURL error;

    private errorShow() {
         error = new ErrorURL();
         error.setVisible(true);
    }

   
    public static void setError(boolean bool) {
        error.setVisible(bool); 
    }

    public static errorShow getSingletonInstance() {
        if (myWindow == null){
            myWindow = new errorShow();
        }
        else{
            error.setVisible(true);
        }
        return myWindow;
    }
    
}
