//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SpiralMatrix
{
    //define a matrix
    private int[][] spiral;
    private int sizem;
    
    public SpiralMatrix()
    {
    }

    public SpiralMatrix(int size)
    {
        sizem = size;
        spiral = new int[size][size];
    }
    
    public void setSize(int size)
    {
        sizem = size;
        spiral = new int[size][size];
    }

    public void createSpiral()
    {
        int minCol = 0;
        int minRow = 0;
        int maxCol = sizem-1;
        int maxRow = sizem-1;
        int value = 1;
        
        while (value <= (sizem*sizem))
        {
            for (int i = minRow; i <= maxRow; i++)
            {
                spiral[i][minCol] = value;
                value++;
            }
            
            for (int i = minCol + 1; i <= maxCol; i++)
            {
                spiral[maxRow][i] = value;
                value++;
            }
            
            for (int i = maxRow-1; i >= minRow; i--)
            {
                spiral[i][maxCol] = value;
                value++;
            }
            
            for (int i = maxCol-1; i > minCol; i--)
            {
                spiral[minRow][i] = value;
                value++;
            }
            
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }
    }

    public String toString( )
    {
        String output="";
        
        for (int[] row : spiral)
        {
            for (int column : row)
            {
                System.out.print(column+ "\t");
            }
            System.out.println();
        }
        
        return output;
    }
}