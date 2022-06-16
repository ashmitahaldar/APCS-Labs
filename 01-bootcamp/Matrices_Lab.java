import java.util.Scanner;
import java.util.Arrays;

public class Matrices_Lab
{
    public static int avgMat( int[][] matty )
    {
        int sum = 0; // the running sum
        int avg = 0; // avg to return
        int numItems = 0; // total number of items in the matrix

        // find the average of all the values from the matrix (named "matty")
        // store it in avg
        // return avg
        for (int[] row : matty){
            for (int item : row){
                sum += item;
                numItems++;
            }
        }
        avg = sum / numItems;  
        return avg;
    }

    public static void main(String[] args) 
    {
        int[][] mat = {{1,5,7},
                       {19,32,76},
                       {11,23}};

        // this will take "mat" and give it to the function "avgMat"
        System.out.println( avgMat( mat ) );       
    }
}
