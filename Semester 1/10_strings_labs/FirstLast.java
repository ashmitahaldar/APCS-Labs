//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FirstLast
{
   public static String execute( String a, String b )
    {
        String output = a.substring(0, 1) + b.substring(b.length()-1, b.length());
        return output;
    }
}