/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import RGBSample.oneID;
import Thread.ImagePixel;
import Thread.pixMap;
import Thread.sacanRegion;
import Thread.scanMap;
import imgBuild.Azure;
import imgBuild.DataTXT;
import imgBuild.MoreApere;
import imgBuild.ProcessImage;
import imgBuild.errorShow;
import imgBuild.searchImg;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import sample.pixelSample;

public class Menu extends javax.swing.JFrame {

//////////////////////////////INSTANCE//////////////////////////////////////////
    MoreApere bigColor = new MoreApere();
    Azure azure = new Azure();
    searchImg imgset = new searchImg();
    ProcessImage pro = new ProcessImage();
    errorShow myWindow = errorShow.getSingletonInstance();
    DataTXT mydata = DataTXT.getSingletonInstance();
    ProcessImage ObjProcesamiento = new ProcessImage();
    oneID ONE = new oneID();
////////////////////////////////////////////////////////////////////////////////

///////////////////////////////VARIABLES/////////////////////////////////////////
    String URLDATA;
    Image URLIMG;
    static File archivo;
    Color blue;

    ArrayList<pixelSample> sector1 = new ArrayList<>();
    ArrayList<pixelSample> sector2 = new ArrayList<>();
    ArrayList<pixelSample> sector3 = new ArrayList<>();
    ArrayList<pixelSample> sector4 = new ArrayList<>();
    ArrayList<pixelSample> sector5 = new ArrayList<>();
    ArrayList<pixelSample> sector6 = new ArrayList<>();
    ArrayList<pixelSample> sector7 = new ArrayList<>();
    ArrayList<pixelSample> sector8 = new ArrayList<>();
    ArrayList<pixelSample> sector9 = new ArrayList<>();
////////////////////////////////////////////////////////////////////////////////

////////////////////////////GET&SET/////////////////////////////////////////////
    public static File getArchivo() {
        return archivo;
    }

    public static void setArchivo(File archivo) {
        Menu.archivo = archivo;
    }
////////////////////////////////////////////////////////////////////////////////

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto 2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(790, 420));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(790, 420));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(790, 420));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/CoccyxMenugris.png"))); // NOI18N
        jScrollPane1.setViewportView(jLabel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 900, 530));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 900, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bchrome.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 60, 60));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bdoc.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 160, 60, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bimg.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 60, 60));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/CoccyxMenu.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
///////////////////////////////SEARCHTXT////////////////////////////////////////
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        selectorArchivos.showOpenDialog(this);
/////////////////////////////PARSER/////////////////////////////////////////////        
        archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado
        System.out.println(archivo);
        setArchivo(archivo);
        DataTXT.setData(true);
////////////////////////////////////////////////////////////////////////////////        
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {

            //------------GETURL--------------//
            URLDATA = jTextArea1.getText();//url
            URLIMG = imgset.ImagenURL(URLDATA);// Image del url
            //---------------------------------//

            if (URLIMG != null) {
                //-SET-IMG-// 
                jLabel3.setIcon(new ImageIcon(URLIMG));//SHARE IMG
                //--------//

                //----------------THREAD-------------------------------------//
                Runnable miRunnabl = () -> {
                     azure.setImageToAnalyze(URLDATA);//SHARE AZURE
                };
                Thread hilo1 = new Thread(miRunnabl);//MAKE THREAD 
                hilo1.start();
                //-----------------------------------------------------------//
                jTextArea1.setText("");//RESET JTEXTAREA
            } else {
                jTextArea1.setText("");//RESET JTEXTAREA
                errorShow.setError(true);//SHOW ERROR
            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//////////////////////////////////SHAREIMG//////////////////////////////////////       
        pro.setImageActual((BufferedImage) URLIMG);
        jLabel3.setIcon(new ImageIcon(pro.escalaGrises(3, 3)));
        ArrayList<pixelSample> dato = pro.getExtract1();
        int cantdatos = dato.size();
        int cantdiv = dato.size() / 9;

        //-------------------------EX1---------------------------//
        //------------cut img in 9 regions-----------------------//   
        ExecutorService executor = Executors.newFixedThreadPool(7);
        scanMap sector = new scanMap(new pixMap(dato));

        Runnable secto = sector;
        executor.execute(secto);

        executor.shutdown();	// Cierro el Executor
        while (!executor.isTerminated()) {
            // Espero a que terminen de ejecutarse todos los procesos 
            // para pasar a las siguientes instrucciones 
        }
        //------------------------------------------------------//
        
        //-------------------EX2---------------------------------//
        //-----------delet same id sample-----------------------//  
        ArrayList<ImagePixel> Pixels = new ArrayList<ImagePixel>();
       
        Pixels.add(new ImagePixel(sector.getSector1()));
        Pixels.add(new ImagePixel(sector.getSector2()));
        Pixels.add(new ImagePixel(sector.getSector3()));
        Pixels.add(new ImagePixel(sector.getSector4()));
        Pixels.add(new ImagePixel(sector.getSector5()));
        Pixels.add(new ImagePixel(sector.getSector6()));
        Pixels.add(new ImagePixel(sector.getSector7()));
        Pixels.add(new ImagePixel(sector.getSector8()));
        Pixels.add(new ImagePixel(sector.getSector9()));

        ExecutorService executor1 = Executors.newFixedThreadPool(7);
        for (ImagePixel sample: Pixels) { 
            sacanRegion regio =  new sacanRegion(sample);
            Runnable re = regio;
            executor1.execute(re);
                   
        }
        executor1.shutdown();
        while (!executor1.isTerminated()) {
        	
        }
        //-------------------------------------------------------------------//
        
        
        
        
///////////////////////////////////////////////////////////////////////////////        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
