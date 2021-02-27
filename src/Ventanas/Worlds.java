package Ventanas;

import Main.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Worlds extends javax.swing.JFrame 
{
    static DefaultListModel<Mundo> lM = new DefaultListModel<Mundo>();
    
    public Worlds() 
    {   
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Survival_ICO.png")).getImage());
        initComponents();
            
        setLocationRelativeTo(null);
        
        File folder = new File("Worlds");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles)
        {
            leerMundo(file);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Survival 1.0");
        setResizable(false);

        jList1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jList1.setModel(lM);
        jList1.addListSelectionListener(new ListSelectionListener() 
            {

                @Override
                public void valueChanged(ListSelectionEvent arg0) 
                {
                    if (!arg0.getValueIsAdjusting())
                    {
                        jButton4.setEnabled(true);
                        jButton2.setEnabled(true);
                    }
                }
            });
            add(jList1);

            setVisible(true);
            jScrollPane1.setViewportView(jList1);

            jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            jButton1.setText("New World");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
            jButton4.setText("Play");
            jButton4.setEnabled(false);

            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

            jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
            jButton2.setText("Delete World");
            jButton2.setEnabled(false);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(21, 21, 21))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Mundo mundo = jList1.getSelectedValue();
        
        if(mundo == null) return;
        
        Ventana v = new Ventana(mundo);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CreateWorld cW = new CreateWorld(this, true, this);
        cW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Mundo mundo = jList1.getSelectedValue();
        
        if(mundo == null) return;
        
        File folder = new File("Worlds");
        File[] listOfFiles = folder.listFiles();
        
        for (File file : listOfFiles)
        {   
            if(file.getName().equals(mundo.getName() + ".bin"))
            {
                System.gc(); 
                boolean result = file.delete(); 
                
                if (!result)
                { 
                    try 
                    { 
                        Thread.sleep(100);
                    } 
                    catch (InterruptedException ex) 
                    {
                        System.err.println("Error, " + ex);
                    }
                    System.gc();
                    result = file.delete(); 
                }
                
                lM.removeElement(mundo);
            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void leerMundo(File file)
    { 
        Mundo m = null;
        
        try 
        {
            FileInputStream archivo = new FileInputStream(file);
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while(true) //Recorremos el archivo binario
            {
                m = (Mundo) lectura.readObject();
                updateJList(m);
            }
        } 
        catch(EOFException ex)
        {
            return; //Finalizo de leer todo el archivo binario
        }
        catch (FileNotFoundException ex)
        {
            System.err.println("Error, " + ex);
        }
        catch (IOException ex) 
        {
            System.err.println("Error, " + ex);
        }
        catch (ClassNotFoundException ex) 
        {
            System.err.println("Error, " + ex);
        }
    }
    
    public static void updateJList(Mundo m)
    {
        lM.addElement(m);
    }
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Worlds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Worlds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Worlds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Worlds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            Worlds w = new Worlds();
            public void run()
            {
                w.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JList<Mundo> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
