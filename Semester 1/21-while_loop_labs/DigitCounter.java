//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class DigitCounter
{
   public static int go( int number )
    {
        int count = 0;
        int numcopy = number;        
        while (numcopy > 0){
            numcopy /= 10;
            count++;
        }
        return count;
    }
}