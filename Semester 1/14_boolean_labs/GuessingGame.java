//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;
    private int wrongTally = 0; 
    private int guessTally = 0;

    public GuessingGame(int stop)
    {
        upperBound = stop;
    }

    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean correct = false;
        int answer = (int)(Math.random()*(upperBound-1)+1);
        int attempt;
        while (!correct)
        {
            out.print("Enter a number between 1 and " + upperBound + ": ");
            attempt = keyboard.nextInt();
            if (attempt == answer)
            {
                guessTally++;
                out.println("\nIt took " + guessTally + " guesses to guess " + answer + " .");
                correct = true;
            } else if ((attempt < 1) || (attempt > upperBound))
            {
                out.println("Number out of range! Try again.");
            } else 
            {
                wrongTally++;
                guessTally++;
            }
        }
    }

    public String toString()
    {
        String output="You guessed wrong " + ((int)((wrongTally * 100)/guessTally)) + " percent of the time.";
        return output;
    }
}