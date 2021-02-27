package Tiles;

import Items.*;

public class Planta extends Tile
{
    int stepsLife;
    
    public Planta()
    {
        super("pA", "/imagenes/SurvivalPlantaSprite.png", true, true, true, 1);
        this.setSteps((int) (Math.random() * 150) + 1);
        stepsLife = 0;
    }
    
    @Override
    public ReturnItem[] destruir(Item item) 
    {
        ReturnItem rI[] = new ReturnItem[9];
          
        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }

        if(life != 0)
        {
            rI[0] = new ReturnItem(new Items.Planta(), 1, 1);
            life--;
            return rI;
        }
        
        return null;
    }
    
    @Override
    public int interactuarVentana() 
    {
        return 100;
    }
    
    @Override
    public void update(Tile[][] m, int y, int x) 
    {
        if(this.stepsLife == this.getSteps())
        {
            if((int) (Math.random() * 100) + 1 <= 30)
            {
                m[y][x] = new ArbolFruta();
            }
            else
            {
                m[y][x] = new Arbol();
            }
        }
        else
        {
            this.stepsLife++;
        }
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
}
