package Ventanas;

import Comidas.*;
import Items.*;
import Main.*;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaHorno extends javax.swing.JDialog 
{
    RMundo mundo = new RMundo();
    GItems gItems = new GItems();
    
    Item mItems[][] = new Item[4][9];
    int mC[][] = new int[4][9];
    
    Item item = new Empty();
    int itemC = 0;
    Item auxItem = new Empty();
    int auxItemC = 0;
    
    Item itemHornoI = new Empty();
    int itemHornoIC = 0;
    
    Item itemHornoC = new Empty();
    int itemHornoCC = 0;
    
    Item itemHorneado = new Empty();
    int itemHorneadoC = 0;
    
    int itemHorneadoHL = 0;
    
    public VentanaHorno(java.awt.Frame parent, boolean modal, Item mItems[][], int mC[][]) 
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        this.mItems = mItems;
        this.mC = mC;
        
        JLabel mICL[][] = {{eIC00, eIC01, eIC02, eIC03, eIC04, eIC05, eIC06, eIC07, eIC08},
                           {eIC10, eIC11, eIC12, eIC13, eIC14, eIC15, eIC16, eIC17, eIC18},
                           {eIC20, eIC21, eIC22, eIC23, eIC24, eIC25, eIC26, eIC27, eIC28},
                           {eIC30, eIC31, eIC32, eIC33, eIC34, eIC35, eIC36, eIC37, eIC38}};
        
        JButton mIL[][] = {{eI00, eI01, eI02, eI03, eI04, eI05, eI06, eI07, eI08},
                           {eI10, eI11, eI12, eI13, eI14, eI15, eI16, eI17, eI18},
                           {eI20, eI21, eI22, eI23, eI24, eI25, eI26, eI27, eI28},
                           {eI30, eI31, eI32, eI33, eI34, eI35, eI36, eI37, eI38}};
        
        if(mItems == null || mC == null) return;
        
        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                switch(mC[i][j])
                {
                    case 1:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_1Sprite.png")));
                        break;

                    case 2:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_2Sprite.png")));
                        break;    

                    case 3:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_3Sprite.png")));
                        break;   

                    case 4:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_4Sprite.png")));
                        break;

                    case 5:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_5Sprite.png")));
                        break;    

                    case 6:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_6Sprite.png")));
                        break;   

                    case 7:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_7Sprite.png")));
                        break;   

                    case 8:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_8Sprite.png")));
                        break;

                    case 9:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_9Sprite.png")));
                        break;    

                    case 0:
                        mICL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                        break;    
                }
                
                mIL[i][j].setIcon(new ImageIcon(getClass().getResource(mItems[i][j].getImagen())));
            }
        }
        
        eHCC.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
        eHC.setIcon(new ImageIcon(getClass().getResource(new Empty().getImagen())));
        eHIC.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
        eHI.setIcon(new ImageIcon(getClass().getResource(new Empty().getImagen())));
        eHRC.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
        eHR.setIcon(new ImageIcon(getClass().getResource(new Empty().getImagen())));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHotBar = new javax.swing.JPanel();
        eIC00 = new javax.swing.JLabel();
        eIC01 = new javax.swing.JLabel();
        eIC02 = new javax.swing.JLabel();
        eIC03 = new javax.swing.JLabel();
        eIC04 = new javax.swing.JLabel();
        eIC05 = new javax.swing.JLabel();
        eIC06 = new javax.swing.JLabel();
        eIC07 = new javax.swing.JLabel();
        eIC08 = new javax.swing.JLabel();
        eI00 = new javax.swing.JButton();
        eI01 = new javax.swing.JButton();
        eI02 = new javax.swing.JButton();
        eI03 = new javax.swing.JButton();
        eI04 = new javax.swing.JButton();
        eI05 = new javax.swing.JButton();
        eI06 = new javax.swing.JButton();
        eI07 = new javax.swing.JButton();
        eI08 = new javax.swing.JButton();
        panelInventario = new javax.swing.JPanel();
        eIC10 = new javax.swing.JLabel();
        eIC11 = new javax.swing.JLabel();
        eIC12 = new javax.swing.JLabel();
        eIC13 = new javax.swing.JLabel();
        eIC14 = new javax.swing.JLabel();
        eIC15 = new javax.swing.JLabel();
        eIC16 = new javax.swing.JLabel();
        eIC17 = new javax.swing.JLabel();
        eIC18 = new javax.swing.JLabel();
        eI10 = new javax.swing.JButton();
        eI11 = new javax.swing.JButton();
        eI12 = new javax.swing.JButton();
        eI13 = new javax.swing.JButton();
        eI14 = new javax.swing.JButton();
        eI15 = new javax.swing.JButton();
        eI16 = new javax.swing.JButton();
        eI17 = new javax.swing.JButton();
        eI18 = new javax.swing.JButton();
        eIC20 = new javax.swing.JLabel();
        eIC21 = new javax.swing.JLabel();
        eIC22 = new javax.swing.JLabel();
        eIC23 = new javax.swing.JLabel();
        eIC24 = new javax.swing.JLabel();
        eIC25 = new javax.swing.JLabel();
        eIC26 = new javax.swing.JLabel();
        eIC27 = new javax.swing.JLabel();
        eIC28 = new javax.swing.JLabel();
        eI20 = new javax.swing.JButton();
        eI21 = new javax.swing.JButton();
        eI22 = new javax.swing.JButton();
        eI23 = new javax.swing.JButton();
        eI24 = new javax.swing.JButton();
        eI25 = new javax.swing.JButton();
        eI26 = new javax.swing.JButton();
        eI27 = new javax.swing.JButton();
        eI28 = new javax.swing.JButton();
        eIC30 = new javax.swing.JLabel();
        eIC31 = new javax.swing.JLabel();
        eIC32 = new javax.swing.JLabel();
        eIC33 = new javax.swing.JLabel();
        eIC34 = new javax.swing.JLabel();
        eIC35 = new javax.swing.JLabel();
        eIC36 = new javax.swing.JLabel();
        eIC37 = new javax.swing.JLabel();
        eIC38 = new javax.swing.JLabel();
        eI30 = new javax.swing.JButton();
        eI31 = new javax.swing.JButton();
        eI32 = new javax.swing.JButton();
        eI33 = new javax.swing.JButton();
        eI34 = new javax.swing.JButton();
        eI35 = new javax.swing.JButton();
        eI36 = new javax.swing.JButton();
        eI37 = new javax.swing.JButton();
        eI38 = new javax.swing.JButton();
        panelHorno = new javax.swing.JPanel();
        eHIC = new javax.swing.JLabel();
        eH1 = new javax.swing.JLabel();
        eH2 = new javax.swing.JLabel();
        eHI = new javax.swing.JButton();
        eH3 = new javax.swing.JLabel();
        eH4 = new javax.swing.JLabel();
        eH5 = new javax.swing.JLabel();
        eH6 = new javax.swing.JLabel();
        eHRC = new javax.swing.JLabel();
        eHCC = new javax.swing.JLabel();
        eH7 = new javax.swing.JLabel();
        eHR = new javax.swing.JButton();
        eHC = new javax.swing.JButton();
        eH8 = new javax.swing.JLabel();
        eH9 = new javax.swing.JLabel();
        panelConfiguracion = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        etiquetaH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(525, 783));
        setResizable(false);

        panelHotBar.setBackground(new java.awt.Color(153, 153, 153));
        panelHotBar.setLayout(new java.awt.GridLayout(2, 9));
        panelHotBar.add(eIC00);
        panelHotBar.add(eIC01);
        panelHotBar.add(eIC02);
        panelHotBar.add(eIC03);
        panelHotBar.add(eIC04);
        panelHotBar.add(eIC05);
        panelHotBar.add(eIC06);
        panelHotBar.add(eIC07);
        panelHotBar.add(eIC08);

        eI00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI00MouseReleased(evt);
            }
        });
        panelHotBar.add(eI00);

        eI01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI01MouseReleased(evt);
            }
        });
        panelHotBar.add(eI01);

        eI02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI02MouseReleased(evt);
            }
        });
        panelHotBar.add(eI02);

        eI03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI03MouseReleased(evt);
            }
        });
        panelHotBar.add(eI03);

        eI04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI04MouseReleased(evt);
            }
        });
        panelHotBar.add(eI04);

        eI05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI05MouseReleased(evt);
            }
        });
        panelHotBar.add(eI05);

        eI06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI06MouseReleased(evt);
            }
        });
        panelHotBar.add(eI06);

        eI07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI07MouseReleased(evt);
            }
        });
        panelHotBar.add(eI07);

        eI08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI08MouseReleased(evt);
            }
        });
        panelHotBar.add(eI08);

        panelInventario.setBackground(new java.awt.Color(102, 102, 102));
        panelInventario.setLayout(new java.awt.GridLayout(6, 9));
        panelInventario.add(eIC10);
        panelInventario.add(eIC11);
        panelInventario.add(eIC12);
        panelInventario.add(eIC13);
        panelInventario.add(eIC14);
        panelInventario.add(eIC15);
        panelInventario.add(eIC16);
        panelInventario.add(eIC17);
        panelInventario.add(eIC18);

        eI10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI10MouseReleased(evt);
            }
        });
        panelInventario.add(eI10);

        eI11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI11MouseReleased(evt);
            }
        });
        panelInventario.add(eI11);

        eI12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI12MouseReleased(evt);
            }
        });
        panelInventario.add(eI12);

        eI13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI13MouseReleased(evt);
            }
        });
        panelInventario.add(eI13);

        eI14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI14MouseReleased(evt);
            }
        });
        panelInventario.add(eI14);

        eI15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI15MouseReleased(evt);
            }
        });
        panelInventario.add(eI15);

        eI16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI16MouseReleased(evt);
            }
        });
        panelInventario.add(eI16);

        eI17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI17MouseReleased(evt);
            }
        });
        panelInventario.add(eI17);

        eI18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI18MouseReleased(evt);
            }
        });
        panelInventario.add(eI18);
        panelInventario.add(eIC20);
        panelInventario.add(eIC21);
        panelInventario.add(eIC22);
        panelInventario.add(eIC23);
        panelInventario.add(eIC24);
        panelInventario.add(eIC25);
        panelInventario.add(eIC26);
        panelInventario.add(eIC27);
        panelInventario.add(eIC28);

        eI20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI20MouseReleased(evt);
            }
        });
        panelInventario.add(eI20);

        eI21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI21MouseReleased(evt);
            }
        });
        panelInventario.add(eI21);

        eI22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI22MouseReleased(evt);
            }
        });
        panelInventario.add(eI22);

        eI23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI23MouseReleased(evt);
            }
        });
        panelInventario.add(eI23);

        eI24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI24MouseReleased(evt);
            }
        });
        panelInventario.add(eI24);

        eI25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI25MouseReleased(evt);
            }
        });
        panelInventario.add(eI25);

        eI26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI26MouseReleased(evt);
            }
        });
        panelInventario.add(eI26);

        eI27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI27MouseReleased(evt);
            }
        });
        panelInventario.add(eI27);

        eI28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI28MouseReleased(evt);
            }
        });
        panelInventario.add(eI28);
        panelInventario.add(eIC30);
        panelInventario.add(eIC31);
        panelInventario.add(eIC32);
        panelInventario.add(eIC33);
        panelInventario.add(eIC34);
        panelInventario.add(eIC35);
        panelInventario.add(eIC36);
        panelInventario.add(eIC37);
        panelInventario.add(eIC38);

        eI30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI30MouseReleased(evt);
            }
        });
        panelInventario.add(eI30);

        eI31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI31MouseReleased(evt);
            }
        });
        panelInventario.add(eI31);

        eI32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI32MouseReleased(evt);
            }
        });
        panelInventario.add(eI32);

        eI33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI33MouseReleased(evt);
            }
        });
        panelInventario.add(eI33);

        eI34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI34MouseReleased(evt);
            }
        });
        panelInventario.add(eI34);

        eI35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI35MouseReleased(evt);
            }
        });
        panelInventario.add(eI35);

        eI36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI36MouseReleased(evt);
            }
        });
        panelInventario.add(eI36);

        eI37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI37MouseReleased(evt);
            }
        });
        panelInventario.add(eI37);

        eI38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eI38MouseReleased(evt);
            }
        });
        panelInventario.add(eI38);

        panelHorno.setBackground(new java.awt.Color(51, 51, 51));
        panelHorno.setLayout(new java.awt.GridLayout(5, 3));
        panelHorno.add(eHIC);
        panelHorno.add(eH1);
        panelHorno.add(eH2);

        eHI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eHIMouseReleased(evt);
            }
        });
        panelHorno.add(eHI);
        panelHorno.add(eH3);
        panelHorno.add(eH4);
        panelHorno.add(eH5);
        panelHorno.add(eH6);
        panelHorno.add(eHRC);
        panelHorno.add(eHCC);
        panelHorno.add(eH7);

        eHR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eHRMouseReleased(evt);
            }
        });
        panelHorno.add(eHR);

        eHC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eHCMouseReleased(evt);
            }
        });
        panelHorno.add(eHC);
        panelHorno.add(eH8);
        panelHorno.add(eH9);

        panelConfiguracion.setBackground(new java.awt.Color(102, 102, 102));
        panelConfiguracion.setLayout(new java.awt.GridLayout(1, 1));

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SurvivalSalirSprite.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelConfiguracion.add(botonSalir);

        etiquetaH.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etiquetaH.setText("Oven");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etiquetaH)
                .addContainerGap(436, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(panelHorno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelHotBar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etiquetaH)
                .addContainerGap(675, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelHorno, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(344, 344, 344))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addComponent(panelHotBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eI00MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI00MouseReleased
        tomarItem(eI00, eIC00, 0, 0, evt.getButton());
    }//GEN-LAST:event_eI00MouseReleased

    private void eI01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI01MouseReleased
        tomarItem(eI01, eIC01, 0, 1, evt.getButton());
    }//GEN-LAST:event_eI01MouseReleased

    private void eI02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI02MouseReleased
        tomarItem(eI02, eIC02, 0, 2, evt.getButton());
    }//GEN-LAST:event_eI02MouseReleased

    private void eI03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI03MouseReleased
        tomarItem(eI03, eIC03, 0, 3, evt.getButton());
    }//GEN-LAST:event_eI03MouseReleased

    private void eI04MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI04MouseReleased
        tomarItem(eI04, eIC04, 0, 4, evt.getButton());
    }//GEN-LAST:event_eI04MouseReleased

    private void eI05MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI05MouseReleased
        tomarItem(eI05, eIC05, 0, 5, evt.getButton());
    }//GEN-LAST:event_eI05MouseReleased

    private void eI06MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI06MouseReleased
        tomarItem(eI06, eIC06, 0, 6, evt.getButton());
    }//GEN-LAST:event_eI06MouseReleased

    private void eI07MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI07MouseReleased
        tomarItem(eI07, eIC07, 0, 7, evt.getButton());
    }//GEN-LAST:event_eI07MouseReleased

    private void eI08MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI08MouseReleased
        tomarItem(eI08, eIC08, 0, 8, evt.getButton());
    }//GEN-LAST:event_eI08MouseReleased

    private void eI10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI10MouseReleased
        tomarItem(eI10, eIC10, 1, 0, evt.getButton());
    }//GEN-LAST:event_eI10MouseReleased

    private void eI11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI11MouseReleased
        tomarItem(eI11, eIC11, 1, 1, evt.getButton());
    }//GEN-LAST:event_eI11MouseReleased

    private void eI12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI12MouseReleased
        tomarItem(eI12, eIC12, 1, 2, evt.getButton());
    }//GEN-LAST:event_eI12MouseReleased

    private void eI13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI13MouseReleased
        tomarItem(eI13, eIC13, 1, 3, evt.getButton());
    }//GEN-LAST:event_eI13MouseReleased

    private void eI14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI14MouseReleased
        tomarItem(eI14, eIC14, 1, 4, evt.getButton());
    }//GEN-LAST:event_eI14MouseReleased

    private void eI15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI15MouseReleased
        tomarItem(eI15, eIC15, 1, 5, evt.getButton());
    }//GEN-LAST:event_eI15MouseReleased

    private void eI16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI16MouseReleased
        tomarItem(eI16, eIC16, 1, 6, evt.getButton());
    }//GEN-LAST:event_eI16MouseReleased

    private void eI17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI17MouseReleased
        tomarItem(eI17, eIC17, 1, 7, evt.getButton());
    }//GEN-LAST:event_eI17MouseReleased

    private void eI18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI18MouseReleased
        tomarItem(eI18, eIC18, 1, 8, evt.getButton());
    }//GEN-LAST:event_eI18MouseReleased

    private void eI20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI20MouseReleased
        tomarItem(eI20, eIC20, 2, 0, evt.getButton());
    }//GEN-LAST:event_eI20MouseReleased

    private void eI21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI21MouseReleased
        tomarItem(eI21, eIC21, 2, 1, evt.getButton());
    }//GEN-LAST:event_eI21MouseReleased

    private void eI22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI22MouseReleased
        tomarItem(eI22, eIC22, 2, 2, evt.getButton());
    }//GEN-LAST:event_eI22MouseReleased

    private void eI23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI23MouseReleased
        tomarItem(eI23, eIC23, 2, 3, evt.getButton());
    }//GEN-LAST:event_eI23MouseReleased

    private void eI24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI24MouseReleased
        tomarItem(eI24, eIC24, 2, 4, evt.getButton());
    }//GEN-LAST:event_eI24MouseReleased

    private void eI25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI25MouseReleased
        tomarItem(eI25, eIC25, 2, 5, evt.getButton());
    }//GEN-LAST:event_eI25MouseReleased

    private void eI26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI26MouseReleased
        tomarItem(eI26, eIC26, 2, 6, evt.getButton());
    }//GEN-LAST:event_eI26MouseReleased

    private void eI27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI27MouseReleased
        tomarItem(eI27, eIC27, 2, 7, evt.getButton());
    }//GEN-LAST:event_eI27MouseReleased

    private void eI28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI28MouseReleased
        tomarItem(eI28, eIC28, 2, 8, evt.getButton());
    }//GEN-LAST:event_eI28MouseReleased

    private void eI30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI30MouseReleased
        tomarItem(eI30, eIC30, 3, 0, evt.getButton());
    }//GEN-LAST:event_eI30MouseReleased

    private void eI31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI31MouseReleased
        tomarItem(eI31, eIC31, 3, 1, evt.getButton());
    }//GEN-LAST:event_eI31MouseReleased

    private void eI32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI32MouseReleased
        tomarItem(eI32, eIC32, 3, 2, evt.getButton());
    }//GEN-LAST:event_eI32MouseReleased

    private void eI33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI33MouseReleased
        tomarItem(eI33, eIC33, 3, 3, evt.getButton());
    }//GEN-LAST:event_eI33MouseReleased

    private void eI34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI34MouseReleased
        tomarItem(eI34, eIC34, 3, 4, evt.getButton());
    }//GEN-LAST:event_eI34MouseReleased

    private void eI35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI35MouseReleased
        tomarItem(eI35, eIC35, 3, 5, evt.getButton());
    }//GEN-LAST:event_eI35MouseReleased

    private void eI36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI36MouseReleased
        tomarItem(eI36, eIC36, 3, 6, evt.getButton());
    }//GEN-LAST:event_eI36MouseReleased

    private void eI37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI37MouseReleased
        tomarItem(eI37, eIC37, 3, 7, evt.getButton());
    }//GEN-LAST:event_eI37MouseReleased

    private void eI38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI38MouseReleased
        tomarItem(eI38, eIC38, 3, 8, evt.getButton());
    }//GEN-LAST:event_eI38MouseReleased

    private void eHIMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eHIMouseReleased
        tomarItemHorno(eHI, eHIC, evt.getButton());
        checkHorno();
    }//GEN-LAST:event_eHIMouseReleased

    private void eHRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eHRMouseReleased
        tomarItemHorneado(eHR, eHRC, evt.getButton());
    }//GEN-LAST:event_eHRMouseReleased

    private void eHCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eHCMouseReleased
        tomarItemHornoCombustible(eHC, eHCC, evt.getButton());
        checkHorno();
    }//GEN-LAST:event_eHCMouseReleased

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        ReturnItem rI = new ReturnItem(item, itemC, 1);

        for(int i = 0; i < rI.getC(); i++)
        {
            rI.giveItem(mItems, mC);
        }

        ReturnItem rIHI = new ReturnItem(itemHornoI, itemHornoIC, 1);

        for(int i = 0; i < rIHI.getC(); i++)
        {
            rIHI.giveItem(mItems, mC);
        }

        ReturnItem rIHC = new ReturnItem(itemHornoC, itemHornoCC, 1);

        for(int i = 0; i < rIHC.getC(); i++)
        {
            rIHC.giveItem(mItems, mC);
        }

        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    public void vaciarHorno()
    {   
        int r = 0;
        
        for(int i = 1; i <= itemHornoCC; i++)
        { 
            r += itemHornoC.getCombustibleLevel();
            
            if(r >= itemHorneadoHL) 
            {
                itemHornoCC -= i;
                if(itemHornoCC == 0)
                {
                    itemHornoC = new Empty();
                }
                
                break;
            }
        }
        
        itemHornoIC--;
        if(itemHornoIC == 0)
        {
            itemHornoI = new Empty();
        }
        
        this.setImagen(eHI, eHIC, itemHornoI, itemHornoIC);
        this.setImagen(eHC, eHCC, itemHornoC, itemHornoCC);
    }
    
    public void checkHorno()
    {
        if(actualizarHorno(itemHornoI, new RawBeef(), itemHornoC.isIsCombustible(), 4))
        {  
            itemHorneado = new CookedBeef();
            itemHorneadoC = 1;
            itemHorneadoHL = 4;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
        else if(actualizarHorno(itemHornoI, new OreHierro(), itemHornoC.isIsCombustible(), 8))
        {  
            itemHorneado = new Items.Hierro();
            itemHorneadoC = 1;
            itemHorneadoHL = 8;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
        else if(actualizarHorno(itemHornoI, new MasaTrigo(), itemHornoC.isIsCombustible(), 3))
        {  
            itemHorneado = new Pan();
            itemHorneadoC = 1;
            itemHorneadoHL = 3;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
        else if(actualizarHorno(itemHornoI, new Madera(), itemHornoC.isIsCombustible(), 2))
        {  
            itemHorneado = new CarbonVegetal();
            itemHorneadoC = 1;
            itemHorneadoHL = 2;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
        else if(actualizarHorno(itemHornoI, new Arcilla(), itemHornoC.isIsCombustible(), 2))
        {  
            itemHorneado = new Ladrillo();
            itemHorneadoC = 1;
            itemHorneadoHL = 2;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
        else
        {
            itemHorneado = new Empty();
            itemHorneadoC = 0;
            this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
        }
    }
    
    public void setImagen(JButton boton, JLabel etiqueta, Item item, int itemC)
    {
        boton.setIcon(new ImageIcon(getClass().getResource(item.getImagen())));
        switch(itemC)
        {
            case 1:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_1Sprite.png")));
                break;

            case 2:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_2Sprite.png")));
                break;    

            case 3:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_3Sprite.png")));
                break;   

            case 4:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_4Sprite.png")));
                break;

            case 5:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_5Sprite.png")));
                break;    

            case 6:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_6Sprite.png")));
                break;   

            case 7:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_7Sprite.png")));
                break;   

            case 8:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_8Sprite.png")));
                break;

            case 9:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_9Sprite.png")));
                break;    

            case 0:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                break;    
        }
    }
    
    public void setImagenM(JButton boton, JLabel etiqueta, Item item[][], int itemC[][], int y, int x)
    {
        boton.setIcon(new ImageIcon(getClass().getResource(item[y][x].getImagen())));
        switch(itemC[y][x])
        {
            case 1:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_1Sprite.png")));
                break;

            case 2:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_2Sprite.png")));
                break;    

            case 3:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_3Sprite.png")));
                break;   

            case 4:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_4Sprite.png")));
                break;

            case 5:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_5Sprite.png")));
                break;    

            case 6:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_6Sprite.png")));
                break;   

            case 7:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_7Sprite.png")));
                break;   

            case 8:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_8Sprite.png")));
                break;

            case 9:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_9Sprite.png")));
                break;    

            case 0:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                break;    
        }
    }
    
    public void setImagenMC(JButton boton, JLabel etiqueta, Item item, int itemC[][], int y, int x)
    {
        boton.setIcon(new ImageIcon(getClass().getResource(item.getImagen())));
        switch(itemC[y][x])
        {
            case 1:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_1Sprite.png")));
                break;

            case 2:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_2Sprite.png")));
                break;

            case 3:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_3Sprite.png")));
                break;

            case 4:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_4Sprite.png")));
                break;

            case 5:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_5Sprite.png")));
                break;

            case 6:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_6Sprite.png")));
                break;

            case 7:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_7Sprite.png")));
                break;

            case 8:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_8Sprite.png")));
                break;

            case 9:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_9Sprite.png")));
                break;

            case 0:
                etiqueta.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                break;
        }
    }
    
    public void tomarItem(JButton boton, JLabel etiqueta, int y, int x, int n)
    {
        if(n == 3)
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();
            
            if(item instanceof Empty)
            {
                try
                {
                    itemC = (int) mC[y][x] - (mC[y][x] / 2);
                    mC[y][x] = (int) mC[y][x] / 2;
                    
                    item = mItems[y][x].clone();
                    
                    if(mC[y][x] == 0)
                    {
                        mItems[y][x] = new Empty();
                        mC[y][x] = 0;
                    }
                    
                    if(item.isIsSelected())
                    {
                        mItems[y][x].setItemSelected(true);
                    }
                    else
                    {
                        mItems[y][x].setItemSelected(false);
                    }
                    
                    this.setImagenM(boton, etiqueta, mItems, mC, y, x);

                    item.setItemSelected(false);

                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                } 
                catch (CloneNotSupportedException ex) 
                { }
            }
            else
            {
                if(mItems[y][x].getClass() == item.getClass() && mItems[y][x].isIsAgrupable() && mC[y][x] < 9 || mItems[y][x] instanceof Empty)
                {   
                    if(!(item instanceof Empty))
                    {
                        try 
                        {
                            if(mItems[y][x].isIsSelected())
                            {
                                item.setItemSelected(true);
                            }
                            else
                            {
                                item.setItemSelected(false);
                            }

                            itemC--;

                            mC[y][x]++;

                            mItems[y][x] = item.clone();

                            if(item.isIsSelected())
                            {
                                mItems[y][x].setItemSelected(true);
                            }
                            else
                            {
                                mItems[y][x].setItemSelected(false);
                            }

                            this.setImagenMC(boton, etiqueta, item, mC, y, x);

                            item.setItemSelected(false);

                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        } 
                        catch (CloneNotSupportedException ex)
                        { }
                    }
                }
            }
            
            if(itemC == 0)
            {
                item = new Empty();
                itemC = 0;
                setCursor(null);
            }
        }
        else
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();

            if(mItems[y][x].isIsSelected())
            {
                item.setItemSelected(true);
            }
            else
            {
                item.setItemSelected(false);
            }

            if(mItems[y][x].getClass() == item.getClass() && mItems[y][x].isIsAgrupable())
            {
                if((itemC + mC[y][x]) <= 9)
                {
                    mC[y][x] += itemC;

                    itemC = mC[y][x];
                    
                    mItems[y][x] = item;
                    
                    if(mItems[y][x].isIsSelected())
                    {
                        item.setItemSelected(true);
                    }
                    else
                    {
                        item.setItemSelected(false);
                    }
                    
                    this.setImagen(boton, etiqueta, item, itemC);
                    
                    item = new Empty();
                    itemC = 0;
                    
                    if(item instanceof Empty)
                    {
                        setCursor(null);
                    }
                    else
                    {
                        ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                        cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                        setCursor(cursor);
                    }
                }
                else if(mC[y][x] < 9 && mItems[y][x].isIsAgrupable())
                {
                    try
                    {
                        int i = 1;
                        
                        while((mC[y][x] + i) < 9)
                        {
                            i++;
                        }
                        
                        mC[y][x] += i; // 9
                        
                        itemC -= i; // 3
                        
                        mItems[y][x] = item.clone(); // Palo
                        
                        this.setImagenMC(boton, etiqueta, item, mC, y, x);
                        
                        item.setItemSelected(false);
                        
                        if(item instanceof Empty)
                        {
                            setCursor(null);
                        }
                        else
                        {
                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        }
                    } 
                    catch (CloneNotSupportedException ex) 
                    { }
                }
            }
            else
            {
                this.setImagen(boton, etiqueta, item, itemC);

                auxItem = item;
                auxItemC = itemC;

                item = mItems[y][x];
                itemC = mC[y][x];

                item.setItemSelected(false);

                mItems[y][x] = auxItem;
                mC[y][x] = auxItemC;

                if(item instanceof Empty)
                {
                    setCursor(null);
                }
                else
                {
                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                }
            }
        }
    }
    
    public void tomarItemHorno(JButton boton, JLabel etiqueta, int n)
    {
        if(n == 3)
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();
            
            if(item instanceof Empty)
            {
                try
                {
                    itemC = (int) itemHornoIC - (itemHornoIC / 2);
                    itemHornoIC = (int) itemHornoIC / 2;
                    
                    item = itemHornoI.clone();
                    
                    if(item.isIsSelected())
                    {
                        itemHornoI.setItemSelected(true);
                    }
                    else
                    {
                        itemHornoI.setItemSelected(false);
                    }
                    
                    if(itemHornoIC == 0)
                    {
                        itemHornoI = new Empty();
                        itemHornoIC = 0;
                    }
                    
                    this.setImagen(boton, etiqueta, itemHornoI, itemHornoIC);

                    item.setItemSelected(false);

                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                } 
                catch (CloneNotSupportedException ex) 
                { }
            }
            else
            {
                if(itemHornoI.getClass() == item.getClass() && itemHornoI.isIsAgrupable() && itemHornoIC < 9 || itemHornoI instanceof Empty)
                {   
                    if(!(item instanceof Empty))
                    {
                        try 
                        {
                            if(itemHornoI.isIsSelected())
                            {
                                item.setItemSelected(true);
                            }
                            else
                            {
                                item.setItemSelected(false);
                            }

                            itemC--;

                            itemHornoIC++;

                            itemHornoI = item.clone();

                            if(item.isIsSelected())
                            {
                                itemHornoI.setItemSelected(true);
                            }
                            else
                            {
                                itemHornoI.setItemSelected(false);
                            }

                            this.setImagen(boton, etiqueta, item, itemHornoIC);

                            item.setItemSelected(false);

                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        } 
                        catch (CloneNotSupportedException ex)
                        { }
                    }
                }
            }
            
            if(itemC == 0)
            {
                item = new Empty();
                itemC = 0;
                setCursor(null);
            }
        }
        else
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();

            if(itemHornoI.isIsSelected())
            {
                item.setItemSelected(true);
            }
            else
            {
                item.setItemSelected(false);
            }

            if(itemHornoI.getClass() == item.getClass() && itemHornoI.isIsAgrupable())
            {
                if((itemC + itemHornoIC) <= 9)
                {
                    itemHornoIC += itemC;

                    itemC = itemHornoIC;
                    
                    itemHornoI = item;
                    
                    if(itemHornoI.isIsSelected())
                    {
                        item.setItemSelected(true);
                    }
                    else
                    {
                        item.setItemSelected(false);
                    }
                    
                    this.setImagen(boton, etiqueta, item, itemC);
                    
                    item = new Empty();
                    itemC = 0;
                    
                    if(item instanceof Empty)
                    {
                        setCursor(null);
                    }
                    else
                    {
                        ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                        cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                        setCursor(cursor);
                    }
                }
                else if(itemHornoIC < 9 && itemHornoI.isIsAgrupable())
                {
                    try
                    {
                        int i = 1;
                        
                        while((itemHornoIC + i) < 9)
                        {
                            i++;
                        }
                        
                        itemHornoIC += i; 
                        
                        itemC -= i; 
                        
                        itemHornoI = item.clone(); 
                        
                        this.setImagen(boton, etiqueta, item, itemHornoIC);
                        
                        item.setItemSelected(false);
                        
                        if(item instanceof Empty)
                        {
                            setCursor(null);
                        }
                        else
                        {
                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        }
                    } 
                    catch (CloneNotSupportedException ex) 
                    { }
                }
            }
            else
            {
                this.setImagen(boton, etiqueta, item, itemC);

                auxItem = item;
                auxItemC = itemC;

                item = itemHornoI;
                itemC = itemHornoIC;

                item.setItemSelected(false);

                itemHornoI = auxItem;
                itemHornoIC = auxItemC;

                if(item instanceof Empty)
                {
                    setCursor(null);
                }
                else
                {
                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                }
            }
        }
    }
    
    public void tomarItemHornoCombustible(JButton boton, JLabel etiqueta, int n)
    {
        if(!item.isIsCombustible()) return;
        
        if(n == 3)
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();
            
            if(item instanceof Empty)
            {
                try
                {
                    itemC = (int) itemHornoCC - (itemHornoCC / 2);
                    itemHornoCC = (int) itemHornoCC / 2;
                    
                    item = itemHornoC.clone();
                    
                    if(item.isIsSelected())
                    {
                        itemHornoC.setItemSelected(true);
                    }
                    else
                    {
                        itemHornoC.setItemSelected(false);
                    }
                    
                    if(itemHornoCC == 0)
                    {
                        itemHornoC = new Empty();
                        itemHornoCC = 0;
                    }
                    
                    this.setImagen(boton, etiqueta, itemHornoC, itemHornoCC);

                    item.setItemSelected(false);

                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                } 
                catch (CloneNotSupportedException ex) 
                { }
            }
            else
            {
                if(itemHornoC.getClass() == item.getClass() && itemHornoC.isIsAgrupable() && itemHornoCC < 9 || itemHornoC instanceof Empty)
                {   
                    if(!(item instanceof Empty))
                    {
                        try 
                        {
                            if(itemHornoC.isIsSelected())
                            {
                                item.setItemSelected(true);
                            }
                            else
                            {
                                item.setItemSelected(false);
                            }

                            itemC--;

                            itemHornoCC++;

                            itemHornoC = item.clone();

                            if(item.isIsSelected())
                            {
                                itemHornoC.setItemSelected(true);
                            }
                            else
                            {
                                itemHornoC.setItemSelected(false);
                            }

                            this.setImagen(boton, etiqueta, item, itemHornoCC);

                            item.setItemSelected(false);

                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        } 
                        catch (CloneNotSupportedException ex)
                        { }
                    }
                }
            }
            
            if(itemC == 0)
            {
                item = new Empty();
                itemC = 0;
                setCursor(null);
            }
        }
        else
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();

            if(itemHornoC.isIsSelected())
            {
                item.setItemSelected(true);
            }
            else
            {
                item.setItemSelected(false);
            }

            if(itemHornoC.getClass() == item.getClass() && itemHornoC.isIsAgrupable())
            {
                if((itemC + itemHornoCC) <= 9)
                {
                    itemHornoCC += itemC;

                    itemC = itemHornoCC;
                    
                    itemHornoC = item;
                    
                    if(itemHornoC.isIsSelected())
                    {
                        item.setItemSelected(true);
                    }
                    else
                    {
                        item.setItemSelected(false);
                    }
                    
                    this.setImagen(boton, etiqueta, item, itemC);
                    
                    item = new Empty();
                    itemC = 0;
                    
                    if(item instanceof Empty)
                    {
                        setCursor(null);
                    }
                    else
                    {
                        ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                        cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                        setCursor(cursor);
                    }
                }
                else if(itemHornoCC < 9 && itemHornoC.isIsAgrupable())
                {
                    try
                    {
                        int i = 1;
                        
                        while((itemHornoCC + i) < 9)
                        {
                            i++;
                        }
                        
                        itemHornoCC += i; // 9
                        
                        itemC -= i; // 3
                        
                        itemHornoC = item.clone(); // Palo
                        
                        this.setImagen(boton, etiqueta, item, itemHornoCC);
                        
                        item.setItemSelected(false);
                        
                        if(item instanceof Empty)
                        {
                            setCursor(null);
                        }
                        else
                        {
                            ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                            cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                            setCursor(cursor);
                        }
                    } 
                    catch (CloneNotSupportedException ex) 
                    { }
                }
            }
            else
            {
                this.setImagen(boton, etiqueta, item, itemC);

                auxItem = item;
                auxItemC = itemC;

                item = itemHornoC;
                itemC = itemHornoCC;

                item.setItemSelected(false);

                itemHornoC = auxItem;
                itemHornoCC = auxItemC;

                if(item instanceof Empty)
                {
                    setCursor(null);
                }
                else
                {
                    ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                    cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                    setCursor(cursor);
                }
            }
        }
    }
    
    public void tomarItemHorneado(JButton boton, JLabel etiqueta, int n)
    {
        Cursor cursor;
        Toolkit t = Toolkit.getDefaultToolkit();

        if(n != 3)
        {
            if(item instanceof Empty)
            {
                if(!(itemHorneado instanceof Empty))
                {
                    this.setImagen(boton, etiqueta, itemHorneado, itemHorneadoC);

                    item = itemHorneado;
                    itemC = itemHorneadoC;

                    item.setItemSelected(false);

                    itemHorneado = new Empty();
                    itemHorneadoC = 0;

                    if(item instanceof Empty)
                    {
                        setCursor(null);
                    }
                    else
                    {
                        ImageIcon imagen = new ImageIcon(getClass().getResource(item.getImagen()));
                        cursor = t.createCustomCursor(imagen.getImage(), new Point(1, 1), "Cursor");
                        setCursor(cursor);
                    }

                    this.setImagen(eHR, eHRC, itemHorneado, itemHorneadoC);
                    this.vaciarHorno();
                    this.setImagen(eHI, eHIC, itemHornoI, itemHornoIC);
                    this.setImagen(eHC, eHCC, itemHornoC, itemHornoCC);
                    checkHorno();
                }
            }
        }
    }
    
    public boolean actualizarHorno(Item itemI, Item itemIE, boolean itemC, int itemCLE)
    {
        int r = 0;
        
        if(itemI.getClass() == itemIE.getClass() && itemC)
        {
            for(int i = 1; i <= itemHornoCC; i++) 
            { 
                r += itemHornoC.getCombustibleLevel();
            }
            
            if(r >= itemCLE)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
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
            java.util.logging.Logger.getLogger(VentanaHorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHorno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                VentanaHorno dialog = new VentanaHorno(new javax.swing.JFrame(), true, null, null);
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel eH1;
    private javax.swing.JLabel eH2;
    private javax.swing.JLabel eH3;
    private javax.swing.JLabel eH4;
    private javax.swing.JLabel eH5;
    private javax.swing.JLabel eH6;
    private javax.swing.JLabel eH7;
    private javax.swing.JLabel eH8;
    private javax.swing.JLabel eH9;
    private javax.swing.JButton eHC;
    private javax.swing.JLabel eHCC;
    private javax.swing.JButton eHI;
    private javax.swing.JLabel eHIC;
    private javax.swing.JButton eHR;
    private javax.swing.JLabel eHRC;
    private javax.swing.JButton eI00;
    private javax.swing.JButton eI01;
    private javax.swing.JButton eI02;
    private javax.swing.JButton eI03;
    private javax.swing.JButton eI04;
    private javax.swing.JButton eI05;
    private javax.swing.JButton eI06;
    private javax.swing.JButton eI07;
    private javax.swing.JButton eI08;
    private javax.swing.JButton eI10;
    private javax.swing.JButton eI11;
    private javax.swing.JButton eI12;
    private javax.swing.JButton eI13;
    private javax.swing.JButton eI14;
    private javax.swing.JButton eI15;
    private javax.swing.JButton eI16;
    private javax.swing.JButton eI17;
    private javax.swing.JButton eI18;
    private javax.swing.JButton eI20;
    private javax.swing.JButton eI21;
    private javax.swing.JButton eI22;
    private javax.swing.JButton eI23;
    private javax.swing.JButton eI24;
    private javax.swing.JButton eI25;
    private javax.swing.JButton eI26;
    private javax.swing.JButton eI27;
    private javax.swing.JButton eI28;
    private javax.swing.JButton eI30;
    private javax.swing.JButton eI31;
    private javax.swing.JButton eI32;
    private javax.swing.JButton eI33;
    private javax.swing.JButton eI34;
    private javax.swing.JButton eI35;
    private javax.swing.JButton eI36;
    private javax.swing.JButton eI37;
    private javax.swing.JButton eI38;
    private javax.swing.JLabel eIC00;
    private javax.swing.JLabel eIC01;
    private javax.swing.JLabel eIC02;
    private javax.swing.JLabel eIC03;
    private javax.swing.JLabel eIC04;
    private javax.swing.JLabel eIC05;
    private javax.swing.JLabel eIC06;
    private javax.swing.JLabel eIC07;
    private javax.swing.JLabel eIC08;
    private javax.swing.JLabel eIC10;
    private javax.swing.JLabel eIC11;
    private javax.swing.JLabel eIC12;
    private javax.swing.JLabel eIC13;
    private javax.swing.JLabel eIC14;
    private javax.swing.JLabel eIC15;
    private javax.swing.JLabel eIC16;
    private javax.swing.JLabel eIC17;
    private javax.swing.JLabel eIC18;
    private javax.swing.JLabel eIC20;
    private javax.swing.JLabel eIC21;
    private javax.swing.JLabel eIC22;
    private javax.swing.JLabel eIC23;
    private javax.swing.JLabel eIC24;
    private javax.swing.JLabel eIC25;
    private javax.swing.JLabel eIC26;
    private javax.swing.JLabel eIC27;
    private javax.swing.JLabel eIC28;
    private javax.swing.JLabel eIC30;
    private javax.swing.JLabel eIC31;
    private javax.swing.JLabel eIC32;
    private javax.swing.JLabel eIC33;
    private javax.swing.JLabel eIC34;
    private javax.swing.JLabel eIC35;
    private javax.swing.JLabel eIC36;
    private javax.swing.JLabel eIC37;
    private javax.swing.JLabel eIC38;
    private javax.swing.JLabel etiquetaH;
    private javax.swing.JPanel panelConfiguracion;
    private javax.swing.JPanel panelHorno;
    private javax.swing.JPanel panelHotBar;
    private javax.swing.JPanel panelInventario;
    // End of variables declaration//GEN-END:variables
}
