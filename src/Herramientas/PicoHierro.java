package Herramientas;

public class PicoHierro extends Herramienta
{
    public PicoHierro()
    {
        super(20, "/imagenes/SurvivalHerramienta_PicoHierroSprite.png", "Iron pickaxe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoHierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_PicoHierroSprite.png");
        }
    }
}
