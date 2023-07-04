//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class ReverseNumber
{
    public static int getReverse( int number )
    {
        int rev=0; 
        int numcopy = number;
        
        while (numcopy > 0)
        {
            int digit = numcopy % 10;
            rev = (rev * 10) + digit;
            numcopy /= 10;
        }
        
        return rev;
    }    
}