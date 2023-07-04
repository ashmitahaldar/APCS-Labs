
/**
 * Write a description of class Extra_Sorting_Lab here.
 * 
 * @author Ashmita Haldar 
 * @version 2021.08.12
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Extra_Sorting_Lab
{

    public static void main(String[] args) 
    {
        int[] array = {14,7,1,25,6,10,11,4,3,0,11};
        System.out.println ("Unsorted array");
        System.out.println ( Arrays.toString( array ) );        
        // Sort (in ascending order) the elements in the array  using loops.
        // If you are solving this problem is because you 
        // completed the bootcamp labs.
        // Please do not take shortcuts ... 
        //   Do not look at the web. 
        //   Do not copy code from a classmate
        //   Do not use Arrays.sort
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        ArrayList<Integer> copyArray = new ArrayList<Integer>();
        for (int item : array){
            copyArray.add(item);
        }
        
        while (newArray.size() != array.length){
            int lowestInt = 100;
            int index = 0;
            for (int item : copyArray){
                if (lowestInt > item){
                    lowestInt = item;
                }
            }
            newArray.add(lowestInt);
            index = copyArray.indexOf(lowestInt);
            copyArray.remove(index);
        }
        
        System.out.println();
        System.out.println("Sorted array");
        //print out the (resulting) sorted array
        System.out.println( Arrays.toString( newArray.toArray() ));                
    }

}
