import java.util.Scanner;

public class Ifs_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt();

        // write an if statement to print out if the number is odd or even
        // you will need to use % (mod) to get the remainder of division
        System.out.println(num);
        
        if (num % 2 == 0){
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
