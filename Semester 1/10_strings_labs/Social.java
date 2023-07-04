//(c) A+ Computer Science
//www.apluscompsci.com

public class Social
{
    public static int SocialSum(String num)
    {
        int sum = 0;
        int firstDash = num.indexOf("-");
        int lastDash = num.lastIndexOf("-");
        String section1 = num.substring(0, firstDash);
        String section2 = num.substring(firstDash+1, lastDash);
        String section3 = num.substring(lastDash+1, num.length());
        sum = sum + Integer.parseInt(section1) + Integer.parseInt(section2) + Integer.parseInt(section3);
        // If you want to add all the individual numbers together
        /*String numbers = num.substring(0, firstDash) + num.substring(firstDash+1, lastDash) + num.substring(lastDash+1, num.length()); 
          for (int i = 0; i < numbers.length(); i++){
              String section = numbers.substring(i, i+1);
              sum = sum + Integer.parseInt(section);
        }*/
        return sum;
    }
}