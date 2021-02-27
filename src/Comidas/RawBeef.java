package Comidas;

import Barras.*;

public class RawBeef extends Comida
{
    public RawBeef() 
    {
        super(3, "/imagenes/SurvivalItem_Beef_RawSprite.png", "Raw beef", 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Beef_Raw_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_Beef_RawSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
