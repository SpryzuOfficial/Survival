package Barras;

public class BarraComida extends Barra
{
    public BarraComida(boolean isFull) 
    {
        super(isFull, "/imagenes/SurvivalFood_UISprite.png");
    }

    @Override
    public void setIsFull(boolean isFull) 
    {
        this.isFull = isFull;
        
        if(isFull)
        {
            this.setImagen("/imagenes/SurvivalFood_UISprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalFood_BLACK_UISprite.png");
        }
    }
}
