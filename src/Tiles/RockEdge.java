package Tiles;

import Items.*;

public class RockEdge extends Tile
{
    public RockEdge() 
    {
        super("re", "/imagenes/SurvivalEdgeSprite.png", true);
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
}
