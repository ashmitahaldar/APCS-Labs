//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SwitchFirst
{
   public static String go( String a, String b )
    {
        String value = b.substring(0, 1) + a.substring(1, a.length());
        return value;
    }
}