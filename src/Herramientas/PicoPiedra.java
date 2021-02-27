package Herramientas;


public class PicoPiedra extends Herramienta
{
    public PicoPiedra() 
    {
        super(12, "/imagenes/SurvivalHerramienta_PicoPiedraSprite.png", "Stone pickaxe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoPiedra_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoPiedraSprite.png");
        }
    }
}
