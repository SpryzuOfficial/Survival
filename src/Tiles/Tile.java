package Tiles;

import Items.*;
import java.io.Serializable;

public abstract class Tile implements Serializable
{
    public String id;
    public String imagen;
    public boolean isRigid;
    public boolean isInteractive;
    public boolean isBloque;
    public boolean isEntity;
    public int life;
    public int steps;
    public char dirChar;
    public Item[][] mI;
    public int[][] mCI;
    
    //Constructor para el jugador
    public Tile(String id, boolean isRigid) 
    {
        this.id = id;
        this.isRigid = isRigid;
        this.isInteractive = false;
        this.isEntity = false;
        this.isBloque = true;
        this.life = 0;
        this.dirChar = 'u';
    }
    
    //Constructor para entidades
    public Tile(String id, boolean isRigid, boolean isInteractive, boolean isEntity, int life, char dirChar)
    {
        this.id = id;
        this.imagen = null;
        this.isRigid = isRigid;
        this.isInteractive = isInteractive;
        this.isEntity = isEntity;
        this.isBloque = false;
        this.life = life;
        this.dirChar = dirChar;
    }

    //Constructor para tiles sin interaccion
    public Tile(String id, String imagen, boolean isRigid) 
    {
        this.id = id;
        this.imagen = imagen;
        this.isRigid = isRigid;
        this.isInteractive = false;
        this.isEntity = false;
        this.isBloque = false;
        this.life = 0;
        this.dirChar = 'u';
    }

    //Constructor para tiles con interaccion
    public Tile(String id, String imagen, boolean isRigid, boolean isInteractive, boolean isBloque, int life)
    {
        this.id = id;
        this.imagen = imagen;
        this.isRigid = isRigid;
        this.isInteractive = isInteractive;
        this.isBloque = isBloque;
        this.life = life;
        this.isEntity = false;
        this.dirChar = 'u';
    }
    
    public boolean isPasto()
    {
        if(id != "p")
        {
            return false;
        }
        
        return true;
    }
    
    public String getId() 
    {
        return id;
    }

    public boolean isIsRigid() 
    {
        return isRigid;
    }

    public boolean isIsInteractive() 
    {
        return isInteractive;
    }

    public int getLife() 
    {
        return life;
    }

    public char getDirChar() 
    {
        return dirChar;
    }

    public Item[][] getmI() 
    {
        return mI;
    }

    public int[][] getmCI() 
    {
        return mCI;
    }
    
    public boolean isIsEntity() 
    {
        return isEntity;
    }

    public boolean isIsBloque() 
    {
        return isBloque;
    }

    public String getImagen() 
    {
        return imagen;
    }

    public int getSteps() 
    {
        return steps;
    }

    public void setSteps(int steps) 
    {
        this.steps = steps;
    }
    
    public void setmI(Item[][] mI) 
    {
        this.mI = mI;
    }

    public void setmCI(int[][] mCI) 
    {
        this.mCI = mCI;
    }
        
    public void setId(String id)
    {
        this.id = id;
    }

    public void setDirChar(char dirChar) 
    {
        this.dirChar = dirChar;
    }
    
    public abstract ReturnItem[] destruir(Item item);
    
    public abstract int interactuarVentana();
    
    public abstract void update(Tile m[][], int y, int x);
    
    public abstract String getImagenes(int i);
}
