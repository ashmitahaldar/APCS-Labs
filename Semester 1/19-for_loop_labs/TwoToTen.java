//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTen
{
    public static long getBaseTen( String bin )
    {
        long ten=0;
        bin = bin.replace("\u0000", "");
        int length = bin.length()-1;
        for (int i = 0; i < bin.length(); i++)
        {
            String number = bin.substring(i, i+1);
            int value = Integer.parseInt(number);
            ten += Math.pow(2, length) * value;
            length--;
        }
        return ten;
    }
}