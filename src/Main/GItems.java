package Main;

import Items.*;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GItems implements Serializable
{
    //Constructor por defecto
    public GItems()
    {}
    
    public void renderizarSeleccionItems(Item a1[][], int sI)
    {
        for(int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                if(j == sI)
                {
                    a1[i][j].setItemSelected(true);
                }
                else
                {
                    a1[i][j].setItemSelected(false);
                }
            }
        }
    }
    
    public void llenarMatrizItems(Item a1[][])
    {
        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                a1[i][j] = new Empty();
            }
        }
    }
    
    public void isItemEmpty(Item a1[][], int a2[][])
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(a2[i][j] == 0)
                {
                    a1[i][j] = new Empty();
                }
            }
        }
    }
    
    public void renderizarItems(JLabel a1[], Item a2[][])
    {
        for(int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                a1[j].setIcon(new ImageIcon(getClass().getResource(a2[i][j].getImagen())));
            }
        }
    }
    
    public void renderizarContadorItems(JLabel a1[], int a2[][])
    {
        for(int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                switch(a2[i][j])
                {
                    case 1:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_1Sprite.png")));
                        break;

                    case 2:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_2Sprite.png")));
                        break;    

                    case 3:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_3Sprite.png")));
                        break;   

                    case 4:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_4Sprite.png")));
                        break;

                    case 5:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_5Sprite.png")));
                        break;    

                    case 6:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_6Sprite.png")));
                        break;   

                    case 7:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_7Sprite.png")));
                        break;   

                    case 8:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_8Sprite.png")));
                        break;

                    case 9:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_9Sprite.png")));
                        break;    

                    case 0:
                        a1[j].setIcon(new ImageIcon(getClass().getResource("/imagenes/SurvivalItemNumber_0Sprite.png")));
                        break;    
                }
            }
        }
    }
}
