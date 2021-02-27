package Entidades;

import Comidas.*;
import Herramientas.*;
import Items.*;
import Tiles.*;

public abstract class Animal extends Tile
{
    boolean isPasive;
    Comida comidaR;
    
    public Animal(String id, boolean isRigid, boolean isInteractive, boolean isEntity, int life, boolean isPasive, char dirChar, Comida comidaR) 
    {
        super(id, isRigid, isInteractive, isEntity, life, dirChar);
        this.isPasive = isPasive;
        this.comidaR = comidaR;
    }

    @Override
    public ReturnItem[] destruir(Item item)
    {
        ReturnItem rI[] = new ReturnItem[9];

        for(int i = 0; i < 9; i++)
        {
            rI[i] = new ReturnItem(new Empty(), 0, 0);
        }

        if(item instanceof EspadaMadera)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 3;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else if(item instanceof HachaMadera)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 2;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else if(item instanceof EspadaPiedra)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 5;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else if(item instanceof HachaPiedra)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 3;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else if(item instanceof EspadaHierro)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 7;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else if(item instanceof HachaHierro)
        {
            rI[0] = new ReturnItem(new Items.Empty(), 0, 0);
            life -= 5;
            
            if(life <= 1)
            {
                try 
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life = 0;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
            
            return rI;
        }
        else
        {
            if(life != 1)
            {
                rI[0] = new ReturnItem(new Empty(), 0, 0);
                life--;
                return rI;
            }
            else
            {
                try
                {
                    rI[0] = new ReturnItem(comidaR.clone(), 2, 1);
                    life--;
                    return rI;
                } 
                catch (CloneNotSupportedException ex) 
                {
                    rI[0] = new ReturnItem(new Empty(), 0, 0);
                    life--;
                    return rI;
                }
            }
        }
    }

    @Override
    public int interactuarVentana() 
    {
        return 100;
    }

    public abstract void update(Tile[][] m, int y, int x); 
    
    @Override
    public String getImagenes(int i) 
    {
        return null;
    }
}
