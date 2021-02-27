package Tiles;

import Items.*;

public class Hongo extends Tile
{
    public Hongo()
    {
        super("hO", "/imagenes/SurvivalHongoSprite.png", true, true, false, 1);
    }

    @Override
    public ReturnItem[] destruir(Item item) 
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }

        if(life != 0)
        {
            rI[0] = new ReturnItem(new Items.Hongo(), 1, 1);
            life--;
            return rI;
        }
        
        return null;
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
