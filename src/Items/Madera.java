package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class Madera extends Item
{
    public Madera() 
    {
        super(1, "/imagenes/SurvivalItem_MaderaSprite.png", "Wood", true, true, 2);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Madera_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_MaderaSprite.png");
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
