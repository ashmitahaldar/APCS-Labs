//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Fibonacci
{
    //instance variable
    int[] fibo;
    
    //constructors
    public Fibonacci(int size)
    {
        fibo = new int[size];
    }
    
    //set method
    public void set()
    {
        fibo[0] = 1;
        if (fibo.length > 1) fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    
    //get method
    public int get(int index)
    {
        int value;
        if (index > fibo.length || index == 0)
        {
            value = -1;
        } else 
        {
        value = fibo[index-1];
        }
        return value;
    }
    
    //toString
}