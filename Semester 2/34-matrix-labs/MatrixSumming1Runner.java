//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming1Runner
{
    public static void main( String args[] ) throws Exception
    {
        //add code here
        MatrixSumming1 summer = new MatrixSumming1();
        System.out.println("Matrix values");
        System.out.println("1 2 3 4 5");
        System.out.println("6 7 8 9 0");
        System.out.println("6 7 1 2 5");
        System.out.println("6 7 8 9 0");
        System.out.println("5 4 3 2 1 \n");
        
        System.out.println("The sum of 2, 2 is " + summer.sum(2, 2) + ".");
        System.out.println("The sum of 0, 0 is " + summer.sum(0, 0) + ".");
        System.out.println("The sum of 4, 3 is " + summer.sum(4, 3) + ".");
        System.out.println("The sum of 4, 4 is " + summer.sum(4, 4) + ".");
        System.out.println("The sum of 2, 4 is " + summer.sum(2, 4) + ".");
        System.out.println("The sum of 1, 3 is " + summer.sum(1, 3) + ".");
    }
}



