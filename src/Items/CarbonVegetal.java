package Items;

import Barras.*;
import Tiles.*;

public class CarbonVegetal extends Item
{
    public CarbonVegetal() 
    {
        super(27, "/imagenes/SurvivalItem_CarbonVegetalSprite.png", "Charcoal", true, true, 4);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_CarbonVegetal_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CarbonVegetalSprite.png");
        }
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
