//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Prime
{
    public static String isPrime( int num )
    {
        for (int i = 2; i < Math.sqrt(num); i++)
        {
            if (num % i == 0){
                return "not"; //result is false.
            }
        }
        return ""; //if program has made it till her, result is true.
    }
}