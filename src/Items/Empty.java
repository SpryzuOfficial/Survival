package Items;

import Barras.*;
import Tiles.*;
import java.io.Serializable;

public class Empty extends Item 
{
    public Empty() 
    {
        super(0, "/imagenes/SurvivalItem_EMPTYSprite.png", " ", true, false, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_EMPTY_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_EMPTYSprite.png");
        }
    }
    
    @Override
    public boolean accion(Tile m1[][], int yDir, int xDir) 
    {
        return false;
    }
    
    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }
}
