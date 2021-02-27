package Items;

import Barras.*;
import Tiles.*;
import Ventanas.Ventana;

public class Cubeta extends Item
{
    public Cubeta() 
    {
        super(22, "/imagenes/SurvivalItem_CubetaSprite.png", "Bucket", false, false, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Cubeta_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CubetaSprite.png");
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
        if("w".equals(m1[Ventana.yMJ + yDir][Ventana.xMJ + xDir].getId()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
}
