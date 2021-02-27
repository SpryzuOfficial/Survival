package Items;

import Barras.*;
import Tiles.*;

public class Carbon extends Item
{
    public Carbon() 
    {
        super(16, "/imagenes/SurvivalItem_CarbonSprite.png", "Coal", true, true, 4);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Carbon_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CarbonSprite.png");
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
