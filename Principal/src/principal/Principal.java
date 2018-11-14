/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;


import javax.swing.*;


public class Principal extends JApplet {
 
 JLabel etiqueta;
 JTextField txt;
 
 public void init(){
  
  JPanel parriba=new JPanel();
  parriba.add(new JLabel("URL Imagen: "));
  txt=new JTextField(15);
  txt.addActionListener(new ActionListener(){


   @Override
   public void actionPerformed(ActionEvent e) {
    try {
     Image img=getImage(new URL(txt.getText()));
     etiqueta.setIcon(new ImageIcon(img));
     repaint();
    } catch (MalformedURLException ex) {
     // TODO Auto-generated catch block
     ex.printStackTrace();
    }
   }
   
  });
  parriba.add(txt);
    
  etiqueta=new JLabel();
  
  add(parriba,BorderLayout.NORTH);
  JScrollPane scroll=new JScrollPane(etiqueta);
  add(scroll);
  
 }
}


