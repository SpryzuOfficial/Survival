package Comidas;

import Barras.*;

public class SopaHongo extends Comida
{
    public SopaHongo() 
    {
        super(33, "/imagenes/SurvivalItem_SopaHongoSprite.png", "Mushroom soup", 3);
        this.setIsAgrupable(false);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_SopaHongo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_SopaHongoSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
