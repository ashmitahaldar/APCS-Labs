//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class VowelCounterRunner
{
    public static void main ( String[] args )
    {
        System.out.println( VowelCounter.getNumberString("abcdef") );
        //add more test cases 
        System.out.println( VowelCounter.getNumberString("hhhhhhh") );
        System.out.println( VowelCounter.getNumberString("catpigdatrathogbogfrogmoosegeese ") );
        System.out.println( VowelCounter.getNumberString("hhhhhhh1234356HHHHDH") );
        System.out.println( VowelCounter.getNumberString("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj") );
        System.out.println( VowelCounter.getNumberString("") );
        System.out.println( VowelCounter.getNumberString("x") );
        System.out.println( VowelCounter.getNumberString("e") );
    }
}


