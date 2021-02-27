package Main;

import Entidades.*;
import Tiles.*;

public class GMundo
{
    //Constructor por defecto
    public GMundo()
    {}
    
    //Metodo para crear arboles con un algoritmo
    public void GMundo(Tile m[][], int y, int x)
    {
        Noise n = new Noise();
        float scl = 0.08f;
        
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                double v = Math.abs(n.noise(i * scl, j * scl));
                
                if(i == 54 && j == 54)
                {
                    m[i][j] = new Jugador("J");
                }
                else
                {
                    if(GBordes(i, j))
                    {
                        m[i][j] = new RockEdge();
                    }
                    else
                    {
                        if(v < 0.01 && (int)(Math.random() * 100) + 1 <= 30)
                        {
                            m[i][j] = new Vaca('u');
                        }
                        else if(v < 0.06 && (int)(Math.random() * 100) + 1 <= 46)
                        {
                            if((int)(Math.random() * 100) + 1 <= 20)
                            {  
                                m[i][j] = new ArbolFruta();
                            }
                            else
                            {
                                m[i][j] = new Arbol();
                            }
                        }
                        else if(v < 0.08 && (int)(Math.random() * 100) + 1 <= 15)
                        {
                            if((int) (Math.random() * 10) + 1 <= 4)
                            {  
                                if((int)(Math.random() * 100) + 1 <= 30)
                                {  
                                    m[i][j] = new Hierro();
                                }
                                else
                                {
                                    m[i][j] = new Carbon();
                                }
                            }
                            else
                            {
                                m[i][j] = new Roca();
                            }
                        }
                        else if(v < 0.1 && (int)(Math.random() * 100) + 1 <= 20)
                        {
                            if((int)(Math.random() * 100) + 1 <= 40)
                            {
                                m[i][j] = new Trigo();
                            }
                            else if((int)(Math.random() * 100) + 1 <= 40)
                            {
                                m[i][j] = new Hongo();
                            }
                            else
                            {
                                m[i][j] = new Flor();
                            }
                        }
                        else if(v < 0.4)
                        {
                            m[i][j] = new Pasto();
                        }
                        else if(v < 0.5)
                        {
                            m[i][j] = new Arena();
                        }
                        else if(v < 0.8)
                        {
                            m[i][j] = new Agua();
                        }
                    }
                }
                
                
                /*
                if(i == 54 && j == 54)
                {
                    m[i][j] = new Jugador("J");
                }
                else
                {
                    if(GBordes(i, j))
                    {
                        m[i][j] = new RockEdge();
                    }
                    else if(GArboles(i, j))
                    {
                        if((int)(Math.random() * 10) <= 2)
                        {
                            m[i][j] = new ArbolFruta();
                        }
                        else
                        {
                            m[i][j] = new Arbol();
                        }
                    }
                    else if(GFlores(i, j, m[i][j]))
                    {
                        m[i][j] = new Flor();
                    }
                    else if(GVacas(i, j, m[i][j]))
                    {
                        m[i][j] = new Vaca('u');
                    }
                }
                */
            }
        }
    }

    
    private boolean GBordes(int y, int x)
    {
        if(y < 2)
        {
            return true;
        }
        else if(x < 3)
        {
            return true;
        }
        else if(x > 107)
        {
            return true;
        }
        else if(y > 108)
        {
            return true;
        }
        
        return false;
    }
    
    private boolean GArboles(int y, int x)
    {
        if(y >= 2 && x >= 3)
        {
            if(y % 2 == 0 && y % 4 != 0)
            {
                if(x % 3 == 0)
                {
                    if((int)(Math.random() * 10) <= 5)
                    {
                        return true;
                    }
                }
            }
            else if(y % 4 == 0)
            {
                if((x + 1) % 3 == 0)
                {
                    if((int)(Math.random() * 10) <= 5)
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean GFlores(int y, int x, Tile tile)
    {
        if(tile.getId() == "p")
        {
            if(y >= 2 && x >= 3)
            {
                if(y % 2 != 0)
                {
                    if((int)(Math.random() * 10) == 1)
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean GVacas(int y, int x, Tile tile)
    {
        if(tile.getId() == "p")
        {
            if(y >= 2 && x >= 3)
            {
                if(y % 2 == 0 && y % 4 != 0)
                {
                    if((x + 1) % 3 == 0)
                    {
                        if((int)(Math.random() * 10) <= 2)
                        {
                            return true;
                        }
                    }
                }
                else if(y % 4 == 0)
                {
                    if(x % 3 == 0)
                    {
                        if((int)(Math.random() * 10) <= 2)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        
        return false;
    }
}
