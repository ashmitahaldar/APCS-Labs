//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
    public static void main( String args[] ) throws IOException
    {
        PascalsTriangle p = new PascalsTriangle(3);
        p.createTriangle();
        out.println(p);
        
        p = new PascalsTriangle(6);
        p.createTriangle();
        out.println(p);
        
        p = new PascalsTriangle(7);
        p.createTriangle();
        out.println(p);
        
        p = new PascalsTriangle(2);
        p.createTriangle();
        out.println(p);
        
        p = new PascalsTriangle(4);
        p.createTriangle();
        out.println(p);
        
        p = new PascalsTriangle(5);
        p.createTriangle();
        out.println(p);
    }
}



