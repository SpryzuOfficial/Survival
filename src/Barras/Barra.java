package Barras;

import java.io.Serializable;

public abstract class Barra implements Serializable
{
    boolean isFull;
    String imagen;

    public Barra(boolean isFull, String imagen) 
    {
        this.isFull = isFull;
        this.imagen = imagen;
    }

    public boolean isIsFull() 
    {
        return isFull;
    }

    public String getImagen() 
    {
        return imagen;
    }

    public void setImagen(String imagen) 
    {
        this.imagen = imagen;
    }

    public abstract void setIsFull(boolean isFull);
}
