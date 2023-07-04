//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors(String player)
    {
        char charPlayChoice = (Character.toUpperCase(player.charAt(0)));
        playChoice = Character.toString(charPlayChoice);
        int numCompChoice = (int)(Math.random()*2+1);
        if (numCompChoice == 0)
        {
            compChoice = "R";
        } else if (numCompChoice == 1)
        {
            compChoice = "P";
        } else if (numCompChoice == 2)
        {
            compChoice = "S";
        }
    }

    public String determineWinner()
    {
        String winner = "";
        
        //first three cases -- draw cases
        if ((playChoice.equals("R"))&&(compChoice.equals("R")))
        {
            winner = winner + "!Draw Game!";
        } else if ((playChoice.equals("P"))&&(compChoice.equals("P")))
        {
            winner = winner + "!Draw Game!";
        } else if ((playChoice.equals("S"))&&(compChoice.equals("S")))
        {
            winner = winner + "!Draw Game!";
        } // Rock loses against Paper, Rock wins against Scissors
          else if ((playChoice.equals("R"))&&(compChoice.equals("P")))
        {
            winner = winner + "!Computer wins <<Paper beats Rock>>!";
        } else if ((playChoice.equals("R"))&&(compChoice.equals("S")))
        {
            winner = winner + "!Player wins <<Rock beats Scissors>>!";
        } // Paper wins against Rock, Paper loses against Scissors
          else if ((playChoice.equals("P"))&&(compChoice.equals("R")))
        {
            winner = winner + "!Player wins <<Paper beats Rock>>!";
        } else if ((playChoice.equals("P"))&&(compChoice.equals("S")))
        {
            winner = winner + "!Computer wins <<Scissor beats Paper>>!";
        } // Scissors wins against Paper, Scissors loses against Rock
          else if ((playChoice.equals("S"))&&(compChoice.equals("P")))
        {
            winner = winner + "!Player wins <<Scissors beats Paper>>!";
        } else if ((playChoice.equals("S"))&&(compChoice.equals("R")))
        {
            winner = winner + "!Computer wins <<Rock beats Scissor>>!";
        }
        
        return winner;
    }

    public String toString()
    {
        String output="player had " + playChoice +"\ncomputer had " + compChoice;
        return output;
    }
}