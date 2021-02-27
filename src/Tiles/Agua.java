package Tiles;

import Items.*;

public class Agua extends Tile
{
    public Agua() 
    {
        super("w", "/imagenes/SurvivalAguaSprite.png", true);
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
