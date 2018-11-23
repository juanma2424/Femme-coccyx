/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import JNI.HelloWorldJNI;
import RoundRobin.MakeRobin;
import imgBuild.Azure;
import imgBuild.ProcessImage;
import imgBuild.errorShow;
import imgBuild.searchImg;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import proTEXT.proText;
import sample.WordSample;
import sample.pixelSample;
import structures.BPTree;
import structures.Graph;


public class Menu extends javax.swing.JFrame {

//////////////////////////////INSTANCE//////////////////////////////////////////
    proText textag = new proText();
    Azure azure = new Azure();
    searchImg imgset = new searchImg();
    ProcessImage pro = new ProcessImage();
    errorShow myWindow = errorShow.getSingletonInstance();
    textData getdatatex = new textData();
    //ProcessImage ObjProcesamiento = new ProcessImage();
     HashMap<Integer, List<WordSample>> bigwordx;
    MakeRobin r = new MakeRobin();
////////////////////////////////////////////////////////////////////////////////
///////////////////////////////VARIABLES/////////////////////////////////////////
    String URLDATA;
    Image URLIMG;
    static File archivo;
    BPTree<String, BPTree<String, WordSample>> tree;
    File fichero = new File("foto.jpg");
//////////////////////////////NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW//////////////////////////////////////////////////

    Map<Integer, pixelSample> mapaBits = new HashMap<Integer, pixelSample>();
    Map<Integer, ArrayList<pixelSample> > regiones = new HashMap<Integer, ArrayList<pixelSample> >();

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
        jButton4 = new javax.swing.JButton();
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

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 170, 110, 70));

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
        archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionad
        getdatatex.show(true);
        setArchivo(archivo);
        getdatatex.show(true);
////////////////////////////////////////////////////////////////////////////////        
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //////////////////////BOTON DE CARGAR IMAGEN //////////////////////////
        //////////////////////llamada a azure//////////////////////////////////
        try {
            //------------GETURL--------------//
            URLDATA = jTextArea1.getText();//url
            URLIMG = imgset.ImagenURL(URLDATA);// Image del url
            //---------------------------------//

            if (URLIMG != null) {
                //-SET-IMG-// 
                jLabel3.setIcon(new ImageIcon(URLIMG));//SHARE IMG
                //--------//

                //----------------AZURE-------------------------------------//
                azure.setImageToAnalyze(URLDATA);//SHARE AZURE
                //-----------------------------------------------------------//
                jTextArea1.setText("");//RESET JTEXTAREA
            } else {
                jTextArea1.setText("");//RESET JTEXTAREA
                errorShow.setError(true);//SHOW ERROR
            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//////////////////////////////////SHAREIMG//////////////////////////////////////       
        pro.setImageActual((BufferedImage) URLIMG);//SET A LA NUEVA IMG
        jLabel3.setIcon(new ImageIcon(pro.divSectors(3, 3)));// METODO L X A
        Map<Integer, pixelSample> Unicos = new HashMap<Integer, pixelSample>();

         Unicos =  pro.div(this.mapaBits);
         
         System.out.println(" tamano sin rep de 15 % "  + Unicos.size());
        
        regiones = pro.getRegionesAux();
        System.out.println("region 1 todos los samples" + regiones.get(1));
         System.out.println("region 1 todos los samples" + regiones.get(2));
//        
        r.setTag(azure.getName());//TAGS
        r.setConf(azure.getConf());//CONF
        r.setSample(Unicos);//dseteo el map
        r.setListpx(Unicos.size()); // seteo la lista
        r.getData(1, 1, 2);////ROUND ROUBIN
        Unicos = r.getSample();// ya con tags
        
//        for (int i = 0; i < Unicos.size(); i++) {
//            System.out.println(" tag  "  + Unicos.get(i).getTag());
//        }
        
        
        
       
        
        azure.getConf();//obt conf
        azure.getName();// opt tags
        azure.tagTen();// obtiene el top 10
       
        
        int moreId = Unicos.get(pro.getMoreAperret()).getId();
     
        int most_appearance = Unicos.get(pro.getMoreAperret()).getId();// DATO QUE MAS APARECE
     
        
        int david = (Unicos.size());//TAMANO DE LOS DATOS QUE SE PASARAN
        HelloWorldJNI lol = new HelloWorldJNI();// INSTANCIA JN
        Graph graph = new Graph(david);//GRAFO
        ArrayList<Integer> fake = new ArrayList<>();// FACHADA
        for (int i = 0; i < david; i++) {
            fake.add(i);
        }
        
        HashMap<Integer,Integer> map = new HashMap();
        //lol.nativePrint(fake, graph, map, most_appearance);
       bigwordx = getdatatex.getBigwords();// arbol del libro
       textag.setImageActual(pro.getImageActual());// para pintar
       textag.samblestext( azure.getName(),  regiones);
               
/////////////////////////////////////////////////////////////////////////////////        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        pro.getImageActual();
        try {
            ImageIO.write(pro.getImageActual(), "jpg", fichero);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);

        }
        System.out.println("fichero ");
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
