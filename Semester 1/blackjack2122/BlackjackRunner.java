// Class: BlackjackRunner
// Purpose: Runner class used to initiate and play blackjack
// @author TAS
// @version November 2021

import java.util.Scanner;

public class BlackjackRunner
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in); // Creates a Scanner object for keyboard input
        boolean play = true; // Main boolean to run the game
        Blackjack bj = new Blackjack(); // Initializing a Blackjack object
        System.out.println("Welcome to Blackjack! (this is only for fun, no betting!!)\n");
        while (play) // The game runs while play is true
        {
            bj.playRound(); // Main method to run each round of blackjack
            play = replay(kb); // If the player inputs "y", the game restarts, else if the player responds "n" the game ends
        }
    }

    public static boolean replay(Scanner kb) // Method to determine whether the player wants to replay the game
    {
        boolean replay; // Boolean value to be returned
        System.out.print("Wow, that was fun! You want to play again? ");
        String reply = kb.nextLine().toLowerCase(); // Turns the user-inputted value to lower-case for easier checking
        System.out.println();

        while (!(reply.equals("y") || reply.equals("n"))) // Asks the user to re-input their response in case they reply with something else
        {
            System.out.println("Please reply either 'y' or 'n'. You want to play again? ");
            reply = kb.nextLine().toLowerCase();
        }
        
        // Checks user response to determine whether to replay the game or not
        if (reply.equals("y"))
        {
            replay = true;
        } else {
            System.out.println("That was fun, come back if you want more practice!");
            replay = false;
        }
        System.out.println();
        return replay;
    }
}