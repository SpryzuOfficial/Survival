package Items;

import Barras.*;
import Tiles.*;

public class Hierro extends Item
{
    public Hierro()
    {
        super(18, "/imagenes/SurvivalItem_HierroSprite.png", "Iron", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Hierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_HierroSprite.png");
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
