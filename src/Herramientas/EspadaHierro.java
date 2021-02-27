package Herramientas;

public class EspadaHierro extends Herramienta
{
    public EspadaHierro()
    {
        super(19, "/imagenes/SurvivalHerramienta_EspadaHierroSprite.png", "Iron sword", false, 0);
    }
    
    @Override
    public void setItemSelected(boolean itemSelected)
    {
        this.isSelected = itemSelected;
        
        if(itemSelected)
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaHierro_SelectedSprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHerramienta_EspadaHierroSprite.png");
        }
    }
}
