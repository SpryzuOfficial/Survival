package Tiles;

import Herramientas.*;
import Items.*;
import Main.GItems;

public class Cofre extends Tile
{
    GItems gItem = new GItems();
    
    public Cofre() 
    {
        super("CF", "/imagenes/SurvivalCofreSprite.png", true, true, true, 6);
        mI = new Item[4][9];
        mCI = new int[4][9];
        
        gItem.llenarMatrizItems(mI);
    }

    @Override
    public ReturnItem[] destruir(Item item)
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }

        if(item instanceof HachaMadera)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 2;

            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Cofre(), 1, 1);
                rI[0].getId().setmI(mI);
                rI[0].getId().setmCI(mCI);
                life = 0;
                return rI;
            }

            return rI;
        }
        else if(item instanceof HachaPiedra)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 3;

            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Cofre(), 1, 1);
                rI[0].getId().setmI(mI);
                rI[0].getId().setmCI(mCI);
                life = 0;
                return rI;
            }

            return rI;
        }
        else if(item instanceof HachaHierro)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 5;

            if(life <= 1)
            {
                rI[0] = new ReturnItem(new Items.Cofre(), 1, 1);
                rI[0].getId().setmI(mI);
                rI[0].getId().setmCI(mCI);
                life = 0;
                return rI;
            }

            return rI;
        }
        else
        {
            if(life != 1)
            {
                rI[0] = new ReturnItem(new Items.Empty(), 1, 1);
                life--;
                return rI;
            }
            else
            {
                rI[0] = new ReturnItem(new Items.Cofre(), 1, 1);
                rI[0].getId().setmI(mI);
                rI[0].getId().setmCI(mCI);
                life = 0;
                return rI;
            }
        }
    }

    @Override
    public int interactuarVentana()
    {
        return 3;
    }

    @Override
    public void update(Tile[][] m, int y, int x)
    {
        
    }

    @Override
    public String getImagenes(int i) 
    {
        return null;
    }

    public Item[][] getmI() 
    {
        return mI;
    }

    public int[][] getmCI() 
    {
        return mCI;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
}
