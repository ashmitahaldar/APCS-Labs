//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare2Runner
{
    public static void main( String args[] ) throws IOException
    {
        MagicSquare2 m = new MagicSquare2(5);
        out.println(m);
        
        m = new MagicSquare2(1);
        out.println(m);
        
        m = new MagicSquare2(7);
        out.println(m);
        
        m = new MagicSquare2(3);
        out.println(m);
    }
}