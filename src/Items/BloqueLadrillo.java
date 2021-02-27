package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class BloqueLadrillo extends Item
{
    public BloqueLadrillo() 
    {
        super(39, "/imagenes/SurvivalItem_BloqueLadrilloSprite.png", "Brick block", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_BloqueLadrillo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_BloqueLadrilloSprite.png");
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
