package Comidas;

import Barras.*;

public class Pan extends Comida
{
    public Pan() 
    {
        super(26, "/imagenes/SurvivalItem_PanSprite.png", "Bread", 3);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Pan_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_PanSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
