/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imgBuild;

import GUI.textData;


public class DataTXT {
     
    private static DataTXT myWindow;
    private static textData datatxt;

    private DataTXT() {
         datatxt = new textData();
         datatxt.setVisible(false);
    }

    public static void setData(boolean bool) {
        datatxt.setVisible(bool); 
    }

    public static DataTXT getSingletonInstance() {
        if (myWindow == null){
            myWindow = new DataTXT();
        }
        else{
            datatxt.setVisible(false);
        }
        return myWindow;
    }
    

    
}
