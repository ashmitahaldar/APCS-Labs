//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
    public static String go( int amount, char letter )
    {
        String output="";

        int sectionsPerLine = amount;
        for (int i = amount; i >= 1; i--)//to iterate the no. of lines
        {
            String line = "";
            int lettersPerSection = amount; //sets/resets the letters per section to the original amount
            char currentChar = letter; //sets/resets the letter to original letter
            for (int a = 0; a < sectionsPerLine; a++)// runs (the number of sections per line) times
            {
                for (int t = 0; t < lettersPerSection; t++)
                {
                    line += currentChar;
                }
                line += " "; //adds a space between each line section
                currentChar += 1; //moves onto the next letter in the sequence
                lettersPerSection--; //lowers the number of characters in the next section by one
                if (currentChar == 'Z' + 1) currentChar = 'A'; // wraps Z to A.
            }
            sectionsPerLine--;
            output += "\n" + line;
        }

        return output;
    }
}