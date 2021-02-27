package Comidas;

import Barras.*;
import Items.*;
import Tiles.*;

public abstract class Comida extends Item
{
    int foodLevel;

    public Comida(int id, String imagen, String itemName, int foodLevel)
    {
        super(id, imagen, itemName, false, true, 0);
        this.foodLevel = foodLevel;
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        
    }

    @Override
    public boolean accion(Tile[][] m1, int yDir, int xDir)
    {
        return false;
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[])
    {
        boolean band = false;
        
        for(int i = 8; i >= 0; i--)
        {
            if(arrayBC[i].isIsFull())
            {
                band = false;
            }
            else
            {
                band = true;
            }
        }
        
        if(band)
        {
            ReturnFoodLevel rFL = new ReturnFoodLevel(foodLevel, arrayBC);

            rFL.incrementarFoodLevel();

            return true;
        }
        else
        {
            return false;
        }
    }
}
