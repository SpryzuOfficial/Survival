package Items;

import Barras.*;
import Tiles.*;

public class Palo extends Item
{
    public Palo()
    {
        super(5, "/imagenes/SurvivalItem_PaloSprite.png", "Stick", true, true, 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Palo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_PaloSprite.png");
        }
    }

    @Override
    public boolean accion(Tile[][] m1, int yDir, int xDir)
    {
        return false;
    }    
    
    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }
}
