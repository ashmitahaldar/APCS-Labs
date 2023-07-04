//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
    private int[] array;
    
    public ArrayStats(String list)
    {
        //put stuff in the array 
        
        list = list.replaceAll(" ", "");
        array = new int[list.length()];
        
        Scanner kb = new Scanner(list);
        for (int i = 0; i < list.length(); i++)
        {
            String num = list.substring(i, i+1);
            array[i] = Integer.parseInt(num);
        }
    }    
    
    public void setArray(String list)
    {
        //put stuff in the array  
        //list = list.replaceAll(" ", "");
        array = new int[list.length()];
        
        Scanner kb = new Scanner(list);
        for (int i = 0; i < list.length(); i++)
        {
            // num = list.substring(i, i+1);
            if (kb.hasNextInt()) array[i] = kb.nextInt();
        }
    }    
            
    public int getSizeOfGroup(int num)
    {
        int count = 0;
        
        for (int number : array)
        {
            if (number == num)
            {
                count++;
            }
        }
        
        return count;
    }
    
    public int getNumGroupsOfSize(int size)
    {
        int count = 0;
        int currentGroup = array[0];
            if(getSizeOfGroup(array[currentGroup])>=size)
        { //check the size of the first group
            count++;
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] !=currentGroup) { //checks if the current number is equal to the current group value
                if(getSizeOfGroup(array[i])>=size)
                {
                    count++;
                }
                currentGroup=array[i]; // restart the currentGroup to be the current valume of the array
            }
        } //end of for loop
        return count;
    }
    
    public String toString()
    {
        return "return the array as a string";
    }
}