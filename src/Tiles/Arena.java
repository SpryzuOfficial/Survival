package Tiles;

import Items.*;

public class Arena extends Tile
{
    public Arena() 
    {
        super("s", "/imagenes/SurvivalArenaSprite.png", false);
    }

    @Override
    public ReturnItem[] destruir(Item item)
    {
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
