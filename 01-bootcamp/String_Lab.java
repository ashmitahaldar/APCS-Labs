import java.util.Scanner;

public class String_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a word :: ");
        String word = kb.next();

        //1.) print out the first and last letter of the word
        System.out.println(word.substring(0, 1));
        System.out.println(word.substring(word.length()-1, word.length()));

        //2.) print out the word backwards
        for (int i = word.length(); i > 0; i--){
            System.out.print(word.substring(i-1, i));
        }
        
        //3.) check to see if the word contains a vowel (a/e/i/o/u) and print out the result
        boolean vowel = false;
        if (word.indexOf("a") != -1){
            vowel = true;
        } else if (word.indexOf("e") != -1){
            vowel = true;
        } else if (word.indexOf("i") != -1){
            vowel = true;
        } else if (word.indexOf("o") != -1){
            vowel = true;
        } else if (word.indexOf("u") != -1){
            vowel = true;
        }
        System.out.println();
        if (vowel){
            System.out.println("The word has a vowel.");
        } else {
            System.out.println("The word does not have a vowel.");
        }
    }
}
