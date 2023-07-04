//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Triples
{
    private int number;

    public Triples(int num)
    {
        number = num;
    }

    private int greatestCommonFactor(int a, int b, int c)
    {
        int limit = Math.min(a, b);
        limit = Math.min(limit, c);
        for(int n = limit; n >= 2; n--)
        {
            if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
                return n;
            }
        }

        return 1;
    }

    public String toString()
    {
        String output="";
        for (int a = 1; a <= number; a++) {
            for (int b = a; b <= number; b++) {
                for (int c = 1; c <= number; c++) {
                    if (((a * a) + (b * b) == (c * c))) {
                        if (((a%2 != 0 && b%2==0) || (b%2!=0 && a%2==0)) && (c%2 != 0))
                        {
                            if (greatestCommonFactor(a, b , c) == 1)
                            {
                                output += (a + " " + b + " " + c) + "\n";
                            }
                        }
                    }

                    else continue;                  
                }
            }
        }
        return output + "\n";
    }
}