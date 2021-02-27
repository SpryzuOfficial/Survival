package Comidas;

import Barras.*;

public class PieFruta extends Comida
{
    public PieFruta() 
    {
        super(29, "/imagenes/SurvivalItem_PieFrutaSprite.png", "Fruit pie", 4);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_PieFruta_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_PieFrutaSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
