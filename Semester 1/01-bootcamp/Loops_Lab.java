import java.util.Scanner;

public class Loops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a starting number :: ");
        int numOne = kb.nextInt();

        System.out.print( "Enter an ending number :: ");
        int numTwo = kb.nextInt();

        // write a loop that will print out all of the numbers from numOne to numTwo (inclusive of both)
        // your code should be able to handle numOne < numTwo AND numOne > numTwo
        if (numOne > numTwo){
            for (int i = numTwo; i <= numOne; i++){
                System.out.println(i);
            }
        } else if (numTwo > numOne){
            for (int i = numOne; i <= numTwo; i++){
                System.out.println(i);
            }
        } else if (numOne == numTwo){
            System.out.println("I see what you did there.");
            System.out.println(numOne);
        }
    }
}
