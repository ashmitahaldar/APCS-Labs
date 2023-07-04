//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
    private int[][] mat;
    private int sizem;

    public PascalsTriangle()
    {


    }

    public PascalsTriangle(int size)
    {
        mat = new int[size][size];
        sizem = size;
    }

    public void createTriangle()
    {
        
        for (int i = 0; i < sizem; i++)
        {
            for (int o = 0; o <= i; o++)
            {
                if (o == 0 || o == i)
                {
                    mat[i][o] = 1;
                } else 
                {
                    mat[i][o] = mat[i-1][o-1] + mat[i-1][o];
                }
            }
        }

    }

    public String toString()
    {
        String output="";

        for (int[] row : mat)
        {
            for (int column : row)
            {
                if (column == 0)
                {
                    output += "\t";
                } else output += column + "\t";
            }
            output += "\n";
        }

        return output;
    }
}