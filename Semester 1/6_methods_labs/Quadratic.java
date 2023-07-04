//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Quadratic
{
    public static double getRootOne( int a, int b, int c )
    {
        double rootOne = (((-1*b) + Math.sqrt((b*b)-(4*a*c))) / (2 * a));
        return rootOne;
    }
    
    public static double getRootTwo( int a, int b, int c )
    {
        double rootTwo = (((-1*b) - Math.sqrt((b*b)-(4*a*c))) / (2 * a));
        return rootTwo;
    }
}