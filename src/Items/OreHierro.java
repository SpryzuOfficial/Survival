package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class OreHierro extends Item
{
    public OreHierro() 
    {
        super(17, "/imagenes/SurvivalItem_OreHierroSprite.png", "Iron ore", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_OreHierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_OreHierroSprite.png");
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
