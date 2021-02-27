package Tiles;

import Herramientas.*;
import Items.*;

public class Arbol extends Tile
{
    public Arbol()
    {
        super("a", "/imagenes/SurvivalArbolSprite.png", true, true, true, 8);
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
            return darItem(rI, 2);
        }
        else if(item instanceof HachaPiedra)
        {
            return darItem(rI, 3);
        }
        else if(item instanceof HachaHierro)
        {
            return darItem(rI, 5);
        }
        else
        {
            if(life != 1)
            {
                rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
                life--;
                return rI;
            }
            else
            {
                rI[0] = new ReturnItem(new Items.Madera(), 3, 1);
                
                if((int)(Math.random() * 100) + 1 <= 40)
                {
                    rI[1] = new ReturnItem(new Items.Planta(), (int) (Math.random() * 3) + 1, 1);
                }
                
                life--;
                return rI;
            }
        }
    }
    
    @Override
    public int interactuarVentana() 
    {
        return 100;
    }
    
    @Override
    public void update(Tile[][] m, int y, int x) 
    {
        
    }
    
    @Override
    public String toString()
    {
        return id;
    }
    
    @Override
    public String getImagenes(int i) 
    {
        return null;
    }
    
    public ReturnItem[] darItem(ReturnItem rI[], int life)
    {
        rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
        this.life -= life;

        if(this.life <= 1)
        {
            rI[0] = new ReturnItem(new Items.Madera(), 3, 1);

            if((int)(Math.random() * 100) + 1 <= 30)
            {
                rI[1] = new ReturnItem(new Items.Planta(), (int) (Math.random() * 3) + 1, 1);
            }

            this.life = 0;
            return rI;
        }

        return rI;
    }
}
