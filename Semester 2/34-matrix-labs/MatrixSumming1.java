import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
                                            { 6, 7, 8, 9, 0},
                                            { 6, 7, 1, 2, 5},
                                            { 6, 7, 8, 9, 0},
                                            { 5, 4, 3, 2, 1}};

    public static int sum( int row, int column )
    {
        //add code here
        int total = 0;
        
        total += m[row][column];
        //above
        if (row-1 >= 0) total += m[row-1][column];
        //below
        if (row+1 < 5) total += m[row+1][column];
        //left
        if (column-1 >= 0) total += m[row][column-1];
        //right
        if (column+1 < 5) total += m[row][column+1];
        //left-up-diagonal
        if (row-1 >= 0 && column-1 >= 0) total += m[row-1][column-1];
        //right-up-diagonal
        if (row-1 >= 0 && column+1 < 5) total += m[row-1][column+1];
        //left-down-diagonal
        if (row+1 < 5 && column-1 >= 0) total += m[row+1][column-1];
        //right-down-diagonal
        if (row+1 < 5 && column+1 < 5) total += m[row+1][column+1];
        
        return total;
    }
}
