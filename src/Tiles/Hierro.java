package Tiles;

import Herramientas.*;
import Items.*;

public class Hierro extends Tile
{
    public Hierro() 
    {
        super("h", "/imagenes/SurvivalHierroSprite.png", true, true, true, 28);
    }

    @Override
    public ReturnItem[] destruir(Item item) 
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }
        
        if(item instanceof PicoPiedra)
        {
            rI[0] = new ReturnItem(new Empty(), 0, 0);
            life -= 2;
            
            if(life <= 1)
            {
                rI[0] = new ReturnItem(new OreHierro(), 1, 1);
                life = 0;
                return rI;
            }
            
            return rI;
        }
        else if(item instanceof PicoHierro)
        {
            rI[0] = new ReturnItem(new Empty(), 0, 0);
            life -= 4;
            
            if(life <= 1)
            {
                rI[0] = new ReturnItem(new OreHierro(), 1, 1);
                life = 0;
                return rI;
            }
            
            return rI;
        }
        else
        {
            rI[0] = new ReturnItem(new Empty(), 0, 0);
            life--;
            return rI;
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
