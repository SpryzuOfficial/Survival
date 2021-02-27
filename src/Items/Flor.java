package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class Flor extends Item
{
    public Flor() 
    {
        super(4, "/imagenes/SurvivalItem_FlorSprite.png", "Flowers", true, true, 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Flor_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_FlorSprite.png");
        }
    }

    @Override
    public boolean accion(Tile m1[][], int yDir, int xDir) 
    {
        if(!m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].isIsRigid() && !"s".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()) && !"f".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()) && !"aR".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()))
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
