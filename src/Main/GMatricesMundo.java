package Main;

import Tiles.*;

public class GMatricesMundo 
{
    //Constructor por defecto
    public GMatricesMundo()
    {}
    
    //Metodo para copiar una matriz en otra
    public void copiarMatriz(Tile[][] m1, Tile[][] m2, int y, int x, int e1, int e2)
    {
        int aux2 = e2;
        
        for(int i = 0; i < y; i++)
        {
            for (int j = 0; j < x; j++) 
            {
                m1[i][j]= m2[e1][e2];
                e2++;
            }
            e2 = aux2;
            e1++;
        }
    }
    
    public void copiarMatrizSinEntidades(Tile[][] m1, Tile[][] m2, int y, int x)
    {
        for(int i = 0; i < y; i++)
        {
            for (int j = 0; j < x; j++) 
            {
                if(m2[i][j].getId() != "J" && m2[i][j].getId() != "JF" && m2[i][j].getId() != "JS" && !m2[i][j].isIsBloque())
                {
                    m1[i][j] = m2[i][j];
                }
            }
        }
    }
    
    //Metodo para imprimir una matriz
    public void imprimirMatriz(Tile[][] m, int y, int x)
    {
        System.out.println("");
        
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                System.out.print(m[i][j].getId());
            }
            System.out.println("");
        }
    }
    
    //Metodo para llenar una matriz de objetos de tipo Pasto
    public void llenarMatriz(Tile m[][], int y, int x)
    {
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                m[i][j] = new Pasto();
            }
        }
    }
}
