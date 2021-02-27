package Tiles;

import Items.*;

public class Horno extends Tile
{
    public Horno() 
    {
        super("h", "/imagenes/SurvivalHornoSprite.png", true, true, true, 5);
    }

    @Override
    public ReturnItem[] destruir(Item item)
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }
        
        if(life != 1)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life--;
            return rI;
        }
        else
        {
            rI[0] = new ReturnItem(new Items.Horno(), 1, 1);
            life--;
            return rI;
        }
    }

    @Override
    public int interactuarVentana() 
    {
        return 2;
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
