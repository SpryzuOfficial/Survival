package Herramientas;

public class HachaHierro extends Herramienta
{
    public HachaHierro()
    {
        super(21, "/imagenes/SurvivalHerramienta_HachaHierroSprite.png", "Iron axe", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaHierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_HachaHierroSprite.png");
        }
    }
}
