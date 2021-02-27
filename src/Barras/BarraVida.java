package Barras;

public class BarraVida extends Barra
{    
    public BarraVida(boolean isFull)
    {
        super(isFull, "/imagenes/SurvivalHeart_UISprite.png");
    }
    
    @Override
    public void setIsFull(boolean isFull) 
    {
        this.isFull = isFull;
        
        if(isFull)
        {
            this.setImagen("/imagenes/SurvivalHeart_UISprite.png");
        }
        else
        {
            this.setImagen("/imagenes/SurvivalHeart_BLACK_UISprite.png");
        }
    }
}
