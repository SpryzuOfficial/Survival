package Main;

import Barras.*;
import Items.*;
import Tiles.*;
import java.io.Serializable;

public class Mundo implements Serializable
{
    String name;
    Tile[][] mM;
    Item[][] mI;
    int[][] mC;
    int y;
    int x;
    BarraVida aBV[];
    BarraComida aBC[];
    
    public Mundo(String name, Tile[][] mM, Item[][]mI, int[][] mC, int y, int x, BarraVida aBV[], BarraComida aBC[])
    {
        this.name = name;
        this.mM = mM;
        this.mI = mI;
        this.mC = mC;
        this.y = y;
        this.x = x;
        this.aBV = aBV;
        this.aBC = aBC;
    }

    public String getName()
    {
        return name;
    }

    public Tile[][] getmM() 
    {
        return mM;
    }

    public Item[][] getmI()
    {
        return mI;
    }

    public int getY() 
    {
        return y;
    }

    public int getX() 
    {
        return x;
    }

    public int[][] getmC() 
    {
        return mC;
    }

    public BarraVida[] getaBV() 
    {
        return aBV;
    }

    public BarraComida[] getaBC()
    {
        return aBC;
    }

    public void setaBV(BarraVida[] aBV) 
    {
        this.aBV = aBV;
    }

    public void setaBC(BarraComida[] aBC) 
    {
        this.aBC = aBC;
    }
    
    public void setmC(int[][] mC) 
    {
        this.mC = mC;
    }
    
    public void setY(int y) 
    {
        this.y = y;
    }

    public void setX(int x) 
    {
        this.x = x;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setmM(Tile[][] mM) 
    {
        this.mM = mM;
    }

    public void setmI(Item[][] mI) 
    {
        this.mI = mI;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
}
