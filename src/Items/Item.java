package Items;

import Barras.*;
import Tiles.*;
import java.io.Serializable;

public abstract class Item implements Cloneable, Serializable
{
    public int id;
    public int combustibleLevel;
    public String imagen;
    public String itemName;
    public boolean isSelected;
    public boolean isCombustible;
    public boolean isAgrupable;
    public Item mI[][];
    public int mCI[][];

    public Item(int id, String imagen, String itemName, boolean isCombustible, boolean isAgrupable, int combustibleLevel) 
    {
        this.id = id;
        this.imagen = imagen;
        this.isSelected = false;
        this.itemName = itemName;
        this.isCombustible = isCombustible;
        this.isAgrupable = isAgrupable;
        this.combustibleLevel = combustibleLevel;
    }

    public int getId() 
    {
        return id;
    }

    public String getImagen() 
    {
        return imagen;
    }

    public String getItemName()
    {
        return itemName;
    }

    public boolean isIsCombustible() 
    {
        return isCombustible;
    }

    public int getCombustibleLevel() 
    {
        return combustibleLevel;
    }

    public void setCombustibleLevel(int combustibleLevel) 
    {
        this.combustibleLevel = combustibleLevel;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public boolean isIsSelected()
    {
        return isSelected;
    }

    public boolean isIsAgrupable()
    {
        return isAgrupable;
    }

    public Item[][] getmI()  
    {
        return mI;
    }

    public int[][] getmCI()
    {
        return mCI;
    }

    public void setIsAgrupable(boolean isAgrupable) 
    {
        this.isAgrupable = isAgrupable;
    }

    public void setmI(Item[][] mI) 
    {
        this.mI = mI;
    }

    public void setmCI(int[][] mCI) 
    {
        this.mCI = mCI;
    }
    
    public void setImagen(String imagen) 
    {
        this.imagen = imagen;
    }
    
    public Item clone() throws CloneNotSupportedException
    {
        return (Item) super.clone();
    }
    
    public abstract void setItemSelected(boolean itemSelected);
    
    public abstract boolean accionComida(BarraComida arrayBC[]);
    
    public abstract boolean accion(Tile m1[][], int yDir, int xDir);
}
