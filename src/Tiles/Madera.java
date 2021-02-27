package Tiles;

import Herramientas.*;
import Items.*;

public class Madera extends Tile
{
    public Madera()
    {
        super("m", "/imagenes/SurvivalMaderaSprite.png", true, true, true, 3);
    }

    @Override
    public ReturnItem[] destruir(Item item) 
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }

        if(item instanceof HachaMadera)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 2;
            
            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Madera(), 1, 1);
                life = 0;
                return rI;
            }
            
            return rI;
        }
        else if(item instanceof HachaPiedra)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 3;
            
            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Madera(), 1, 1);
                life = 0;
                return rI;
            }
            
            return rI;
        }
        else if(item instanceof HachaHierro)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 5;
            
            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Madera(), 1, 1);
                life = 0;
                return rI;
            }
            
            return rI;
        }
        else
        {
            if(life != 1)
            {
                rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
                life--;
                return rI;
            }
            else
            {
                rI[0] = new ReturnItem(new Items.Madera(), 1, 1);
                life--;
                return rI;
            }
        }
    }

    @Override
    public int interactuarVentana() 
    {
        return 100;
    }
    
    @Override
    public void update(Tile[][] m, int y, int x) 
    {
        
    }

    @Override
    public String getImagenes(int i)
    {
        return null;
    }

    @Override 
    public String toString()
    {
        return id;
    }
}
