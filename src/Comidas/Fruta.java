package Comidas;

import Barras.*;

public class Fruta extends Comida
{
    public Fruta() 
    {
        super(2, "/imagenes/SurvivalItem_FrutaSprite.png", "Fruit", 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_Fruta_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_FrutaSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
