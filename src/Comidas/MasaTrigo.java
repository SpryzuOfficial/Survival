package Comidas;

import Barras.*;

public class MasaTrigo extends Comida
{
    public MasaTrigo() 
    {
        super(25, "/imagenes/SurvivalItem_MasaTrigoSprite.png", "Wheat dough", 1);
    }

    @Override
    public void setItemSelected(boolean itemSelected) 
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalItem_MasaTrigo_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalItem_MasaTrigoSprite.png");
        }
    }

    @Override
    public boolean accionComida(BarraComida[] arrayBC)
    {
        return super.accionComida(arrayBC);
    }
}
