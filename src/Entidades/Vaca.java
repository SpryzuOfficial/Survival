package Entidades;

import Comidas.RawBeef;
import Items.*;
import Tiles.*;

public class Vaca extends Animal
{
    String[] imagenes = {"/imagenes/SurvivalVacaUPSprite.png",
                         "/imagenes/SurvivalVacaDOWNSprite.png",
                         "/imagenes/SurvivalVacaRIGHTSprite.png",
                         "/imagenes/SurvivalVacaLEFTSprite.png"};
    
    public Vaca(char dir) 
    {
        super("v", true, true, true, 10, true, dir, new RawBeef());
    }
    
    @Override
    public ReturnItem[] destruir(Item item)
    {
        return super.destruir(item);
    }
    
    @Override
    public void update(Tile[][] m, int y, int x)
    {
        int dir = (int) (Math.random() * 4) + 1;

        switch(dir)
        {
            case 1:
                if("f".equals(m[y - 1][x].getId()) || "s".equals(m[y - 1][x].getId()) || "aR".equals(m[y + 1][x].getId()) || m[y - 1][x].isIsRigid())
                {
                    break;
                }
                else
                {
                    m[y - 1][x] = new Vaca('u');
                    m[y][x] = new Pasto();
                    this.setDirChar('u');
                    break;
                }

            case 2:
                if("f".equals(m[y][x + 1].getId()) || "s".equals(m[y][x + 1].getId()) || "aR".equals(m[y + 1][x].getId()) || m[y][x + 1].isIsRigid())
                {
                    break;
                }
                else
                {
                    m[y][x + 1] = new Vaca('r');
                    m[y][x] = new Pasto();
                    this.setDirChar('r');
                    break;
                } 

            case 3:
                if("f".equals(m[y + 1][x].getId()) || "s".equals(m[y + 1][x].getId()) || "aR".equals(m[y + 1][x].getId()) || m[y + 1][x].isIsRigid())
                {
                    break;
                }
                else
                {
                    m[y + 1][x] = new Vaca('d');
                    m[y][x] = new Pasto();
                    this.setDirChar('d');
                    break;
                }    

            case 4:
                if("f".equals(m[y][x - 1].getId()) || "s".equals(m[y][x - 1].getId()) || "aR".equals(m[y + 1][x].getId()) || m[y][x - 1].isIsRigid())
                {
                    break;
                }
                else
                {
                    m[y][x - 1] = new Vaca('l');
                    m[y][x] = new Pasto();
                    this.setDirChar('l');
                    break;
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
        return imagenes[i];
    }
}
