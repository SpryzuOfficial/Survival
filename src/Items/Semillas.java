package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class Semillas extends Item
{
    public Semillas()
    {
        super(36, "/imagenes/SurvivalItem_SemillasSprite.png", "Seeds", false, true, 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Semillas_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_SemillasSprite.png");
        }
    }

    @Override
    public boolean accion(Tile[][] m1, int yDir, int xDir)
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
