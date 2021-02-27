package Items;

import Barras.*;
import Tiles.*;

public class Bowl extends Item
{
    public Bowl() 
    {
        super(32, "/imagenes/SurvivalItem_BowlSprite.png", "Bowl", false, false, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Bowl_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_BowlSprite.png");
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
        return false;
    }
}
