//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y';
        
        while (response == 'y'){
            int stop;
            out.print("Guessing Game - how many numbers? ");
            stop = keyboard.nextInt();
            GuessingGame guesser = new GuessingGame(stop);
            guesser.playGame();
            System.out.println(guesser);
            out.println("\n");
            out.println("Do you want to play again? (y or n) ");
            response = keyboard.next().charAt(0);
        }
    }
}