//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response = 'y';
        String playerChoice;
        
        //add in a do while loop after you get the basics up and running
        while (response == 'y'){
            String player = "";
        
            out.print("type in your prompt [R,P,S] :: ");
            playerChoice = keyboard.next();
            //read in the player value
        
            RockPaperScissors game = new RockPaperScissors(playerChoice);
            out.println(game);
            out.println(game.determineWinner());
            
            out.println("Do you want to play again? (y or n) :: ");
            response = keyboard.next().charAt(0);
        }
    }
}



