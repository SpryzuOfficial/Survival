package Herramientas;

public class PicoMadera extends Herramienta
{
    public PicoMadera() 
    {
        super(8, "/imagenes/SurvivalHerramienta_PicoMaderaSprite.png", "Wooden pickaxe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoMadera_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoMaderaSprite.png");
        }
    }
}
