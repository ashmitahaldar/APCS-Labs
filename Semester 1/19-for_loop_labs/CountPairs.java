//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class CountPairs
{
    public static int pairCounter( String str )
    { 
        int count = 0;
        for (int i = 0; i< str.length()-1; i++)
        {
            String letter = str.substring(i, i+1);
            String nxtletter = str.substring(i+1, i+2);
            if (letter.equals(nxtletter)){
                count++;
            }
        }
        return count;
    }
}