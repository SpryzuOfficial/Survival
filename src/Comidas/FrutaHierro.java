package Comidas;

import Barras.*;

public class FrutaHierro extends Comida
{
    public FrutaHierro() 
    {
        super(34, "/imagenes/SurvivalItem_FrutaHierroSprite.png", "Iron Fruit", 9);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_FrutaHierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_FrutaHierroSprite.png");
        }
    }
    
    @Override
    public boolean accionComida(BarraComida arrayBC[]) 
    {
        return super.accionComida(arrayBC);
    }
}
