package imgBuild;

import java.awt.Color;
import java.io.IOException;
import java.util.Objects;
import sample.pixelSample;

public class MoreApere {

    Color bigColor;
    int posI;

    public void dataJNI(pixelSample[] dato) throws IOException {
            int max = 0;
            System.out.println(" datinn  "+dato[0].getCantidad());
            for (int i = 0; i < dato.length; i++) {
                 try {
                if (max < dato[i].getCantidad()) {
                        max = dato[i].getCantidad();
                        setBigColor(dato[i].getColor());
                    }
                 } catch (Exception e) {
                }
            }
        
    }
    
    public void ID_One(pixelSample[] dato) {
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < dato.length; j++) {
                if (i != j && (Objects.equals(dato[i], dato[j]))) {
                    try {
                        dato[i].setCantidad(((dato[i].getCantidad()) + (1)));
                        dato[i].setPosition(  dato[j].getPosX(), dato[j].getPosY());
                        dato[j]=null;
                       
                    } catch (Exception e) {

                    }

                }
            }
        }
    }

    public Color getBigColor() {
        return bigColor;
    }

    public void setBigColor(Color bigColor) {
        this.bigColor = bigColor;
    }

    public int getPosI() {
        return posI;
    }

    public void setPosI(int posI) {
        this.posI = posI;
    }

}
