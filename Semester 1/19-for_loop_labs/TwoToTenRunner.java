//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTenRunner
{
    public static void main ( String[] args )
    {
        //add test cases    
        System.out.println("1010 == " + TwoToTen.getBaseTen("1010"));
        System.out.println("1100 == " + TwoToTen.getBaseTen("1100"));
        System.out.println("1110 == " + TwoToTen.getBaseTen("1110"));
        System.out.println("1111 == " + TwoToTen.getBaseTen("1111"));
        System.out.println("11111 == " + TwoToTen.getBaseTen("11111"));
        System.out.println("111111 == " + TwoToTen.getBaseTen("111111"));
        System.out.println("1110101 == " + TwoToTen.getBaseTen("1110101"));
        System.out.println("10101010101 == " + TwoToTen.getBaseTen("10101010101"));
        System.out.println("101010101011 0 == " + TwoToTen.getBaseTen("1010101010110 "));
        System.out.println("111111111111111111  == " + TwoToTen.getBaseTen("111111111111111111 "));
    }
}