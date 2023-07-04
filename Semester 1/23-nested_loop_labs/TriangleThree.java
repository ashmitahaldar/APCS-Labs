//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThree
{
    public static String go( int size, String let )
    {
        String output="";
        int count = 0;
        while (count < size)
        {
            String line = "";
            for (int j = 1; j <= size-count; j++)
            {
                line += " ";
            }
            for (int j = 0; j <= count; j++)
            {
                line += let;
            }
            output += line + "\n";
            count++;
        }
        return output+"\n";
    }
}