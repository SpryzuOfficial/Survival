package Items;

public class ReturnItem 
{
    Item id;
    int c;
    int cItems;

    public ReturnItem(Item id, int c, int cItems)
    {
        this.id = id;
        this.c = c;
        this.cItems = cItems;
    }

    public Item getId()
    {
        return id;
    }

    public int getC() 
    {
        return c;
    }

    public int getcItems()
    {
        return cItems;
    }
    
    public void giveItem(Item a[][], int a2[][])
    {
        boolean isBreak = false;
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 9; j++) 
            {
                if(checkPositionItem(a, a2, i, j))
                {
                    isBreak = true;
                    break;
                }
            }
            
            if(isBreak)
            {
                break;
            }
        }
    }
    
    public boolean checkPositionItem(Item a[][], int a2[][], int y, int x)
    {
        boolean band = true;
             
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(a[i][j].getId() == id.getId() && a2[i][j] < 9)
                {
                    band = false;
                }
            }
        }
        
        if(a[y][x].getId() == 0 && !id.isIsAgrupable())
        {
            try 
            {
                a[y][x] = id.clone();
                a2[y][x] = cItems;
                return true;
            } 
            catch (CloneNotSupportedException ex) 
            { 
                return false; 
            }
        }
        else if(a[y][x].getId() == 0 && band)
        {
            a[y][x] = id;
            a2[y][x] = cItems;
            return true;
        }
        else if(a[y][x].getId() == id.getId() && a2[y][x] < 9 && a[y][x].isIsAgrupable())
        {
            a2[y][x] += cItems;
            return true;
        }
        else
        {
            return false;
        }
    }
}
