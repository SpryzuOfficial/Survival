package Tiles;

import Items.Empty;
import Items.Item;
import Items.ReturnItem;

public class Semillas extends Tile
{
    int stepsLife;
    
    public Semillas()
    {
        super("sM", "/imagenes/SurvivalSemillasSprite.png", true, true, true, 1);
        this.setSteps((int) (Math.random() * 100) + 1);
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
            rI[0] = new ReturnItem(new Items.Semillas(), 1, 1);
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
            m[y][x] = new Trigo();
        }
        else
        {
            if(m[y - 1][x].getId() == "w" || m[y + 1][x].getId() == "w" || m[y][x - 1].getId() == "w" || m[y][x + 1].getId() == "w")
            {
                this.stepsLife++;
            }
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
