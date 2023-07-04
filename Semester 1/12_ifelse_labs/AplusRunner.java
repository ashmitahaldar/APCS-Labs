//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class AplusRunner
{
    public static void main( String args[] )
    {
        //test cases - client code
        System.out.println( NumChecker.check( 100 ) );
        //add more cases
        System.out.println( NumChecker.check( 88 ) );
        System.out.println( NumChecker.check( 99 ) );
        System.out.println( NumChecker.check( 13 ) );
        
        System.out.println( AB.check( "chicken", "a", "b" ) );
        //add more cases
        System.out.println( AB.check( "chicken", "c", "k" ) );
        System.out.println( AB.check( "apluscompsci", "a", "c" ) );
        System.out.println( AB.check( "apluscompsci", "u", "s" ) );
    }
}