package Items;

import Barras.*;
import Items.*;
import Tiles.*;
import Ventanas.*;

public class Hongo extends Item
{
    public Hongo() 
    {
        super(31, "/imagenes/SurvivalItem_HongoSprite.png", "Mushroom", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Hongo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_HongoSprite.png");
        }
    }

    @Override
    public boolean accion(Tile m1[][], int yDir, int xDir) 
    {
        if(!m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].isIsRigid() && !"s".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()) && !"aR".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()))
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
