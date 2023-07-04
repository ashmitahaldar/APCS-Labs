//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner
{
    public static void main( String args[] ) throws IOException
    {
        SpiralMatrix m = new SpiralMatrix(5);
        m.createSpiral();
        System.out.println(m+"\n");
        
        m.setSize(8);
        m.createSpiral();
        System.out.println(m+"\n");
        
        m.setSize(7);
        m.createSpiral();
        System.out.println(m+"\n");
        
        m.setSize(3);
        m.createSpiral();
        System.out.println(m+"\n");
        
        m.setSize(2);
        m.createSpiral();
        System.out.println(m+"\n");
        
        m.setSize(1);
        m.createSpiral();
        System.out.println(m+"\n");
    }
}