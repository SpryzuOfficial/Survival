package Items;

import Barras.*;
import Main.*;
import Tiles.*;
import Ventanas.*;

public class Cofre extends Item
{
    GItems gItem = new GItems();
    
    public Cofre() 
    {
        super(30, "/imagenes/SurvivalItem_CofreSprite.png", "Chest", false, false, 0);
        mI = new Item[4][9];
        mCI = new int[4][9];
        
        gItem.llenarMatrizItems(mI);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Cofre_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_CofreSprite.png");
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
