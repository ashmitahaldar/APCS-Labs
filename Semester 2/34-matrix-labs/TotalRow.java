//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
        //add code here
        
        //String output = "Row totals are :: [";
        List<Integer> totals = new ArrayList<Integer>();
        
        for (int[] rows : m)
        {
            int total = 0;   
            for (int columns : rows)
            {
                total += columns;
            }
            totals.add(total);
        }
        //output += "]";
        
        return totals;
    }
}
