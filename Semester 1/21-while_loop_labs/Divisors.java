//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Divisors
{
    public static String getDivisors( int number )
    {
        String divisors="";
        int currentDivisor = 1;
        while (currentDivisor < number)
        {
            if (number % currentDivisor == 0)
            {
                divisors += currentDivisor + " ";
            }
            currentDivisor++;
        }
        String answerStr = number + " has divisors " + divisors;
        return answerStr; 
    }
}