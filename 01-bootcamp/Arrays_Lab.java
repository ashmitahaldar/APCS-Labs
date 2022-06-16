import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Lab
{
    public static void main(String[] args) 
    {
        int[] rayOne = {1,4,5,3,12,5,99,0,-1,12,45,67,32};

        //1.) write a loop to print out every third number in the array
        System.out.println("Every third number in the array:");
        for (int i = 0; i < rayOne.length; i += 3){
            System.out.print(rayOne[i] + " ");
        }

        //2.) write a loop to print out all of the numbers backwards
        System.out.println();
        System.out.println("Numbers in the array backwards:");
        for (int i = rayOne.length; i > 0; i--){
            System.out.print(rayOne[i-1] + " ");
        }
        
        //3.) write a loop to calculate the average of all the values in the array and print the result
        System.out.println();
        System.out.println("Average of the numbers in the array:");
        int sum = 0;
        for (int i = rayOne.length; i > 0; i--){
            sum += rayOne[i-1];
        }
        int average = sum / rayOne.length;
        System.out.println(average + " is the average of the numbers in this array.");
    }
}
