//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Variables
{
    public static void main ( String[] args )
    {
        //define 1 variable of each of the
        //following data types
        //byte        short        int         long
        //float        double
        //char      boolean        String

        //integer variables
        byte byteOne = 127;
        short shortOne = 236;
        int intOne = 3874;
        long longOne = 348736324487l;


        //decimal variables
        float floatOne = 39746.28374f;
        double doubleOne = 2472823647823654.28748324;

        //other integer types


        //other types
        char charOne = 346;
        char charTwo = 'O';
        boolean booleanOne = true;
        String stringOne = "Hello, this is a string!";

        //output your information here
        System.out.println("/////////////////////////////////");
        System.out.println("*                               *");
        System.out.println("*        integer types          *");
        System.out.println("*                               *");
        System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
        System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
        System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
        System.out.println("*64 bit - longOne = "+longOne+"*");
        System.out.println("*                               *");
        System.out.println("*        decimal types          *");
        System.out.println("*                               *");
        System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
        System.out.println("*64 bit - doubleOne = "+doubleOne+"*");
        System.out.println("*                               *");
        System.out.println("*        other types            *");
        System.out.println("*                               *");
        System.out.println("*16 bit unsigned - charOne = "+charOne+"  *");
        System.out.println("*16 bit unsigned - charTwo = "+charTwo+"  *");
        System.out.println("*1 bit - booleanOne = "+booleanOne+"\t*");
        System.out.println("*stringOne = "+stringOne+"*");
        System.out.println("*                               *");
        System.out.println("/////////////////////////////////");
    }
}