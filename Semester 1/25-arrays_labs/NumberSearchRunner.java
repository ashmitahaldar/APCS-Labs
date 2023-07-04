//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberSearchRunner
{
    public static void main( String args[] )
    {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
            int find = 5;
            System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

            //add more case
            int[] array2 = {10, 30, 20, 40, 50, 15};
            find = 12;
            System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array2, find) + "\n"); 
            
            int[] array3 = {3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65};
            find = 25;
            System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array3, find) + "\n");
            
            int[] array4 = {100, 110, 1000, 25000, 65535};
            find = 32767;
            System.out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array4, find) + "\n");
    }
}



