//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Factorial
{
    public static long getFactorial( int num )
    {
        long factorial=1;
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}