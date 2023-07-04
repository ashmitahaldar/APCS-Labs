//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
       for (int i = 0; i < 20; i++)
       {
            out.print("*");
        }
        out.println();
   }

   public void printTwentyDashes()
   {
       for (int i = 0; i < 20; i++)
       {
            out.print("-");
        }
        out.println();
   }

   public void printTwoBlankLines()
   {
       out.println();
       out.println();
   }
   
   public void printASmallBox()
   {    
       for (int i = 0; i < 2; i++)
       {
           printTwentyDashes();
           printTwentyStars();
        }
   }
 
   public void printABigBox()
   { 
       for (int i = 0; i < 4; i++)
       {
           printTwentyDashes();
           printTwentyStars();
        }
   }   
}