package Herramientas;

public class EspadaMadera extends Herramienta
{
    public EspadaMadera() 
    {
        super(7, "/imagenes/SurvivalHerramienta_EspadaMaderaSprite.png", "Wooden sword", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaMadera_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaMaderaSprite.png");
        }
    }
}
