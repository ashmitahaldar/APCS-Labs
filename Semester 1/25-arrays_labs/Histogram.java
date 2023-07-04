//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner; 

public class Histogram
{
    private int[] numCount;
    private int maxNum = 0;
    private int maxNumTally = 0;

    public Histogram(String line, int size )
    {
        numCount = new int[size];
        for (int i = 0; i < size; i++) // "i" will be the number I'll be checking for in the list
        {
            int number = 0;
            int numberTally = 0;
            Scanner s = new Scanner(line);
            
            while (s.hasNextInt())
            {
                number = s.nextInt();
                if (number == i)
                {
                    numberTally++;
                }
            }
            
            if (numberTally > maxNumTally)
            {
                 maxNumTally = numberTally;
                 maxNum = i; //since i was the number I was checking for
            }
            
            numCount[i] = numberTally;
        }
    }
    
    public int getMax()
    {
        return maxNum;
    }

    public String toString()
    {
        String output="";
        for (int i = 0; i < numCount.length; i++)
        {
            output += i + " - " + numCount[i] + " | ";
        }
        return output;
    }
}