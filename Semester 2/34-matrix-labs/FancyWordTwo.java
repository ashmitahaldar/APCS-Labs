//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWordTwo
{
    private String[][] mat;

   public FancyWordTwo(String s)
    {
        //size the matrix
        int size = s.length();
        mat = new String[size][size];

        //use Arrays.fill() to fill in the matrix with spaces
        for (String[] row : mat)
            Arrays.fill(row, " ");

        //use a for loop to load in the letters into the matrix
        for (int i = 0; i < size; i++)
        {
            mat[0][i] = s.substring(i, i+1);
            mat[i][0] = s.substring(i, i+1);
            mat[size-1][size-1-i] = s.substring(i, i+1);
            mat[size-1-i][size-1] = s.substring(i, i+1);
        }

    }

    public String toString()
    {
        String output="";
        
        for (String[] row : mat)
        {
            for (String column : row)
            {
                System.out.print(column);
            }
            System.out.println();
        }
        
        return output+"\n\n";
    }
}