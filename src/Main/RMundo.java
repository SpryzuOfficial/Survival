package Main;

import Barras.*;
import Entidades.*;
import Tiles.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RMundo 
{    
    //Constructor por defecto
    public RMundo()
    {}
    
    //Metodo para renderizar una matriz en la matrizL
    public void renderizarImagen(JLabel m1[][], Tile m2[][], char dir)
    {
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                if(m2[i][j] instanceof Jugador)
                {
                    if(m2[i][j].getId() == "JF")
                    {
                        if(dir == 'u')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(4))));
                        }
                        else if(dir == 'd')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(5))));
                        }
                        else if(dir == 'r')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(6))));
                        }
                        else if(dir == 'l')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(7))));
                        }
                    }
                    else if(m2[i][j].getId() == "JS")
                    {
                        if(dir == 'u')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(8))));
                        }
                        else if(dir == 'd')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(9))));
                        }
                        else if(dir == 'r')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(10))));
                        }
                        else if(dir == 'l')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(11))));
                        }
                    }
                    else if(m2[i][j].getId() == "JR")
                    {
                        if(dir == 'u')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(12))));
                        }
                        else if(dir == 'd')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(13))));
                        }
                        else if(dir == 'r')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(14))));
                        }
                        else if(dir == 'l')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(15))));
                        }
                    }
                    else
                    {
                        if(dir == 'u')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(0))));
                        }
                        else if(dir == 'd')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(1))));
                        }
                        else if(dir == 'r')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(2))));
                        }
                        else if(dir == 'l')
                        {
                            m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(3))));
                        }
                    }
                }
                else if(m2[i][j] instanceof Vaca)
                {
                    if(m2[i][j].getDirChar() == 'u')
                    {
                        m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(0))));
                    }
                    else if(m2[i][j].getDirChar() == 'd')
                    {
                        m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(1))));
                    }
                    else if(m2[i][j].getDirChar() == 'r')
                    {
                        m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(2))));
                    }
                    else if(m2[i][j].getDirChar() == 'l')
                    {
                        m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagenes(3))));
                    }
                }
                else
                {
                    m1[i][j].setIcon(new ImageIcon(getClass().getResource(m2[i][j].getImagen())));
                }
            }
        }
    }
    
    public boolean jugadorIsDead(BarraVida a2[])
    {
        boolean isDead = false;
        
        for (int i = 0; i < 9; i++)
        {
            if(a2[i].isIsFull())
            {
                isDead = false;
            }
            else
            {
                isDead = true;
            }
        }
        
        return isDead;
    }
    
    public void actualizarEntidades(Tile[][] m, int y, int x)
    {
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                m[i][j].update(m, i, j);
            }
        }
    }
}
