//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class ConeRunner
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter the radius :: " );
        double radius = kb.nextDouble();
        System.out.print( "Enter the height :: " );        
        double height = kb.nextDouble();
        
        //print your answer here
        double pi = 3.14159;
        double volume = pi*(radius*radius)*height/3;
        System.out.println(volume);
    }
}

/*
 
Sample Data: 
4 4
4 3
9 3
1 3
1 5
7 7
1.5 3
1.5 5



Sample Output : 
67.02
50.27
254.47
3.14
5.24
359.19
7.07
11.78


*/
