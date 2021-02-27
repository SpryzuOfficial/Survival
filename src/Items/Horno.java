package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class Horno extends Item
{
    public Horno() 
    {
        super(14, "/imagenes/SurvivalItem_HornoSprite.png", "Oven", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Horno_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_HornoSprite.png");
        }
    }

    @Override
    public boolean accion(Tile m1[][], int yDir, int xDir) 
    {
        if(!m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].isIsRigid())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }
}
