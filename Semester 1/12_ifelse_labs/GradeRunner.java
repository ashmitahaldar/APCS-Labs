//(c) A+ Computer Science
// www.apluscompsci.com
//Name -
import java.util.Scanner;
public class GradeRunner
{
    public static void main( String args[] )
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a number grade :: ");
        int grade = kb.nextInt();
        System.out.println(grade + " is a " + Grade.getLetterGrade(grade) );
        
    }
}