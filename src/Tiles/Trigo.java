package Tiles;

import Items.*;

public class Trigo extends Tile
{
    public Trigo() 
    {
        super("t", "/imagenes/SurvivalTrigoSprite.png", true, true, false, 1);
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
            rI[0] = new ReturnItem(new Items.Trigo(), 1, 1);
            
            if((int) (Math.random() * 100) + 1 <= 30)
            {
                rI[1] = new ReturnItem(new Items.Semillas(), 1, 1);
            }
            
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
