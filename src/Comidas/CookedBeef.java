package Comidas;

import Barras.*;

public class CookedBeef extends Comida
{
    
    public CookedBeef() 
    {
        super(15, "/imagenes/SurvivalItem_Beef_CookedSprite.png", "Cooked beef", 4);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Beef_Cooked_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_Beef_CookedSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
