//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare2
{
    private int[][] mat;

    //size the matrix and make the magic square pattern
    //write all nested loop code here in the constructor
    public MagicSquare2(int size)
    {
        mat = new int[size][size];
        int value = 1;
        int row = 0;
        int column = size/2;
        int currentRow = 0;
        int currentCol = 0;
        
        mat[row][column] = value;
        while (value <= (size*size))
        {
            row--;
            column++;
            value++;
            
            if (row == -1)row = size - 1;
            if (column == size) column = 0;
            
            if (mat[row][column] != 0)
            {
                row++;
                column--;
                if (row >= size)row = size - 1;
                if (column == -1) column = 0;
                row++;
                if (row >= size)row = size - 1;
            }
            
            mat[row][column] = value;
        }
    }


    public String toString()
    {
        String output="";
        for (int[] row : mat)
        {
            for (int column : row)
            {
                output += column + "\t";
            }
            output += "\n";
        }
        return output;
    }
}