package Ventanas;

import Barras.*;
import Comidas.*;
import Herramientas.*;
import Main.*;
import Items.*;
import Tiles.*;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame
{
    //Variables enteras
    public static int ce1 = 52, ce2 = 52, xMJ = 54, yMJ = 54;
    public static int mMSX = 111, mMSY = 111, mCSX = 5, mCSY = 5;
    public static int sI = 0, steps = 30;
    
    //Variables de tipo char
    public static char dir = 'u';
    
    //Matrices de objetos de tipo Tile
    public static Tile matrizM[][] = new Tile[mMSY][mMSX], matrizOTM[][] = new Tile[mMSY][mMSX], matrizC[][] = new Tile[mCSY][mCSX];
    
    //Matrices de items
    public static int matrizIC[][] = new int[4][9]; 
    public static Item matrizI[][] = new Item[4][9];
    
    //Arrays de las barras
    public static BarraVida arrayBV[] = new BarraVida[9];
    public static BarraComida arrayBC[] = new BarraComida[9];
    
    //Objeto de tipo Ventana
    public static Ventana v;
    
    //Objetos para la generacion logica de el Mundo
    public static RMundo mundo = new RMundo(); 
    public static GItems gItems = new GItems();
    public static GBarras gBarras = new GBarras();
    public static GMatricesMundo gMatricesMundo = new GMatricesMundo();
    
    //Objeto de tipo GMundo
    public static GMundo gMundo = new GMundo();
    
    Mundo mundoM;
    
    public Ventana(Mundo m) 
    {
        //Iniciamos la ventana
        this.mundoM = m;
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Survival_ICO.png")).getImage());
        initComponents();
        setSize(600, 750);
        setLocationRelativeTo(null);
        
        JLabel matrizL[][] = {{e00, e01, e02, e03, e04}, 
                            {e10, e11, e12, e13, e14}, 
                            {e20, e21, e22, e23, e24}, 
                            {e30, e31, e32, e33, e34}, 
                            {e40, e41, e42, e43, e44}};
        
        //Array con 9 JLabels
        JLabel arrayHBCL[] = {eHBC0, eHBC1, eHBC2, eHBC3, eHBC4, eHBC5, eHBC6, eHBC7, eHBC8};

        //Array con 9 JLabels
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};

        //Array con 9 JLabels
        JLabel arrayHUI[] = {eHUI8, eHUI7, eHUI6, eHUI5, eHUI4, eHUI3, eHUI2, eHUI1, eHUI0};

        //Array con 9 JLabels
        JLabel arrayFUI[] = {eFUI0, eFUI1, eFUI2, eFUI3, eFUI4, eFUI5, eFUI6, eFUI7, eFUI8};
        
        //Llenamos las matrices de objetos de tipo Pasto
        gMatricesMundo.llenarMatriz(matrizC, mCSY, mCSX);
        gMatricesMundo.llenarMatriz(matrizM, mMSY, mMSX);
        gMatricesMundo.llenarMatriz(matrizOTM, mMSY, mMSX);
        
        //Llenamos la matrizI de objetos de tipo Empty
        this.matrizI = m.getmI();
        this.matrizIC = m.getmC();
        
        //Imprimimos la matrizC
        gMatricesMundo.imprimirMatriz(matrizC, mCSY, mCSX);
        
        //Generamos el mundo con el algoritmo de la clase GMundo
        this.matrizM = m.getmM();
        this.yMJ = m.getY();
        this.xMJ = m.getX();
        this.ce1 = m.getY() - 2;
        this.ce2 = m.getX() - 2;
        
        //Copiamos la matrizM en la matrizOTM
        gMatricesMundo.copiarMatrizSinEntidades(matrizOTM, matrizM, mMSY, mMSX);
        
        //Imprimimos la matrizM
        gMatricesMundo.imprimirMatriz(matrizM, mMSY, mMSX);
        
        //Copiamos la matrizM en la matrizC 
        gMatricesMundo.copiarMatriz(matrizC, matrizM, mCSY, mCSX, ce1, ce2);
        
        //Imprimimos la matrizC
        gMatricesMundo.imprimirMatriz(matrizC, mCSY, mCSX);
        
        //Renderizamos la matrizC en la matrizL y luego se muestra en la ventana
        mundo.renderizarImagen(matrizL, matrizC, dir);
        
        //Renderizamos la hot bar 
        gItems.renderizarSeleccionItems(matrizI, sI);
        gItems.renderizarContadorItems(arrayHBCL, matrizIC);
        gItems.renderizarItems(arrayHBL, matrizI);
        
        //Llenamos los arrays de las barras
        this.arrayBV = m.getaBV();
        this.arrayBC = m.getaBC();
        
        //Renderizamos las barras
        gBarras.renderizarBarra(arrayHUI, arrayBV);
        gBarras.renderizarBarra(arrayFUI, arrayBC);
        
        //Actualizamos el label de el item seleccionado
        actualizarLabelItemS();
    }
    
    public void mover(int y, int x, char dir)
    {
        if(updateCollision(y, x))
        {
            updateWorld();
            actualizarBarras();
        }
        else
        {
            moverJugador(y, x);
            updateWorld();
            actualizarBarras();
            
            /*
            //Descomentar en caso de emergencia
            gMatricesMundo.imprimirMatriz(matrizC, mCSY, mCSX);
            gMatricesMundo.imprimirMatriz(matrizOTM, mMSY, mMSX);
            //*/
        }
    }
    
    public void updateWorld()
    {   
        JLabel matrizL[][] = {{e00, e01, e02, e03, e04}, 
                            {e10, e11, e12, e13, e14}, 
                            {e20, e21, e22, e23, e24}, 
                            {e30, e31, e32, e33, e34}, 
                            {e40, e41, e42, e43, e44}};
        
        mundo.actualizarEntidades(matrizM, mMSY, mMSX);
        gMatricesMundo.copiarMatrizSinEntidades(matrizOTM, matrizM, mMSY, mMSX);
        gMatricesMundo.copiarMatriz(matrizC, matrizM, mCSY, mCSX, ce1, ce2);
        
        mundo.renderizarImagen(matrizL, matrizC, dir);
        
        if(mundo.jugadorIsDead(arrayBV))
        {
            DeadScreen dE = new DeadScreen(this, true, mundoM);
            dE.setVisible(true);
       }
    }
    
    public void actualizarBarras()
    {
        JLabel arrayHUI[] = {eHUI8, eHUI7, eHUI6, eHUI5, eHUI4, eHUI3, eHUI2, eHUI1, eHUI0};
        JLabel arrayFUI[] = {eFUI0, eFUI1, eFUI2, eFUI3, eFUI4, eFUI5, eFUI6, eFUI7, eFUI8};
        
        steps--;
        steps = gBarras.actualizarBarraComida(steps, 30, arrayBC);
        steps = gBarras.actualizarBarraVida(steps, 20, arrayBC, arrayBV);
        gBarras.restaurarBarraVida(arrayBV, arrayBC);
        gBarras.renderizarBarra(arrayHUI, arrayBV);
        gBarras.renderizarBarra(arrayFUI, arrayBC);
    }
    
    public boolean updateCollision(int yDir, int xDir)
    {
        if(matrizM[yMJ + yDir][xMJ + xDir].isIsRigid())
        {
            return true;
        }
        
        return false;
    }
    
    public void moverJugador(int yDir, int xDir)
    {
        if("f".equals(matrizOTM[yMJ + yDir][xMJ + xDir].getId()))
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Jugador("JF");
        }
        else if("s".equals(matrizOTM[yMJ + yDir][xMJ + xDir].getId()))
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Jugador("JS");
        }
        else if("aR".equals(matrizOTM[yMJ + yDir][xMJ + xDir].getId()))
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Jugador("JR");
        }
        else
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Jugador("J");
        }
        
        xMJ += xDir;
        yMJ += yDir;
        
        ce1 += yDir;
        ce2 += xDir;
        
        matrizM[yMJ - yDir][xMJ - xDir] = matrizOTM[yMJ - yDir][xMJ - xDir];
        gMatricesMundo.copiarMatrizSinEntidades(matrizOTM, matrizM, mMSY, mMSX);
    }
    
    public void updateDestruirBloque(int yDir, int xDir)
    {
        if(matrizOTM[yMJ + yDir][xMJ + xDir].getId() == "s")
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Arena();
        }
        else
        {
            matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Pasto();
        }
    }
    
    public void seleccionarItem(int s)
    {
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};
        
        sI = s;
        gItems.renderizarSeleccionItems(matrizI, sI);
        gItems.renderizarItems(arrayHBL, matrizI);
        
        actualizarLabelItemS();
    }
    
    public void destruirTile(JLabel arrayHBCL[], JLabel arrayHBL[], int yDir, int xDir, char dirChar)
    {
        ReturnItem rI[];
        
        if(dir == dirChar)
        {
            rI = matrizM[yMJ + yDir][xMJ + xDir].destruir(matrizI[0][sI]);
            
            for(int i = 0; i < 9; i++)
            {
                if(rI[i].getId() instanceof Empty)
                {
                    break;
                }
                else
                {
                    for(int x = 0; x < rI[i].getC(); x++)
                    {
                        rI[i].giveItem(matrizI, matrizIC);
                    }
                }
            }
            
            gItems.renderizarSeleccionItems(matrizI, sI);
            gItems.renderizarContadorItems(arrayHBCL, matrizIC);
            gItems.renderizarItems(arrayHBL, matrizI);

            if(matrizM[yMJ + yDir][xMJ + xDir].getLife() == 0)
            {
                matrizM[yMJ + yDir][xMJ + xDir] = new Pasto();
                updateDestruirBloque(yDir, xDir);
                updateWorld();
            }
        }
    }
    
    public void interactuarTileVentana(int yDir, int xDir, char dirChar)
    {
        if(dir == dirChar)
        {
            llamarVentanaI(matrizM[yMJ + yDir][xMJ + xDir].interactuarVentana(), yDir, xDir);
        }
    }
    
    public void ponerTile(int yDir, int xDir, char dirChar, int id)
    {
        JLabel arrayHBCL[] = {eHBC0, eHBC1, eHBC2, eHBC3, eHBC4, eHBC5, eHBC6, eHBC7, eHBC8};
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};
        
        if(dir == dirChar)
        {
            switch(id)
            {
                case 1:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Madera();
                    updateWorld();
                    break;
                    
                case 4:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Flor();
                    updateWorld(); 
                    break;
                    
                case 6:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.CraftingTable();
                    updateWorld(); 
                    break;  
                    
                case 10:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Roca();
                    updateWorld(); 
                    break;
                
                case 14:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Horno();
                    updateWorld(); 
                    break; 
                    
                case 17:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Hierro();
                    updateWorld(); 
                    break;  
                 
                case 22:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Arcilla();
                    updateWorld(); 
                    break;    
                    
                case 23:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Agua();
                    updateWorld(); 
                    break;
                    
                case 30:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Cofre();
                    matrizM[yMJ + yDir][xMJ + xDir].setmI(matrizI[0][sI].getmI());
                    matrizM[yMJ + yDir][xMJ + xDir].setmCI(matrizI[0][sI].getmCI());
                    updateWorld(); 
                    break;    
                    
                case 31:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Hongo();
                    updateWorld(); 
                    break;  
                    
                case 35:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Planta();
                    updateWorld(); 
                    break;  
                    
                case 36:
                    matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.Semillas();
                    updateWorld(); 
                    break;
                    
                case 39:
                matrizM[yMJ + yDir][xMJ + xDir] = new Tiles.BloqueLadrillo();
                updateWorld(); 
                break;
            }
        }
    }
    
    public void tirarItem(int mode)
    {
        JLabel arrayHBCL[] = {eHBC0, eHBC1, eHBC2, eHBC3, eHBC4, eHBC5, eHBC6, eHBC7, eHBC8};
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};
        
        if(matrizIC[0][sI] != 0)
        {
            if(mode == 1)
            {
                matrizIC[0][sI]--;
            }
            else if(mode == 2)
            {
                if(matrizI[0][sI].getId() == 22)
                {
                    matrizI[0][sI] = new CubetaAgua();
                }
                else if(matrizI[0][sI].getId() == 23)
                {
                    matrizI[0][sI] = new Cubeta();
                }
                else if(matrizI[0][sI].getId() == 33)
                {
                    matrizI[0][sI] = new Bowl();
                }
                else
                {
                    matrizIC[0][sI]--;
                }
            }

            gItems.renderizarContadorItems(arrayHBCL, matrizIC);
            gItems.isItemEmpty(matrizI, matrizIC);
            gItems.renderizarSeleccionItems(matrizI, sI);
            gItems.renderizarItems(arrayHBL, matrizI);
        }
        else
        {
            gItems.renderizarContadorItems(arrayHBCL, matrizIC);
            gItems.renderizarSeleccionItems(matrizI, sI);
            gItems.renderizarItems(arrayHBL, matrizI);
        }
    }
    
    public void actualizarLabelItemS()
    {
        etiquetaItemS.setText(matrizI[0][sI].getItemName());
    }
    
    public void llamarVentanaI(int mode, int yDir, int xDir)
    {   
        if(mode == 100) return;
        
        JLabel arrayHBCL[] = {eHBC0, eHBC1, eHBC2, eHBC3, eHBC4, eHBC5, eHBC6, eHBC7, eHBC8};
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};
        
        switch(mode)
        {
            case 0:
                VentanaInventario vI = new VentanaInventario(this, true, matrizI, matrizIC);
                vI.setVisible(true);
                break;
                
            case 1:
                VentanaCraftingTable vCT = new VentanaCraftingTable(this, true, matrizI, matrizIC);
                vCT.setVisible(true);
                break;  
                
            case 2:
                VentanaHorno vH = new VentanaHorno(this, true, matrizI, matrizIC);
                vH.setVisible(true);
                break;   
                
            case 3:
                VentanaCofre vC = new VentanaCofre(this, true, matrizI, matrizIC, yDir, xDir);
                vC.setVisible(true);
                break;    
        }
        
        gItems.renderizarItems(arrayHBL, matrizI);
        gItems.renderizarContadorItems(arrayHBCL, matrizIC);
        seleccionarItem(sI);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMundo = new javax.swing.JPanel();
        e00 = new javax.swing.JLabel();
        e01 = new javax.swing.JLabel();
        e02 = new javax.swing.JLabel();
        e03 = new javax.swing.JLabel();
        e04 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e12 = new javax.swing.JLabel();
        e13 = new javax.swing.JLabel();
        e14 = new javax.swing.JLabel();
        e20 = new javax.swing.JLabel();
        e21 = new javax.swing.JLabel();
        e22 = new javax.swing.JLabel();
        e23 = new javax.swing.JLabel();
        e24 = new javax.swing.JLabel();
        e30 = new javax.swing.JLabel();
        e31 = new javax.swing.JLabel();
        e32 = new javax.swing.JLabel();
        e33 = new javax.swing.JLabel();
        e34 = new javax.swing.JLabel();
        e40 = new javax.swing.JLabel();
        e41 = new javax.swing.JLabel();
        e42 = new javax.swing.JLabel();
        e43 = new javax.swing.JLabel();
        e44 = new javax.swing.JLabel();
        panelHotBar = new javax.swing.JPanel();
        eHBC0 = new javax.swing.JLabel();
        eHBC1 = new javax.swing.JLabel();
        eHBC2 = new javax.swing.JLabel();
        eHBC3 = new javax.swing.JLabel();
        eHBC4 = new javax.swing.JLabel();
        eHBC5 = new javax.swing.JLabel();
        eHBC6 = new javax.swing.JLabel();
        eHBC7 = new javax.swing.JLabel();
        eHBC8 = new javax.swing.JLabel();
        eHB0 = new javax.swing.JLabel();
        eHB1 = new javax.swing.JLabel();
        eHB2 = new javax.swing.JLabel();
        eHB3 = new javax.swing.JLabel();
        eHB4 = new javax.swing.JLabel();
        eHB5 = new javax.swing.JLabel();
        eHB6 = new javax.swing.JLabel();
        eHB7 = new javax.swing.JLabel();
        eHB8 = new javax.swing.JLabel();
        panelBarras = new javax.swing.JPanel();
        eHUI0 = new javax.swing.JLabel();
        eHUI1 = new javax.swing.JLabel();
        eHUI2 = new javax.swing.JLabel();
        eHUI3 = new javax.swing.JLabel();
        eHUI4 = new javax.swing.JLabel();
        eHUI5 = new javax.swing.JLabel();
        eHUI6 = new javax.swing.JLabel();
        eHUI7 = new javax.swing.JLabel();
        eHUI8 = new javax.swing.JLabel();
        eE = new javax.swing.JLabel();
        eFUI0 = new javax.swing.JLabel();
        eFUI1 = new javax.swing.JLabel();
        eFUI2 = new javax.swing.JLabel();
        eFUI3 = new javax.swing.JLabel();
        eFUI4 = new javax.swing.JLabel();
        eFUI5 = new javax.swing.JLabel();
        eFUI6 = new javax.swing.JLabel();
        eFUI7 = new javax.swing.JLabel();
        eFUI8 = new javax.swing.JLabel();
        panelMensajes = new javax.swing.JPanel();
        etiquetaItemS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Survival 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 750));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        panelMundo.setBackground(new java.awt.Color(0, 204, 51));
        panelMundo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelMundo.setLayout(new java.awt.GridLayout(5, 5));
        panelMundo.add(e00);
        panelMundo.add(e01);
        panelMundo.add(e02);
        panelMundo.add(e03);
        panelMundo.add(e04);
        panelMundo.add(e10);
        panelMundo.add(e11);
        panelMundo.add(e12);
        panelMundo.add(e13);
        panelMundo.add(e14);
        panelMundo.add(e20);
        panelMundo.add(e21);
        panelMundo.add(e22);
        panelMundo.add(e23);
        panelMundo.add(e24);
        panelMundo.add(e30);
        panelMundo.add(e31);
        panelMundo.add(e32);
        panelMundo.add(e33);
        panelMundo.add(e34);
        panelMundo.add(e40);
        panelMundo.add(e41);
        panelMundo.add(e42);
        panelMundo.add(e43);
        panelMundo.add(e44);

        panelHotBar.setBackground(new java.awt.Color(153, 153, 153));
        panelHotBar.setLayout(new java.awt.GridLayout(2, 9));
        panelHotBar.add(eHBC0);
        panelHotBar.add(eHBC1);
        panelHotBar.add(eHBC2);
        panelHotBar.add(eHBC3);
        panelHotBar.add(eHBC4);
        panelHotBar.add(eHBC5);
        panelHotBar.add(eHBC6);
        panelHotBar.add(eHBC7);
        panelHotBar.add(eHBC8);
        panelHotBar.add(eHB0);
        panelHotBar.add(eHB1);
        panelHotBar.add(eHB2);
        panelHotBar.add(eHB3);
        panelHotBar.add(eHB4);
        panelHotBar.add(eHB5);
        panelHotBar.add(eHB6);
        panelHotBar.add(eHB7);
        panelHotBar.add(eHB8);

        panelBarras.setBackground(new java.awt.Color(204, 51, 0));
        panelBarras.setLayout(new java.awt.GridLayout(1, 25));
        panelBarras.add(eHUI0);
        panelBarras.add(eHUI1);
        panelBarras.add(eHUI2);
        panelBarras.add(eHUI3);
        panelBarras.add(eHUI4);
        panelBarras.add(eHUI5);
        panelBarras.add(eHUI6);
        panelBarras.add(eHUI7);
        panelBarras.add(eHUI8);
        panelBarras.add(eE);
        panelBarras.add(eFUI0);
        panelBarras.add(eFUI1);
        panelBarras.add(eFUI2);
        panelBarras.add(eFUI3);
        panelBarras.add(eFUI4);
        panelBarras.add(eFUI5);
        panelBarras.add(eFUI6);
        panelBarras.add(eFUI7);
        panelBarras.add(eFUI8);

        panelMensajes.setBackground(new java.awt.Color(0, 0, 0));
        panelMensajes.setLayout(new java.awt.GridLayout(1, 1));

        etiquetaItemS.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaItemS.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaItemS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaItemS.setText("---___---");
        panelMensajes.add(etiquetaItemS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMundo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(panelHotBar, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(panelBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHotBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        JLabel arrayHBCL[] = {eHBC0, eHBC1, eHBC2, eHBC3, eHBC4, eHBC5, eHBC6, eHBC7, eHBC8};
        JLabel arrayHBL[] = {eHB0, eHB1, eHB2, eHB3, eHB4, eHB5, eHB6, eHB7, eHB8};
        JLabel arrayHUI[] = {eHUI8, eHUI7, eHUI6, eHUI5, eHUI4, eHUI3, eHUI2, eHUI1, eHUI0};
        JLabel arrayFUI[] = {eFUI0, eFUI1, eFUI2, eFUI3, eFUI4, eFUI5, eFUI6, eFUI7, eFUI8};
        
        if(evt.getKeyChar() == 'w')
        {
            if(dir == 'u')
            {
                mover(-1, 0, dir);
            }
            else
            {
                dir = 'u';
                updateWorld();
                actualizarBarras();
            }
        }
        else if(evt.getKeyChar() == 's')
        {
            if(dir == 'd')
            {
                mover(1, 0, dir);
            }
            else
            {
                dir = 'd';
                updateWorld();
                actualizarBarras();
            }
        }
        else if(evt.getKeyChar() == 'a')
        {
            if(dir == 'l')
            {
                mover(0, -1, dir);
            }
            else
            {
                dir = 'l';
                updateWorld();
                actualizarBarras();
            }
        }
        else if(evt.getKeyChar() == 'd')
        {
            if(dir == 'r')
            {
                mover(0, 1, dir);
            }
            else
            {
                dir = 'r';
                updateWorld();
                actualizarBarras();
            }
        }
        else if(evt.getKeyChar() == 'z')
        {
            if(matrizM[yMJ - 1][xMJ].isIsInteractive())
            {
                destruirTile(arrayHBCL, arrayHBL, -1, 0, 'u');
            }
            
            if(matrizM[yMJ + 1][xMJ].isIsInteractive())
            {
                destruirTile(arrayHBCL, arrayHBL, 1, 0, 'd');
            }
            
            if(matrizM[yMJ][xMJ + 1].isIsInteractive())
            {
                destruirTile(arrayHBCL, arrayHBL, 0, 1, 'r');
            }
            
            if(matrizM[yMJ][xMJ - 1].isIsInteractive())
            {
                destruirTile(arrayHBCL, arrayHBL, 0, -1, 'l');
            }
            
            actualizarLabelItemS();
        }
        else if(evt.getKeyChar() == 'x')
        {
            if(matrizM[yMJ - 1][xMJ].isIsInteractive())
            {
                interactuarTileVentana(-1, 0, 'u');
            }
            
            if(matrizM[yMJ + 1][xMJ].isIsInteractive())
            {
                interactuarTileVentana(1, 0, 'd');
            }
            
            if(matrizM[yMJ][xMJ + 1].isIsInteractive())
            {
                interactuarTileVentana(0, 1, 'r');
            }
            
            if(matrizM[yMJ][xMJ - 1].isIsInteractive())
            {
                interactuarTileVentana(0, -1, 'l');
            }
            
            actualizarLabelItemS();
        }
        else if(evt.getKeyChar() == '1')
        {
            seleccionarItem(0);
        }
        else if(evt.getKeyChar() == '2')
        {
            seleccionarItem(1);
        }
        else if(evt.getKeyChar() == '3')
        {
            seleccionarItem(2);
        }
        else if(evt.getKeyChar() == '4')
        {
            seleccionarItem(3);
        }
        else if(evt.getKeyChar() == '5')
        {
            seleccionarItem(4);
        }
        else if(evt.getKeyChar() == '6')
        {
            seleccionarItem(5);
        }
        else if(evt.getKeyChar() == '7')
        {
            seleccionarItem(6);
        }
        else if(evt.getKeyChar() == '8')
        {
            seleccionarItem(7);
        }
        else if(evt.getKeyChar() == '9')
        {
            seleccionarItem(8);
        }
        else if(evt.getKeyChar() == 'q')
        {
            tirarItem(1);
            actualizarLabelItemS();
        }
        else if(evt.getKeyChar() == 'e')
        {
            llamarVentanaI(0, 0, 0);
        }
        else if(evt.getKeyChar() == 'c')
        {
            boolean band1 = false, band2 = false;
            
            band1 = matrizI[0][sI].accionComida(arrayBC);
            gBarras.restaurarBarraVida(arrayBV, arrayBC);
            gBarras.renderizarBarra(arrayHUI, arrayBV);
            gBarras.renderizarBarra(arrayFUI, arrayBC);
            
            if(dir == 'u')
            {
                if(band2 = matrizI[0][sI].accion(matrizM, -1, 0))
                {
                    ponerTile(-1, 0, 'u', matrizI[0][sI].getId());
                }
            }
            else if(dir == 'd')
            {
                if(band2 = matrizI[0][sI].accion(matrizM, 1, 0))
                {
                    ponerTile(1, 0, 'd', matrizI[0][sI].getId());
                }
            }
            else if(dir == 'l')
            {
                if(band2 = matrizI[0][sI].accion(matrizM, 0, -1))
                {
                    ponerTile(0, -1, 'l', matrizI[0][sI].getId());
                }
            }
            else if(dir == 'r')
            {
                if(band2 = matrizI[0][sI].accion(matrizM, 0, 1))
                {
                    ponerTile(0, 1, 'r', matrizI[0][sI].getId());
                }
            }
            
            if(band1 || band2)
            {
                tirarItem(2);
            }
            
            actualizarLabelItemS();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            Pausa p = new Pausa(this, true, mundoM, matrizM, matrizI, matrizIC, yMJ, xMJ);
            p.setVisible(true);
        }
        else if(evt.getKeyChar() == 'p')
        {
            ReturnItem rI;
            int c;
            
            try
            {
                switch(Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + 
                                                                          "\n ITEM ID: ")))
                {
                    case 1:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Madera(), c, 1);
                        }
                        
                        break;

                    case 2:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Fruta(), c, 1);
                        }
                        
                        break;    

                    case 3:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new RawBeef(), c, 1);
                        }
                        
                        break;    

                    case 4:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Flor(), c, 1);
                        }
                        
                        break;        

                    case 5:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Palo(), c, 1);
                        }
                        
                        break;     

                    case 6:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.CraftingTable(), c, 1);
                        }
                        
                        break;     

                    case 7:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new EspadaMadera(), c, 1);
                        }
                        
                        break;      

                    case 8:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new PicoMadera(), c, 1);
                        }
                        
                        break;       

                    case 9:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new HachaMadera(), c, 1);
                        }
                        
                        break;   

                    case 10:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Roca(), c, 1);
                        }
                        
                        break;        

                    case 11:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new EspadaPiedra(), c, 1);
                        }
                        
                        break;     

                    case 12:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new PicoPiedra(), c, 1);
                        }
                        
                        break;     

                    case 13:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new HachaPiedra(), c, 1);
                        }
                        
                        break;      

                    case 14:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Horno(), c, 1);
                        }
                        
                        break;       

                    case 15:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new CookedBeef(), c, 1);
                        }
                        
                        break;        

                    case 16:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Carbon(), c, 1);
                        }
                        
                        break;  
                        
                    case 17:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new OreHierro(), c, 1);
                        }
                        
                        break;  
                        
                    case 18:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Hierro(), c, 1);
                        }
                        
                        break;    
                      
                    case 19:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new EspadaHierro(), c, 1);
                        }
                        
                        break;      
                    
                    case 20:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new PicoHierro(), c, 1);
                        }
                        
                        break;  
                        
                    case 21:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new HachaHierro(), c, 1);
                        }
                        
                        break;    
                    
                    case 22:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Cubeta(), c, 1);
                        }
                        
                        break;    
                    
                    case 23:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new CubetaAgua(), c, 1);
                        }
                        
                        break;    
                     
                    case 24:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Trigo(), c, 1);
                        }
                        
                        break; 
                        
                    case 25:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new MasaTrigo(), c, 1);
                        }
                        
                        break;    
                     
                    case 26:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Pan(), c, 1);
                        }
                        
                        break;     
                     
                    case 27:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new CarbonVegetal(), c, 1);
                        }
                        
                        break;   
                        
                    case 28:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new FloresPalos(), c, 1);
                        }
                        
                        break;     
                    
                    case 29:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new PieFruta(), c, 1);
                        }
                        
                        break;    
                     
                    case 30:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Cofre(), c, 1);
                        }
                        
                        break;     
                        
                    case 31:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Hongo(), c, 1);
                        }
                        
                        break;     
                    
                    case 32:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Bowl(), c, 1);
                        }
                        
                        break;   
                        
                    case 33:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new SopaHongo(), c, 1);
                        }
                        
                        break; 
                        
                    case 34:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new FrutaHierro(), c, 1);
                        }
                        
                        break;     
                     
                    case 35:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Planta(), c, 1);
                        }
                        
                        break;    
                      
                    case 36:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Semillas(), c, 1);
                        }
                        
                        break;    
                    
                    case 37:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.Arcilla(), c, 1);
                        }
                        
                        break;
                        
                    case 38:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Ladrillo(), c, 1);
                        }
                        
                        break;
                        
                    case 39:
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "DEBUG MODE" + "\n ITEM C: "));
                        
                        if(c > 9)
                        {
                            JOptionPane.showMessageDialog(null, "ERROR ITEM C > 9");
                            rI = new ReturnItem(new Empty(), 0, 0);
                        }
                        else
                        {
                            rI = new ReturnItem(new Items.BloqueLadrillo(), c, 1);
                        }
                        
                        break;    
                        
                    default:
                        rI = new ReturnItem(new Empty(), 0, 0);
                        break;    
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR " + ex);
                rI = new ReturnItem(new Empty(), 0, 0);
            }
            
            for(int i = 0; i < rI.getC(); i++)
            {
                rI.giveItem(matrizI, matrizIC);
            }
            
            gItems.renderizarSeleccionItems(matrizI, sI);
            gItems.renderizarContadorItems(arrayHBCL, matrizIC);
            gItems.renderizarItems(arrayHBL, matrizI);
            actualizarLabelItemS();
        }
    }//GEN-LAST:event_formKeyReleased

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                v = new Ventana(null);    
                v.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Survival_ICO.png")).getImage());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel e00;
    public static javax.swing.JLabel e01;
    public static javax.swing.JLabel e02;
    public static javax.swing.JLabel e03;
    public static javax.swing.JLabel e04;
    public static javax.swing.JLabel e10;
    public static javax.swing.JLabel e11;
    public static javax.swing.JLabel e12;
    public static javax.swing.JLabel e13;
    public static javax.swing.JLabel e14;
    public static javax.swing.JLabel e20;
    public static javax.swing.JLabel e21;
    public static javax.swing.JLabel e22;
    public static javax.swing.JLabel e23;
    public static javax.swing.JLabel e24;
    public static javax.swing.JLabel e30;
    public static javax.swing.JLabel e31;
    public static javax.swing.JLabel e32;
    public static javax.swing.JLabel e33;
    public static javax.swing.JLabel e34;
    public static javax.swing.JLabel e40;
    public static javax.swing.JLabel e41;
    public static javax.swing.JLabel e42;
    public static javax.swing.JLabel e43;
    public static javax.swing.JLabel e44;
    public static javax.swing.JLabel eE;
    public static javax.swing.JLabel eFUI0;
    public static javax.swing.JLabel eFUI1;
    public static javax.swing.JLabel eFUI2;
    public static javax.swing.JLabel eFUI3;
    public static javax.swing.JLabel eFUI4;
    public static javax.swing.JLabel eFUI5;
    public static javax.swing.JLabel eFUI6;
    public static javax.swing.JLabel eFUI7;
    public static javax.swing.JLabel eFUI8;
    public static javax.swing.JLabel eHB0;
    public static javax.swing.JLabel eHB1;
    public static javax.swing.JLabel eHB2;
    public static javax.swing.JLabel eHB3;
    public static javax.swing.JLabel eHB4;
    public static javax.swing.JLabel eHB5;
    public static javax.swing.JLabel eHB6;
    public static javax.swing.JLabel eHB7;
    public static javax.swing.JLabel eHB8;
    public static javax.swing.JLabel eHBC0;
    public static javax.swing.JLabel eHBC1;
    public static javax.swing.JLabel eHBC2;
    public static javax.swing.JLabel eHBC3;
    public static javax.swing.JLabel eHBC4;
    public static javax.swing.JLabel eHBC5;
    public static javax.swing.JLabel eHBC6;
    public static javax.swing.JLabel eHBC7;
    public static javax.swing.JLabel eHBC8;
    public static javax.swing.JLabel eHUI0;
    public static javax.swing.JLabel eHUI1;
    public static javax.swing.JLabel eHUI2;
    public static javax.swing.JLabel eHUI3;
    public static javax.swing.JLabel eHUI4;
    public static javax.swing.JLabel eHUI5;
    public static javax.swing.JLabel eHUI6;
    public static javax.swing.JLabel eHUI7;
    public static javax.swing.JLabel eHUI8;
    private javax.swing.JLabel etiquetaItemS;
    private javax.swing.JPanel panelBarras;
    private javax.swing.JPanel panelHotBar;
    private javax.swing.JPanel panelMensajes;
    private javax.swing.JPanel panelMundo;
    // End of variables declaration//GEN-END:variables
}
