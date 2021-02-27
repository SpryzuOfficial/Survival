package Main;

import Barras.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GBarras 
{
    //Constructor por defecto
    public GBarras()
    {}
    
    public void llenarBarraVida(BarraVida a1[])
    {
        for (int i = 0; i < 9; i++)
        {
            a1[i] = new BarraVida(true);
        }
    }
    
    public void restaurarBarraVida(BarraVida a1[], BarraComida a2[])
    {
        boolean band = false;
        
        for(int i = 8; i >= 0; i--)
        {
            if(a2[i].isIsFull())
            {
                band = true;
            }
            else
            {
                band = false;
            }
        }
        
        if(band)
        {
            for (int i = 0; i < 9; i++)
            {
                if(!a1[i].isIsFull())
                {
                    a1[i].setIsFull(true);
                }
            }
        }
    }
    
    public void llenarBarraComida(BarraComida a1[])
    {
        for(int i = 0; i < 9; i++)
        {
            a1[i] = new BarraComida(true);
        }
    }
    
    public void renderizarBarra(JLabel a1[], Barra a2[])
    {
        for(int i = 0; i < 9; i++)
        {
            a1[i].setIcon(new ImageIcon(getClass().getResource(a2[i].getImagen())));
        }
    }
    
    public int actualizarBarraComida(int steps, int nSteps, BarraComida a1[])
    {
        if(steps == 0)
        {
            for (int i = 0; i < 9; i++)
            {
                if(a1[i].isIsFull())
                {
                    a1[i].setIsFull(false);
                    steps = nSteps;
                    break;
                }
            }
        }
        
        return steps;
    }
    
    public int actualizarBarraVida(int steps, int nSteps, BarraComida a1[], BarraVida a2[])
    {
        boolean band = true;
        
        for (int i = 0; i < 9; i++)
        {
            if(a1[i].isIsFull())
            {
                band = false;
            }
        }
        
        if(band)
        {
            if(steps == 0)
            {
                for (int i = 0; i < 9; i++)
                {
                    if(a2[i].isIsFull())
                    {
                        a2[i].setIsFull(false);
                        steps = nSteps;
                        break;
                    }
                }
            }
        }
        
        return steps;
    }
}
