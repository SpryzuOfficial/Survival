package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class Roca extends Item
{

    public Roca() 
    {
        super(10, "/imagenes/SurvivalItem_RocaSprite.png", "Stone", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Roca_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_RocaSprite.png");
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
        if(!m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].isIsRigid())
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
}
