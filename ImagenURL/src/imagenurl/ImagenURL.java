/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagenurl;

import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static sun.security.jgss.GSSToken.debug;
 
/**
 *
 * @author Rafa
 */
public class ImagenURL extends JFrame{
   
    public ImagenURL() throws IOException {
       
        ///super("ImagenURL"); //establece nombre a JFrame
        URL url = new URL("https://i.pinimg.com/originals/83/0b/65/830b6552988ba0405bd84d3ecb7a705e.png");
       
        Image image = ImageIO.read(url);
       
        //Creal el JLabel y ingresa la imagen sobre el.
        JLabel label = new JLabel(new ImageIcon(image));
 
        //Establece las barras de desplazamiento de la imagen
        JScrollPane scroll = new JScrollPane(label);
        add(scroll);
    }
   
    private URL url;//Tomara el valor del textField 
    private URLConnection urlCon;//Para obtener datos de la conexión 
     private String ex;//Para mostrar extensión de archivo
     private javax.swing.JLabel label; 
    private javax.swing.JLabel label1; 
    private ImageIcon icono;//Imagen que mostraremos 
     private ImageIcon icon;//Imagen que mostraremos 
     private Component c = this;//Para referenciar al frame 
     
     
    private void Carga() {//Método que abre una conexión y descarga una imagen desde una URL

        String s = "https://i.pinimg.com/originals/83/0b/65/830b6552988ba0405bd84d3ecb7a705e.png";//Texto del campo 
        try { 
            url = new URL(s);//Inicio de la variable url 
            setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));//Como demora ponemos cursor de espera
            try { 
                urlCon = url.openConnection();//Inicio de la conexión 

                if (urlCon.getContentType() != null) {//Si hay formato de imagen (No estoy seguro...)
                    ex = urlCon.getContentType();//Obtiene el tipo de imgen  por Ej.: image/jpg
                    ex = "." + ex.substring(ex.length() - 3, ex.length());//Cambiamos lo anterior por Ej.: por ".jpg"
                     
                    if (ex.equals(".peg")) {//A lo gaucho nomás 
                        ex = ".jpg"; 
                    } 
                    label1.setText("<html>" 
                            + "Tamaño:  " + (urlCon.getContentLength() / 1024) + " Kb<br>"//Para saber el tamaño en KB
                            + "Tipo: imagen" + ex); 
                    icon = new ImageIcon(url);//Iniciamos imagen en un ImageIcon y luego la
                    //redimensionamos al tamaño de la etiqueta 
                    icono = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
                    label.setIcon(icono); 
                    label.setText(null); 
                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//Una vez cargada ponemos cursor x defecto

                } else {//Si urlCon.getContentType()==null 
                    JOptionPane.showMessageDialog(c, "No hay Conexión!", "Error", 0);
                    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));//Ponemos cursor x defecto
                } 

            } catch (IOException e) { 
                debug(e.getMessage()); 
            } 

        } catch (MalformedURLException e) {//Si la URL ingresada no corresponde con el formato URL
            if (s != null) { 
                JOptionPane.showMessageDialog(c, "Puede que la URL:n " 
                        + s + "n" 
                        + "no sea correcta", "", 2); 
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR)); 
            } 
        } 
    } 
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws IOException {
        ImagenURL imagen = new ImagenURL();
        imagen.setSize(400, 400);
        imagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagen.setVisible(true);
        imagen.setLocationRelativeTo(null);
    }
}