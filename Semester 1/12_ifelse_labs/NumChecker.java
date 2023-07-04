//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class NumChecker
{
    public static int check( int x )
    {
        int value = 0;
        
        if (x%5 == 0)
        {
            value = 1;
        } else if (x%4 == 0)
        {
            value = 2;
        } else if (x%3 == 0)
        {
            value = 3;
        } else 
        {
            value = 4;
        }
        
        return value;
    }
}