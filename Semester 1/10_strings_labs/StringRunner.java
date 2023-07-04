//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a word :: ");
        String word = keyboard.next();
        
        // add test cases for your code here
        System.out.println("Has first last letters :: " + StringStuff.firstLast(word));
        System.out.println("Has middle letter :: " + StringStuff.middle(word));
        System.out.println("Has same first and last letter :: " + StringStuff.isFirstLastSame(word));
    }
}