//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class TopLeftDiagonal
{
    private String[][] codeBox;
    
    // encode string
    public String encode(String original)
    {
        String encoded = "";
        
        int dimensions = (int)(Math.ceil(Math.sqrt(original.length())));
        codeBox = new String[dimensions][dimensions];
        int stringcnt = 0;
        for (int i = 0; i < codeBox.length; i++)
        {
            for (int o = 0; o < codeBox[i].length; o++)
            {
                if (stringcnt < original.length())
                {
                    codeBox[i][o] = original.substring(stringcnt, stringcnt+1);
                    stringcnt++;
                } else 
                {
                    codeBox[i][o] = "*";
                }
            }
        }
        
        for (int r = 0; r < codeBox.length; r++)
        {
            for (int c = 0; c <= r; c++)
            {
                encoded = encoded + codeBox[r-c][c];
            }
        }
        
        for (int r = codeBox.length-1; r > codeBox.length/2; r--)
        {
           for (int c = 0; c < r; c++)
            {
                encoded = encoded + codeBox[r-c][c+1];
            } 
        }
        
        encoded = encoded + codeBox[dimensions-1][dimensions-1];
        
        return encoded;
    }

    // decode string
    public String decode(String encoded)
    {
        String decoded = "";
        
        for (String[] rows : codeBox)
        {
            for (String columns : rows)
            {
                if (columns.equals("*"))
                {
                    continue;
                } else decoded += columns;
            }
        }
        
        return decoded;
    }
}