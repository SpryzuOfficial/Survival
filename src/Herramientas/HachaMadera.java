package Herramientas;

public class HachaMadera extends Herramienta
{
    public HachaMadera() 
    {
        super(9, "/imagenes/SurvivalHerramienta_HachaMaderaSprite.png", "Wooden axe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaMadera_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaMaderaSprite.png");
        }
    }
}
