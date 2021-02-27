package Herramientas;

import Barras.*;
import Items.*;
import Tiles.*;

public class Herramienta extends Item
{

    public Herramienta(int id, String imagen, String itemName, boolean isCombustible, int combustibleLevel) 
    {
        super(id, imagen, itemName, isCombustible, false, combustibleLevel);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
    
    }

    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }

    @Override
    public boolean accion(Tile[][] m1, int yDir, int xDir) 
    {
        return false;
    }    
}
