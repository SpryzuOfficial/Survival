package Ventanas;

import Comidas.*;
import Herramientas.*;
import Items.*;
import Main.*;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaCraftingTable extends javax.swing.JDialog 
{
    RMundo mundo = new RMundo();
    GItems gItems = new GItems();
    
    Item mItems[][] = new Item[4][9];
    int mC[][] = new int[4][9];
    
    Item mCTItems[][] = {{new Empty(), new Empty(), new Empty()},
                         {new Empty(), new Empty(), new Empty()},
                         {new Empty(), new Empty(), new Empty()}};
    
    int mCTC[][] = {{0, 0, 0},
                    {0, 0, 0}, 
                    {0, 0, 0}};
    
    Item item = new Empty();
    int itemC = 0;
    Item auxItem = new Empty();
    int auxItemC = 0;
    
    Item itemCrafteado = new Empty();
    int itemCrafteadoC = 0;
    
    public VentanaCraftingTable(java.awt.Frame parent, boolean modal, Item mItems[][], int mC[][]) 
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
        
        JLabel mCTCL[][] = {{eCTC00, eCTC01, eCTC02},
                            {eCTC10, eCTC11, eCTC12},
                            {eCTC20, eCTC21, eCTC22}};
        
        JButton mCTL[][] = {{eCT00, eCT01, eCT02},
                            {eCT10, eCT11, eCT12},
                            {eCT20, eCT21, eCT22}};
        
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
        
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                mCTCL[i][j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                mCTL[i][j].setIcon(new ImageIcon(getClass().getResource(new Empty().getImagen())));
            }
        }
        
        eCTCR.setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
        eCTR.setIcon(new ImageIcon(getClass().getResource(new Empty().getImagen())));
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
        panelCraftingTable = new javax.swing.JPanel();
        eCTC00 = new javax.swing.JLabel();
        eCTC01 = new javax.swing.JLabel();
        eCTC02 = new javax.swing.JLabel();
        eECT1 = new javax.swing.JLabel();
        eECT2 = new javax.swing.JLabel();
        eCT00 = new javax.swing.JButton();
        eCT01 = new javax.swing.JButton();
        eCT02 = new javax.swing.JButton();
        eECT3 = new javax.swing.JLabel();
        eECT4 = new javax.swing.JLabel();
        eCTC10 = new javax.swing.JLabel();
        eCTC11 = new javax.swing.JLabel();
        eCTC12 = new javax.swing.JLabel();
        eECT5 = new javax.swing.JLabel();
        eCTCR = new javax.swing.JLabel();
        eCT10 = new javax.swing.JButton();
        eCT11 = new javax.swing.JButton();
        eCT12 = new javax.swing.JButton();
        eECT6 = new javax.swing.JLabel();
        eCTR = new javax.swing.JButton();
        eCTC20 = new javax.swing.JLabel();
        eCTC21 = new javax.swing.JLabel();
        eCTC22 = new javax.swing.JLabel();
        eECT7 = new javax.swing.JLabel();
        eECT8 = new javax.swing.JLabel();
        eCT20 = new javax.swing.JButton();
        eCT21 = new javax.swing.JButton();
        eCT22 = new javax.swing.JButton();
        eECT9 = new javax.swing.JLabel();
        eECT10 = new javax.swing.JLabel();
        panelConfiguracion = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
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

        panelCraftingTable.setBackground(new java.awt.Color(51, 51, 51));
        panelCraftingTable.setLayout(new java.awt.GridLayout(6, 4));
        panelCraftingTable.add(eCTC00);
        panelCraftingTable.add(eCTC01);
        panelCraftingTable.add(eCTC02);
        panelCraftingTable.add(eECT1);
        panelCraftingTable.add(eECT2);

        eCT00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT00MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT00);

        eCT01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT01MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT01);

        eCT02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT02MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT02);
        panelCraftingTable.add(eECT3);
        panelCraftingTable.add(eECT4);
        panelCraftingTable.add(eCTC10);
        panelCraftingTable.add(eCTC11);
        panelCraftingTable.add(eCTC12);
        panelCraftingTable.add(eECT5);
        panelCraftingTable.add(eCTCR);

        eCT10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT10MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT10);

        eCT11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT11MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT11);

        eCT12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT12MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT12);
        panelCraftingTable.add(eECT6);

        eCTR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCTRMouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCTR);
        panelCraftingTable.add(eCTC20);
        panelCraftingTable.add(eCTC21);
        panelCraftingTable.add(eCTC22);
        panelCraftingTable.add(eECT7);
        panelCraftingTable.add(eECT8);

        eCT20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT20MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT20);

        eCT21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT21MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT21);

        eCT22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eCT22MouseReleased(evt);
            }
        });
        panelCraftingTable.add(eCT22);
        panelCraftingTable.add(eECT9);
        panelCraftingTable.add(eECT10);

        panelConfiguracion.setBackground(new java.awt.Color(102, 102, 102));
        panelConfiguracion.setLayout(new java.awt.GridLayout(1, 1));

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SurvivalSalirSprite.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelConfiguracion.add(botonSalir);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Crafting Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 350, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelHotBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(panelCraftingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(456, Short.MAX_VALUE)
                    .addComponent(panelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(748, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panelHotBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCraftingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(panelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(720, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eCT00MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT00MouseReleased
        tomarItemCraftingTable(eCT00, eCTC00, 0, 0, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT00MouseReleased

    private void eCT01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT01MouseReleased
        tomarItemCraftingTable(eCT01, eCTC01, 0, 1, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT01MouseReleased

    private void eCT02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT02MouseReleased
        tomarItemCraftingTable(eCT02, eCTC02, 0, 2, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT02MouseReleased

    private void eCT10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT10MouseReleased
        tomarItemCraftingTable(eCT10, eCTC10, 1, 0, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT10MouseReleased

    private void eCT11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT11MouseReleased
        tomarItemCraftingTable(eCT11, eCTC11, 1, 1, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT11MouseReleased

    private void eCT12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT12MouseReleased
        tomarItemCraftingTable(eCT12, eCTC12, 1, 2, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT12MouseReleased

    private void eCTRMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCTRMouseReleased
        tomarItemCrafteadoTable(eCTR, eCTCR, evt.getButton());
    }//GEN-LAST:event_eCTRMouseReleased

    private void eCT20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT20MouseReleased
        tomarItemCraftingTable(eCT20, eCTC20, 2, 0, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT20MouseReleased

    private void eCT21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT21MouseReleased
        tomarItemCraftingTable(eCT21, eCTC21, 2, 1, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT21MouseReleased

    private void eCT22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eCT22MouseReleased
        tomarItemCraftingTable(eCT22, eCTC22, 2, 2, evt.getButton());
        checkCraftingTable();
    }//GEN-LAST:event_eCT22MouseReleased

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        ReturnItem rI = new ReturnItem(item, itemC, 1);

        for(int i = 0; i < rI.getC(); i++)
        {
            rI.giveItem(mItems, mC);
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                ReturnItem rICT = new ReturnItem(mCTItems[i][j], mCTC[i][j], 1);

                for(int x = 0; x < rICT.getC(); x++)
                {
                    rICT.giveItem(mItems, mC);
                }
            }
        }

        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void eI38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI38MouseReleased
        tomarItem(eI38, eIC38, 3, 8, evt.getButton());
    }//GEN-LAST:event_eI38MouseReleased

    private void eI37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI37MouseReleased
        tomarItem(eI37, eIC37, 3, 7, evt.getButton());
    }//GEN-LAST:event_eI37MouseReleased

    private void eI36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI36MouseReleased
        tomarItem(eI36, eIC36, 3, 6, evt.getButton());
    }//GEN-LAST:event_eI36MouseReleased

    private void eI35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI35MouseReleased
        tomarItem(eI35, eIC35, 3, 5, evt.getButton());
    }//GEN-LAST:event_eI35MouseReleased

    private void eI34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI34MouseReleased
        tomarItem(eI34, eIC34, 3, 4, evt.getButton());
    }//GEN-LAST:event_eI34MouseReleased

    private void eI33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI33MouseReleased
        tomarItem(eI33, eIC33, 3, 3, evt.getButton());
    }//GEN-LAST:event_eI33MouseReleased

    private void eI32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI32MouseReleased
        tomarItem(eI32, eIC32, 3, 2, evt.getButton());
    }//GEN-LAST:event_eI32MouseReleased

    private void eI31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI31MouseReleased
        tomarItem(eI31, eIC31, 3, 1, evt.getButton());
    }//GEN-LAST:event_eI31MouseReleased

    private void eI30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI30MouseReleased
        tomarItem(eI30, eIC30, 3, 0, evt.getButton());
    }//GEN-LAST:event_eI30MouseReleased

    private void eI28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI28MouseReleased
        tomarItem(eI28, eIC28, 2, 8, evt.getButton());
    }//GEN-LAST:event_eI28MouseReleased

    private void eI27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI27MouseReleased
        tomarItem(eI27, eIC27, 2, 7, evt.getButton());
    }//GEN-LAST:event_eI27MouseReleased

    private void eI26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI26MouseReleased
        tomarItem(eI26, eIC26, 2, 6, evt.getButton());
    }//GEN-LAST:event_eI26MouseReleased

    private void eI25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI25MouseReleased
        tomarItem(eI25, eIC25, 2, 5, evt.getButton());
    }//GEN-LAST:event_eI25MouseReleased

    private void eI24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI24MouseReleased
        tomarItem(eI24, eIC24, 2, 4, evt.getButton());
    }//GEN-LAST:event_eI24MouseReleased

    private void eI23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI23MouseReleased
        tomarItem(eI23, eIC23, 2, 3, evt.getButton());
    }//GEN-LAST:event_eI23MouseReleased

    private void eI22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI22MouseReleased
        tomarItem(eI22, eIC22, 2, 2, evt.getButton());
    }//GEN-LAST:event_eI22MouseReleased

    private void eI21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI21MouseReleased
        tomarItem(eI21, eIC21, 2, 1, evt.getButton());
    }//GEN-LAST:event_eI21MouseReleased

    private void eI20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI20MouseReleased
        tomarItem(eI20, eIC20, 2, 0, evt.getButton());
    }//GEN-LAST:event_eI20MouseReleased

    private void eI18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI18MouseReleased
        tomarItem(eI18, eIC18, 1, 8, evt.getButton());
    }//GEN-LAST:event_eI18MouseReleased

    private void eI17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI17MouseReleased
        tomarItem(eI17, eIC17, 1, 7, evt.getButton());
    }//GEN-LAST:event_eI17MouseReleased

    private void eI16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI16MouseReleased
        tomarItem(eI16, eIC16, 1, 6, evt.getButton());
    }//GEN-LAST:event_eI16MouseReleased

    private void eI15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI15MouseReleased
        tomarItem(eI15, eIC15, 1, 5, evt.getButton());
    }//GEN-LAST:event_eI15MouseReleased

    private void eI14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI14MouseReleased
        tomarItem(eI14, eIC14, 1, 4, evt.getButton());
    }//GEN-LAST:event_eI14MouseReleased

    private void eI13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI13MouseReleased
        tomarItem(eI13, eIC13, 1, 3, evt.getButton());
    }//GEN-LAST:event_eI13MouseReleased

    private void eI12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI12MouseReleased
        tomarItem(eI12, eIC12, 1, 2, evt.getButton());
    }//GEN-LAST:event_eI12MouseReleased

    private void eI11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI11MouseReleased
        tomarItem(eI11, eIC11, 1, 1, evt.getButton());
    }//GEN-LAST:event_eI11MouseReleased

    private void eI10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI10MouseReleased
        tomarItem(eI10, eIC10, 1, 0, evt.getButton());
    }//GEN-LAST:event_eI10MouseReleased

    private void eI08MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI08MouseReleased
        tomarItem(eI08, eIC08, 0, 8, evt.getButton());
    }//GEN-LAST:event_eI08MouseReleased

    private void eI07MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI07MouseReleased
        tomarItem(eI07, eIC07, 0, 7, evt.getButton());
    }//GEN-LAST:event_eI07MouseReleased

    private void eI06MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI06MouseReleased
        tomarItem(eI06, eIC06, 0, 6, evt.getButton());
    }//GEN-LAST:event_eI06MouseReleased

    private void eI05MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI05MouseReleased
        tomarItem(eI05, eIC05, 0, 5, evt.getButton());
    }//GEN-LAST:event_eI05MouseReleased

    private void eI04MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI04MouseReleased
        tomarItem(eI04, eIC04, 0, 4, evt.getButton());
    }//GEN-LAST:event_eI04MouseReleased

    private void eI03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI03MouseReleased
        tomarItem(eI03, eIC03, 0, 3, evt.getButton());
    }//GEN-LAST:event_eI03MouseReleased

    private void eI02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI02MouseReleased
        tomarItem(eI02, eIC02, 0, 2, evt.getButton());
    }//GEN-LAST:event_eI02MouseReleased

    private void eI01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI01MouseReleased
        tomarItem(eI01, eIC01, 0, 1, evt.getButton());
    }//GEN-LAST:event_eI01MouseReleased

    private void eI00MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eI00MouseReleased
        tomarItem(eI00, eIC00, 0, 0, evt.getButton());
    }//GEN-LAST:event_eI00MouseReleased

    public void vaciarMatrizItem(Item m1[][], int m2[][], int y, int x)
    {
        for(int i = 0; i < y; i++)
        {
            for(int j = 0; j < x; j++)
            {
                if(m2[i][j] != 0)
                {
                    m2[i][j]--;
                    if(m2[i][j] == 0)
                    {
                        m1[i][j] = new Empty();
                    }
                }
            }
        }
    }
    
    public void checkCraftingTable()
    {
        Item palos1[][] = {{new Empty(), new Empty(), new Empty()}, 
                           {new Empty(), new Empty(), new Madera()},
                           {new Empty(), new Empty(), new Madera()}};
        
        Item palos2[][] = {{new Empty(), new Empty(), new Madera()}, 
                           {new Empty(), new Empty(), new Madera()},
                           {new Empty(), new Empty(), new Empty()}};
        
        Item palos3[][] = {{new Empty(), new Empty(), new Empty()}, 
                           {new Empty(), new Madera(), new Empty()},
                           {new Empty(), new Madera(), new Empty()}};
        
        Item palos4[][] = {{new Empty(), new Madera(), new Empty()}, 
                           {new Empty(), new Madera(), new Empty()},
                           {new Empty(), new Empty(), new Empty()}};
        
        Item palos5[][] = {{new Empty(), new Empty(), new Empty()}, 
                           {new Madera(), new Empty(), new Empty()},
                           {new Madera(), new Empty(), new Empty()}};
        
        Item palos6[][] = {{new Madera(), new Empty(), new Empty()}, 
                           {new Madera(), new Empty(), new Empty()},
                           {new Empty(), new Empty(), new Empty()}};
        
        Item craftingfTable1[][] = {{new Empty(), new Empty(), new Empty()}, 
                                   {new Empty(), new Madera(), new Madera()},
                                   {new Empty(), new Madera(), new Madera()}};
        
        Item craftingfTable2[][] = {{new Empty(), new Madera(), new Madera()}, 
                                   {new Empty(), new Madera(), new Madera()},
                                   {new Empty(), new Empty(), new Empty()}};
        
        Item craftingfTable3[][] = {{new Madera(), new Madera(), new Empty()}, 
                                   {new Madera(), new Madera(), new Empty()},
                                   {new Empty(), new Empty(), new Empty()}};
        
        Item craftingfTable4[][] = {{new Empty(), new Empty(), new Empty()}, 
                                   {new Madera(), new Madera(), new Empty()},
                                   {new Madera(), new Madera(), new Empty()}};
        
        Item espadaMadera1[][] = {{new Empty(), new Madera(), new Empty()}, 
                                  {new Empty(), new Madera(), new Empty()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item espadaMadera2[][] = {{new Empty(), new Empty(), new Madera()}, 
                                  {new Empty(), new Empty(), new Madera()},
                                  {new Empty(), new Empty(), new Palo()}};
        
        Item espadaMadera3[][] = {{new Madera(), new Empty(), new Empty()}, 
                                  {new Madera(), new Empty(), new Empty()},
                                  {new Palo(), new Empty(), new Empty()}};
        
        Item hachaMadera1[][] = {{new Madera(), new Madera(), new Empty()}, 
                                  {new Madera(), new Palo(), new Empty()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item hachaMadera2[][] = {{new Empty(), new Madera(), new Madera()}, 
                                  {new Empty(), new Palo(), new Madera()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item hachaMadera3[][] = {{new Madera(), new Madera(), new Empty()}, 
                                  {new Palo(), new Madera(), new Empty()},
                                  {new Palo(), new Empty(), new Empty()}};
        
        Item hachaMadera4[][] = {{new Empty(), new Madera(), new Madera()}, 
                                  {new Empty(), new Madera(), new Palo()},
                                  {new Empty(), new Empty(), new Palo()}};
        
        Item picoMadera[][] = {{new Madera(), new Madera(), new Madera()}, 
                                  {new Empty(), new Palo(), new Empty()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item espadaPiedra1[][] = {{new Empty(), new Roca(), new Empty()}, 
                                  {new Empty(), new Roca(), new Empty()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item espadaPiedra2[][] = {{new Roca(), new Empty(), new Empty()}, 
                                  {new Roca(), new Empty(), new Empty()},
                                  {new Palo(), new Empty(), new Empty()}};
        
        Item espadaPiedra3[][] = {{new Empty(), new Empty(), new Roca()}, 
                                  {new Empty(), new Empty(), new Roca()},
                                  {new Empty(), new Empty(), new Palo()}};
        
        Item hachaPiedra1[][] = {{new Roca(), new Roca(), new Empty()}, 
                                 {new Roca(), new Palo(), new Empty()},
                                 {new Empty(), new Palo(), new Empty()}};
        
        Item hachaPiedra2[][] = {{new Empty(), new Roca(), new Roca()}, 
                                 {new Empty(), new Palo(), new Roca()},
                                 {new Empty(), new Palo(), new Empty()}};
        
        Item hachaPiedra3[][] = {{new Roca(), new Roca(), new Empty()}, 
                                 {new Palo(), new Roca(), new Empty()},
                                 {new Palo(), new Empty(), new Empty()}};
        
        Item hachaPiedra4[][] = {{new Empty(), new Roca(), new Roca()}, 
                                 {new Empty(), new Roca(), new Palo()},
                                 {new Empty(), new Empty(), new Palo()}};
        
        Item picoPiedra[][] = {{new Roca(), new Roca(), new Roca()}, 
                               {new Empty(), new Palo(), new Empty()},
                               {new Empty(), new Palo(), new Empty()}};
        
        Item horno[][] = {{new Empty(), new Roca(), new Empty()}, 
                          {new Empty(), new Palo(), new Empty()},
                          {new Madera(), new Madera(), new Madera()}};
        
        Item espadaHierro1[][] = {{new Empty(), new Hierro(), new Empty()}, 
                                  {new Empty(), new Hierro(), new Empty()},
                                  {new Empty(), new Palo(), new Empty()}};
        
        Item espadaHierro2[][] = {{new Empty(), new Empty(), new Hierro()}, 
                                  {new Empty(), new Empty(), new Hierro()},
                                  {new Empty(), new Empty(), new Palo()}};
        
        Item espadaHierro3[][] = {{new Hierro(), new Empty(), new Empty()}, 
                                  {new Hierro(), new Empty(), new Empty()},
                                  {new Palo(), new Empty(), new Empty()}};
        
        Item hachaHierro1[][] = {{new Hierro(), new Hierro(), new Empty()}, 
                                 {new Hierro(), new Palo(), new Empty()},
                                 {new Empty(), new Palo(), new Empty()}};
        
        Item hachaHierro2[][] = {{new Empty(), new Hierro(), new Hierro()}, 
                                 {new Empty(), new Palo(), new Hierro()},
                                 {new Empty(), new Palo(), new Empty()}};
        
        Item hachaHierro3[][] = {{new Hierro(), new Hierro(), new Empty()}, 
                                 {new Palo(), new Hierro(), new Empty()},
                                 {new Palo(), new Palo(), new Empty()}};
        
        Item hachaHierro4[][] = {{new Empty(), new Hierro(), new Hierro()}, 
                                 {new Empty(), new Hierro(), new Palo()},
                                 {new Empty(), new Empty(), new Palo()}};
        
        Item picoHierro[][] = {{new Hierro(), new Hierro(), new Hierro()}, 
                               {new Empty(), new Palo(), new Empty()},
                               {new Empty(), new Palo(), new Empty()}};
        
        Item cubeta1[][] = {{new Empty(), new Empty(), new Empty()}, 
                            {new Hierro(), new Empty(), new Hierro()},
                            {new Empty(), new Hierro(), new Empty()}};
        
        Item cubeta2[][] = {{new Hierro(), new Empty(), new Hierro()}, 
                            {new Empty(), new Hierro(), new Empty()},
                            {new Empty(), new Empty(), new Empty()}};
        
        Item masaTrigo1[][] = {{new Empty(), new Empty(), new Empty()}, 
                               {new Trigo(), new Trigo(), new Trigo()},
                               {new Empty(), new Empty(), new Empty()}};
        
        Item masaTrigo2[][] = {{new Trigo(), new Trigo(), new Trigo()}, 
                               {new Empty(), new Empty(), new Empty()},
                               {new Empty(), new Empty(), new Empty()}};
        
        Item masaTrigo3[][] = {{new Empty(), new Empty(), new Empty()}, 
                               {new Empty(), new Empty(), new Empty()},
                               {new Trigo(), new Trigo(), new Trigo()}};
        
        Item floresPalos1[][] = {{new Empty(), new Empty(), new Empty()}, 
                                 {new Empty(), new Flor(), new Flor()},
                                 {new Empty(), new Palo(), new Palo()}};
        
        Item floresPalos2[][] = {{new Empty(), new Flor(), new Flor()}, 
                                 {new Empty(), new Palo(), new Palo()},
                                 {new Empty(), new Empty(), new Empty()}};
        
        Item floresPalos3[][] = {{new Flor(), new Flor(), new Empty()}, 
                                 {new Palo(), new Palo(), new Empty()},
                                 {new Empty(), new Empty(), new Empty()}};
        
        Item floresPalos4[][] = {{new Empty(), new Empty(), new Empty()}, 
                                 {new Flor(), new Flor(), new Empty()},
                                 {new Palo(), new Palo(), new Empty()}};
        
        Item pieFruta1[][] = {{new Empty(), new Empty(), new Empty()}, 
                              {new Fruta(), new Fruta(), new Fruta()},
                              {new Trigo(), new Trigo(), new Trigo()}};
        
        Item pieFruta2[][] = {{new Fruta(), new Fruta(), new Fruta()}, 
                              {new Trigo(), new Trigo(), new Trigo()},
                              {new Empty(), new Empty(), new Empty()}};
        
        Item cofre[][] = {{new Madera(), new Madera(), new Madera()}, 
                          {new Madera(), new Empty(), new Madera()},
                          {new Madera(), new Madera(), new Madera()}};
        
        Item bowl1[][] = {{new Empty(), new Empty(), new Empty()}, 
                            {new Madera(), new Empty(), new Madera()},
                            {new Empty(), new Madera(), new Empty()}};
        
        Item bowl2[][] = {{new Madera(), new Empty(), new Madera()}, 
                            {new Empty(), new Madera(), new Empty()},
                            {new Empty(), new Empty(), new Empty()}};
        
        Item sopaHongo1[][] = {{new Empty(), new Empty(), new Empty()}, 
                               {new Empty(), new Empty(), new Hongo()},
                               {new Empty(), new Empty(), new Bowl()}};
        
        Item sopaHongo2[][] = {{new Empty(), new Empty(), new Hongo()}, 
                               {new Empty(), new Empty(), new Bowl()},
                               {new Empty(), new Empty(), new Empty()}};
        
        Item sopaHongo3[][] = {{new Empty(), new Hongo(), new Empty()}, 
                               {new Empty(), new Bowl(), new Empty()},
                               {new Empty(), new Empty(), new Empty()}};
        
        Item sopaHongo4[][] = {{new Empty(), new Empty(), new Empty()}, 
                               {new Empty(), new Hongo(), new Empty()},
                               {new Empty(), new Bowl(), new Empty()}};
        
        Item sopaHongo5[][] = {{new Hongo(), new Empty(), new Empty()}, 
                               {new Bowl(), new Empty(), new Empty()},
                               {new Empty(), new Empty(), new Empty()}};
        
        Item sopaHongo6[][] = {{new Empty(), new Empty(), new Empty()}, 
                               {new Hongo(), new Empty(), new Empty()},
                               {new Bowl(), new Empty(), new Empty()}};
        
        Item frutaHierro[][] = {{new Hierro(), new Hierro(), new Hierro()}, 
                                {new Hierro(), new Fruta(), new Hierro()},
                                {new Hierro(), new Hierro(), new Hierro()}};
        
        Item bloqueLadrillo1[][] = {{new Empty(), new Empty(), new Empty()}, 
                                    {new Empty(), new Ladrillo(), new Ladrillo()},
                                    {new Empty(), new Ladrillo(), new Ladrillo()}};
        
        Item bloqueLadrillo2[][] = {{new Empty(), new Ladrillo(), new Ladrillo()}, 
                                    {new Empty(), new Ladrillo(), new Ladrillo()},
                                    {new Empty(), new Empty(), new Empty()}};
        
        Item bloqueLadrillo3[][] = {{new Ladrillo(), new Ladrillo(), new Empty()}, 
                                    {new Ladrillo(), new Ladrillo(), new Empty()},
                                    {new Empty(), new Empty(), new Empty()}};
        
        Item bloqueLadrillo4[][] = {{new Empty(), new Empty(), new Empty()}, 
                                    {new Ladrillo(), new Ladrillo(), new Empty()},
                                    {new Ladrillo(), new Ladrillo(), new Empty()}};
        
        if(actualizarCraftingTable(mCTItems, palos1))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, palos2))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, palos3))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, palos4))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, palos5))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, palos6))
        {
            itemCrafteado = new Palo();
            itemCrafteadoC = 4;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, craftingfTable1))
        {
            itemCrafteado = new CraftingTable();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, craftingfTable2))
        {
            itemCrafteado = new CraftingTable();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, craftingfTable3))
        {
            itemCrafteado = new CraftingTable();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, craftingfTable4))
        {
            itemCrafteado = new CraftingTable();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaMadera1))
        {
            itemCrafteado = new EspadaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaMadera2))
        {
            itemCrafteado = new EspadaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaMadera3))
        {
            itemCrafteado = new EspadaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaMadera1))
        {
            itemCrafteado = new HachaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaMadera2))
        {
            itemCrafteado = new HachaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaMadera3))
        {
            itemCrafteado = new HachaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaMadera4))
        {
            itemCrafteado = new HachaMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, picoMadera))
        {
            itemCrafteado = new PicoMadera();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaPiedra1))
        {
            itemCrafteado = new EspadaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaPiedra2))
        {
            itemCrafteado = new EspadaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaPiedra3))
        {
            itemCrafteado = new EspadaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaPiedra1))
        {
            itemCrafteado = new HachaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaPiedra2))
        {
            itemCrafteado = new HachaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaPiedra3))
        {
            itemCrafteado = new HachaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaPiedra4))
        {
            itemCrafteado = new HachaPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, picoPiedra))
        {
            itemCrafteado = new PicoPiedra();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, horno))
        {
            itemCrafteado = new Horno();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaHierro1))
        {
            itemCrafteado = new EspadaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaHierro2))
        {
            itemCrafteado = new EspadaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, espadaHierro3))
        {
            itemCrafteado = new EspadaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaHierro1))
        {
            itemCrafteado = new HachaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaHierro2))
        {
            itemCrafteado = new HachaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaHierro3))
        {
            itemCrafteado = new HachaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, hachaHierro4))
        {
            itemCrafteado = new HachaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, picoHierro))
        {
            itemCrafteado = new PicoHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, cubeta1))
        {
            itemCrafteado = new Cubeta();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, cubeta2))
        {
            itemCrafteado = new Cubeta();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, masaTrigo1))
        {
            itemCrafteado = new MasaTrigo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, masaTrigo2))
        {
            itemCrafteado = new MasaTrigo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, masaTrigo3))
        {
            itemCrafteado = new MasaTrigo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, floresPalos1))
        {
            itemCrafteado = new FloresPalos();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, floresPalos2))
        {
            itemCrafteado = new FloresPalos();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, floresPalos3))
        {
            itemCrafteado = new FloresPalos();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, floresPalos4))
        {
            itemCrafteado = new FloresPalos();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, pieFruta1))
        {
            itemCrafteado = new PieFruta();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, pieFruta2))
        {
            itemCrafteado = new PieFruta();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, cofre))
        {
            itemCrafteado = new Cofre();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bowl1))
        {
            itemCrafteado = new Bowl();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bowl2))
        {
            itemCrafteado = new Bowl();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo1))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo2))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo3))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo4))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo5))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, sopaHongo6))
        {
            itemCrafteado = new SopaHongo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, frutaHierro))
        {
            itemCrafteado = new FrutaHierro();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bloqueLadrillo1))
        {
            itemCrafteado = new BloqueLadrillo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bloqueLadrillo2))
        {
            itemCrafteado = new BloqueLadrillo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bloqueLadrillo3))
        {
            itemCrafteado = new BloqueLadrillo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else if(actualizarCraftingTable(mCTItems, bloqueLadrillo4))
        {
            itemCrafteado = new BloqueLadrillo();
            itemCrafteadoC = 1;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
        }
        else
        {
            itemCrafteado = new Empty();
            itemCrafteadoC = 0;
            this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
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
    
    public void tomarItemCraftingTable(JButton boton, JLabel etiqueta, int y, int x, int n)
    {
        if(n == 3)
        {
            Cursor cursor;
            Toolkit t = Toolkit.getDefaultToolkit();
            
            if(item instanceof Empty)
            {
                try
                {
                    itemC = (int) mCTC[y][x] - (mCTC[y][x] / 2);
                    mCTC[y][x] = (int) mCTC[y][x] / 2;
                    
                    item = mCTItems[y][x].clone();
                    
                    if(item.isIsSelected())
                    {
                        mCTItems[y][x].setItemSelected(true);
                    }
                    else
                    {
                        mCTItems[y][x].setItemSelected(false);
                    }

                    if(mCTC[y][x] == 0)
                    {
                        mCTItems[y][x] = new Empty();
                        mCTC[y][x] = 0;
                    }
                    
                    this.setImagenM(boton, etiqueta, mCTItems, mCTC, y, x);

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
                if(mCTItems[y][x].getClass() == item.getClass() && mCTItems[y][x].isIsAgrupable() && mCTC[y][x] < 9 || mCTItems[y][x] instanceof Empty)
                {   
                    if(!(item instanceof Empty))
                    {
                        try 
                        {
                            if(mCTItems[y][x].isIsSelected())
                            {
                                item.setItemSelected(true);
                            }
                            else
                            {
                                item.setItemSelected(false);
                            }

                            itemC--;

                            mCTC[y][x]++;

                            mCTItems[y][x] = item.clone();

                            if(item.isIsSelected())
                            {
                                mCTItems[y][x].setItemSelected(true);
                            }
                            else
                            {
                                mCTItems[y][x].setItemSelected(false);
                            }

                            this.setImagenMC(boton, etiqueta, item, mCTC, y, x);

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

            if(mCTItems[y][x].isIsSelected())
            {
                item.setItemSelected(true);
            }
            else
            {
                item.setItemSelected(false);
            }

            if(mCTItems[y][x].getClass() == item.getClass() && mCTItems[y][x].isIsAgrupable())
            {
                if((itemC + mCTC[y][x]) <= 9)
                {
                    mCTC[y][x] += itemC;

                    itemC = mCTC[y][x];
                    
                    mCTItems[y][x] = item;
                    
                    item.setItemSelected(false);
                    
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
                else if(mCTC[y][x] < 9 && mCTItems[y][x].isIsAgrupable())
                {
                    try
                    {
                        int i = 1;
                        
                        while((mCTC[y][x] + i) < 9)
                        {
                            i++;
                        }
                        
                        mCTC[y][x] += i; // 9
                        
                        itemC -= i; // 3
                        
                        mCTItems[y][x] = item.clone(); // Palo
                        
                        this.setImagenMC(boton, etiqueta, item, mCTC, y, x);
                        
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

                item = mCTItems[y][x];
                itemC = mCTC[y][x];

                item.setItemSelected(false);

                mCTItems[y][x] = auxItem;
                mCTC[y][x] = auxItemC;

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
    
    public void tomarItemCrafteadoTable(JButton boton, JLabel etiqueta, int n)
    {
        Cursor cursor;
        Toolkit t = Toolkit.getDefaultToolkit();

        if(n != 3)
        {
            if(item instanceof Empty)
            {
                if(!(itemCrafteado instanceof Empty))
                {
                    this.setImagen(boton, etiqueta, itemCrafteado, itemCrafteadoC);

                    item = itemCrafteado;
                    itemC = itemCrafteadoC;

                    item.setItemSelected(false);

                    itemCrafteado = new Empty();
                    itemCrafteadoC = 0;

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

                    this.setImagen(eCTR, eCTCR, itemCrafteado, itemCrafteadoC);
                    this.vaciarMatrizItem(mCTItems, mCTC, 3, 3);
                    this.setImagenM(eCT00, eCTC00, mCTItems, mCTC, 0, 0);
                    this.setImagenM(eCT01, eCTC01, mCTItems, mCTC, 0, 1);
                    this.setImagenM(eCT02, eCTC02, mCTItems, mCTC, 0, 2);
                    this.setImagenM(eCT10, eCTC10, mCTItems, mCTC, 1, 0);
                    this.setImagenM(eCT11, eCTC11, mCTItems, mCTC, 1, 1);
                    this.setImagenM(eCT12, eCTC12, mCTItems, mCTC, 1, 2);
                    this.setImagenM(eCT20, eCTC20, mCTItems, mCTC, 2, 0);
                    this.setImagenM(eCT21, eCTC21, mCTItems, mCTC, 2, 1);
                    this.setImagenM(eCT22, eCTC22, mCTItems, mCTC, 2, 2);
                    checkCraftingTable();
                }
            }
        }
    }
    
    public boolean actualizarCraftingTable(Item m1[][], Item m2[][])
    {
        boolean band = true;
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(m1[i][j].getClass() == m2[i][j].getClass())
                {
                    band = true;
                }
                else
                {
                    band = false;   
                    break;
                }
            }
            
            if(!band)
            {
                break;
            }
        }
        
        return band;
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
            java.util.logging.Logger.getLogger(VentanaCraftingTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCraftingTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCraftingTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCraftingTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                VentanaCraftingTable dialog = new VentanaCraftingTable(new javax.swing.JFrame(), true, null, null);
                
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
    private javax.swing.JButton eCT00;
    private javax.swing.JButton eCT01;
    private javax.swing.JButton eCT02;
    private javax.swing.JButton eCT10;
    private javax.swing.JButton eCT11;
    private javax.swing.JButton eCT12;
    private javax.swing.JButton eCT20;
    private javax.swing.JButton eCT21;
    private javax.swing.JButton eCT22;
    private javax.swing.JLabel eCTC00;
    private javax.swing.JLabel eCTC01;
    private javax.swing.JLabel eCTC02;
    private javax.swing.JLabel eCTC10;
    private javax.swing.JLabel eCTC11;
    private javax.swing.JLabel eCTC12;
    private javax.swing.JLabel eCTC20;
    private javax.swing.JLabel eCTC21;
    private javax.swing.JLabel eCTC22;
    private javax.swing.JLabel eCTCR;
    private javax.swing.JButton eCTR;
    private javax.swing.JLabel eECT1;
    private javax.swing.JLabel eECT10;
    private javax.swing.JLabel eECT2;
    private javax.swing.JLabel eECT3;
    private javax.swing.JLabel eECT4;
    private javax.swing.JLabel eECT5;
    private javax.swing.JLabel eECT6;
    private javax.swing.JLabel eECT7;
    private javax.swing.JLabel eECT8;
    private javax.swing.JLabel eECT9;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelConfiguracion;
    private javax.swing.JPanel panelCraftingTable;
    private javax.swing.JPanel panelHotBar;
    private javax.swing.JPanel panelInventario;
    // End of variables declaration//GEN-END:variables
}
