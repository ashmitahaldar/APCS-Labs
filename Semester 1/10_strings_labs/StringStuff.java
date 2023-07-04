//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
    public static String firstLast(String word)
    {
        return (word.substring(0, 1) + word.substring(word.length()-1, word.length()));
    }
    public static String middle(String word)
    {
        return word.substring((word.length()/2), (word.length()/2)+1);
    }
    public static boolean isFirstLastSame(String word)
    {
        if (word.substring(0, 1).equals(word.substring(word.length()-1, word.length())))
        {
            return true;
        } else return false;
    }
}