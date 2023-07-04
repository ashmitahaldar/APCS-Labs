//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwoRunner
{
    public static void main( String args[] ) throws IOException
    {
        FancyWordTwo f = new FancyWordTwo("HELLO");
        out.println(f);
        f = new FancyWordTwo("CAT");
        out.println(f);
        f = new FancyWordTwo("A");
        out.println(f);
        f = new FancyWordTwo("DOGHOUSE");
        out.println(f);
        f = new FancyWordTwo("ONE");
        out.println(f);
        f = new FancyWordTwo("IT");
        out.println(f);
    }
}