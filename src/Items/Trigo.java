package Items;

import Barras.*;
import Tiles.*;

public class Trigo extends Item
{
    public Trigo() 
    {
        super(24, "/imagenes/SurvivalItem_TrigoSprite.png", "Wheat", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Trigo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_TrigoSprite.png");
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
