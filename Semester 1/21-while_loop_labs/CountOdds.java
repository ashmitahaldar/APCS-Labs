//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CountOdds
{
   public static int go( int number )
    {
        int count = 0;
        int numcopy = number;        
        while (numcopy > 0){
            int digit = numcopy % 10;
            if (digit % 2 != 0) {
                count++;
            }
            numcopy /= 10;
        }
        return count;
    }
}