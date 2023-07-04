//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class VowelCounter
{
    public static String getNumberString( String s)
    {
        String newStr = "";
        int number = 0;
        for (int i = 0; i < s.length(); i++){
            if (number > 9) number = 0;
            String letter = s.substring(i, i+1).toLowerCase();
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
            {
                newStr = newStr + number;
                number++;
            } else {
                newStr = newStr + letter;
            }
        }
        return newStr;
    }
}


