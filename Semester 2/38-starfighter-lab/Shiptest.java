//(c) A+ Computer Science
//www.apluscompsci.com

/* This class is used to test the Ship class before you
 ** put it into the game environment
 */

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Shiptest
{
    public static void main( String args[] )
    {
        MovingThing test = new Ship();
        System.out.println("Ship 1: " + test);

        Ship test2 = new Ship(50,75);
        System.out.println("Ship 2: " + test2);

        Ship test3 = new Ship(7,7,6,5,1);
        test3.setX(3);
        test3.setY(5);
        System.out.println("Ship 3: " + test3);
        test3.move("UP");
        test3.move("LEFT");
        System.out.println("Ship 3 after moving up and then left: " + test3);

    }
}
