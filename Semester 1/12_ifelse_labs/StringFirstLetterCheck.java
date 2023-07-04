//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringFirstLetterCheck
{
    public static String checkFirstLetter( String wordOne, String wordTwo )
    {
        String letter1 = wordOne.substring(0, 1);
        String letter2 = wordTwo.substring(0, 1);
        if (letter1.equals(letter2)){
            return (wordOne + " has the same first letter as " + wordTwo);
        }
        else 
        {
            return (wordOne + " does not have the same first letter as " + wordTwo);
        }
    }
}