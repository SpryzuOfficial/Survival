package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class CubetaAgua extends Item
{
    public CubetaAgua() 
    {
        super(23, "/imagenes/SurvivalItem_CubetaAguaSprite.png", "Water bucket", false, false, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_CubetaAgua_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CubetaAguaSprite.png");
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
