package Herramientas;

public class HachaPiedra extends Herramienta
{
    public HachaPiedra() 
    {
        super(13, "/imagenes/SurvivalHerramienta_HachaPiedraSprite.png", "Stone axe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaPiedra_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaPiedraSprite.png");
        }
    }
}
