package Items;

import Barras.BarraComida;
import Tiles.Tile;
import Ventanas.*;

public class Planta extends Item
{
    public Planta()
    {
        super(35, "/imagenes/SurvivalItem_PlantaSprite.png", "Plant", true, true, 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Planta_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_PlantaSprite.png");
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
