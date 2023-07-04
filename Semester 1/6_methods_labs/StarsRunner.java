//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes starsStripes1 = new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
      for (int i = 0; i < 3; i++)
      {
          starsStripes1.printTwentyDashes();
          starsStripes1.printTwentyStars();
        }
      starsStripes1.printTwentyDashes();
        starsStripes1.printTwoBlankLines();
        
      starsStripes1.printASmallBox();
      starsStripes1.printABigBox();
      starsStripes1.printTwentyDashes();
   }
}