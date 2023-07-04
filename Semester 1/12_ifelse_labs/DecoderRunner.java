//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Scanner;
public class DecoderRunner
{
    public static void main( String args[] )
    {
        //add test cases
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter a letter :: ");
        String letter = kb.next();
        Decoder decoder = new Decoder();
        String value = decoder.deCode(letter);
        System.out.println(letter + " decodes to " + value);
    }
}