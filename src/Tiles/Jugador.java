package Tiles;

import Items.*;

public class Jugador extends Tile
{
    String[] imagenes = {"/imagenes/SurvivalJugadorUPSprite.png",           //0
                         "/imagenes/SurvivalJugadorDOWNSprite.png",         //1
                         "/imagenes/SurvivalJugadorRIGHTSprite.png",        //2
                         "/imagenes/SurvivalJugadorLEFTSprite.png",         //3
                         "/imagenes/SurvivalJugadorUP_FlorSprite.png",      //4 
                         "/imagenes/SurvivalJugadorDOWN_FlorSprite.png",    //5
                         "/imagenes/SurvivalJugadorRIGHT_FlorSprite.png",   //6
                         "/imagenes/SurvivalJugadorLEFT_FlorSprite.png",    //7
                         "/imagenes/SurvivalJugadorUP_ArenaSprite.png",     //8
                         "/imagenes/SurvivalJugadorDOWN_ArenaSprite.png",   //9 
                         "/imagenes/SurvivalJugadorRIGHT_ArenaSprite.png",  //10
                         "/imagenes/SurvivalJugadorLEFT_ArenaSprite.png",   //11
                         "/imagenes/SurvivalJugadorUP_ArcillaSprite.png",   //12
                         "/imagenes/SurvivalJugadorDOWN_ArcillaSprite.png",   //13 
                         "/imagenes/SurvivalJugadorRIGHT_ArcillaSprite.png",  //14
                         "/imagenes/SurvivalJugadorLEFT_ArcillaSprite.png"};  //15
    
    public Jugador(String id) 
    {
        super(id, true);
    }
    
    @Override
    public ReturnItem[] destruir(Item item)
    {
        return null;
    }

    @Override
    public int interactuarVentana() 
    {
        return 100;
    }
    
    @Override
    public String toString()
    {
        return id;
    }
    
    @Override
    public void update(Tile[][] m, int y, int x) 
    {
        
    }

    @Override
    public String getImagenes(int i) 
    {
        return imagenes[i];
    }
}
