//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class AB
{
    public static boolean check( String s, String a, String b)
    {
        int counter = 0;
        
        for (int i = 1; i < s.length()-1; i++)
        {
            if (s.substring(i, i+1).equals(a))
            {
                if (s.substring(i+1, i+2).equals(b))
                {
                    counter++;
                }
            }
        }
        
        if (counter > 0) return true;
        else return false;
    }
}