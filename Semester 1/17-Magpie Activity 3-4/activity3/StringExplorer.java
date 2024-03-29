/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        int pos = sample.indexOf("slow");
        if(pos != -1)
           System.out.println("slow is found at position " + pos);
        else
           System.out.println("slow is not found");

        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        String sample2 = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
        String targetWord = "the";
        int occurences = 0;
        int pos2lastIndex = 0;
        for (int i = 0; i < sample2.length(); i++)
        {
            if (sample2.indexOf(targetWord, i) >= 0)
            {
                occurences++;
                i = sample2.indexOf(targetWord, i) + 1;
            }
        }
        System.out.println("The word \"" + targetWord + "\" occured in the sentence " + occurences + " times.");
    }

}
