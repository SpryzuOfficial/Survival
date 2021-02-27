package Items;

import Barras.*;
import Tiles.*;

public class FloresPalos extends Item
{
    public FloresPalos() 
    {
        super(28, "/imagenes/SurvivalItem_FloresPalosSprite.png", "Flowers and sticks", true, true, 4);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_FloresPalos_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_FloresPalosSprite.png");
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
