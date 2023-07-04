//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SocialRunner
{
    public static void main( String args[] )
    {
        //add test cases
        String ss1 = "434-283-293";
        String ss2 = "120-2-21";
        String ss3 = "0-0-0";
        String ss4 = "1-1-1";
        
        int value1 = Social.SocialSum(ss1);
        System.out.println("SS# " + ss1 + " has a total of " + value1);
        
        int value2 = Social.SocialSum(ss2);
        System.out.println("SS# " + ss2 + " has a total of " + value2);
        
        int value3 = Social.SocialSum(ss3);
        System.out.println("SS# " + ss3 + " has a total of " + value3);
        
        int value4 = Social.SocialSum(ss4);
        System.out.println("SS# " + ss4 + " has a total of " + value4);
    }
}