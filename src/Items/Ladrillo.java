package Items;

import Barras.*;
import Tiles.*;

public class Ladrillo extends Item
{
    public Ladrillo()
    {
        super(38, "/imagenes/SurvivalItem_LadrilloSprite.png", "Brick", false, true, 0);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Ladrillo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_LadrilloSprite.png");
        }
    }

    @Override
    public boolean accion(Tile[][] m1, int yDir, int xDir)
    {
        return false;
    }    
    
    @Override
    public boolean accionComida(BarraComida[] arrayBC) 
    {
        return false;
    }
}
