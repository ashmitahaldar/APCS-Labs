//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Decoder
{
    public String deCode( String s )
    {
        String result="";
        char charS = s.charAt(0);
        if (Character.isLowerCase(charS))
        {
            result = result + Character.toUpperCase(charS);
        } else if (Character.isUpperCase(charS))
        {
            result = result + Character.toLowerCase(charS);
        } else if (charS == 48)
        {
            result = result + "A";
        } else if (charS == 49)
        {
            result = result + "B";
        } else if (charS == 50)
        {
            result = result + "C";
        } else if (charS == 51)
        {
            result = result + "D";
        } else if (charS == 52)
        {
            result = result + "E";
        } else if (charS == 53)
        {
            result = result + "F";
        } else if (charS == 54)
        {
            result = result + "G";
        } else if (charS == 55)
        {
            result = result + "H";
        } else if (charS == 56)
        {
            result = result + "I";
        } else if (charS == 57)
        {
            result = result + "J";
        } else result = result + "#";
        return result;
    }
}