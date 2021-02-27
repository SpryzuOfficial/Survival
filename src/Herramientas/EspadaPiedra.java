package Herramientas;

public class EspadaPiedra extends Herramienta
{
    public EspadaPiedra() 
    {
        super(11, "/imagenes/SurvivalHerramienta_EspadaPiedraSprite.png", "Stone sword", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaPiedra_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaPiedraSprite.png");
        }
    }
}
