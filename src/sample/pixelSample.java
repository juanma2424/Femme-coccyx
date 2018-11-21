
package sample;

import java.awt.Color;
import java.util.ArrayList;

public class pixelSample {
    //----VARIEABLE--//
    int posX;
    int posY;
    int id;
    int cantidad = 1;
    Color color;

    ArrayList<Integer> position = new ArrayList<>();
    //----------------//
   
    //--------------MAKE A SAMBLE PIX -----------------------//
    public pixelSample (int id,int pX, int pY, Color pcolor) {
        this.id = id;
        this.posX = pX;
        this.posY = pY;
        this.color = pcolor;
        this.cantidad = 1;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public ArrayList<Integer> getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position.add(x);
        this.position.add(y);
    }
    //-------------------------------------------------//
    
    
    
    
    
}
