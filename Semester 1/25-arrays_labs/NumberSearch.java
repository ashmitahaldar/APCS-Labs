//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
public class NumberSearch
{
    public static int getNextLargest(int[] numArray, int searchNum)
    {
        int answer = 0;
        
        int[] newArray = numArray;
        Arrays.sort(newArray);
        
        for (int i = 0; i < newArray.length; i++)
        {
            if (searchNum < newArray[i])
            {
                answer = numArray[i];
                break;
            }
        }
        return answer;
    }
}