package Tiles;

import Items.*;
import javax.swing.JFrame;

public class Pasto extends Tile
{
    public Pasto() 
    {
        super("p", "/imagenes/SurvivalPastoSprite.png", false);
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
