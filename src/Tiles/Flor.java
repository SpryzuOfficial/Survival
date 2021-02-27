package Tiles;

import Items.*;

public class Flor extends Tile
{
    public Flor()
    {
        super("f", "/imagenes/SurvivalFlorSprite.png", false, true, false, 1);
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
            rI[0] = new ReturnItem(new Items.Flor(), 1, 1);
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
    public String toString()
    {
        return id;
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
}
