
package sample;

import java.awt.Color;
import java.util.ArrayList;

public class pixelSample {
    //----VARIEABLE--//
    int posX;
    int posY;
    int id;
    int cantidad = 1;
    int fakeID ;
    int sector;

    

    public int getFakeID() {
        return fakeID;
    }

    public void setFakeID(int fakeID) {
        this.fakeID = fakeID;
    }
    int color;
    String tag;

    
    ArrayList<Integer> position = new ArrayList<>();
    //----------------//
   
    //--------------MAKE A SAMBLE PIX -----------------------//
    public pixelSample (int id,int pX, int pY, int pcolor, int psec) {
        this.id = id;
        this.posX = pX;
        this.posY = pY;
        this.color = pcolor;
        this.cantidad = 1;
        this.sector = psec;
    }
     //-----------------------------------------------------//
   
    
    //------------------GET&SET------------------------//
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    public ArrayList<Integer> getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position.add(x);
        this.position.add(y);
    }
    
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }
    //-------------------------------------------------//
    
    
    
    
    
}
