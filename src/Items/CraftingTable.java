package Items;

import Barras.*;
import Tiles.*;
import Ventanas.*;

public class CraftingTable extends Item
{
    public CraftingTable() 
    {
        super(6, "/imagenes/SurvivalItem_CraftingTableSprite.png", "Crafting table", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_CraftingTable_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CraftingTableSprite.png");
        }
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

    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }
}
