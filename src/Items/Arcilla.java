package Items;

import Barras.*;
import Tiles.*;

public class Arcilla extends Item
{
    public Arcilla() 
    {
        super(37, "/imagenes/SurvivalItem_ArcillaSprite.png", "Clay", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Arcilla_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_ArcillaSprite.png");
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
