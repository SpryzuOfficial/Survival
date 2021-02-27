package Barras;

public class ReturnFoodLevel 
{
    int l;
    BarraComida arrayBC[];
    
    public ReturnFoodLevel(int l, BarraComida arrayBC[])
    {
        this.l = l;
        this.arrayBC = arrayBC;
    }
    
    public void incrementarFoodLevel()
    {
        for(int i = 8; i >= 0; i--)
        {
            if(!arrayBC[i].isIsFull())
            {
                arrayBC[i].setIsFull(true);
                l--;
            }
            
            if(l == 0)
            {
                break;
            }
        }
    }
}
