//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
    private Integer number;
    private String roman;

    private final static int[] NUMBERS= {1000,900,500,400,100,90,
                                                    50,40,10,9,5,4,1};

    private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
                                                  "L","XL","X","IX","V","IV","I"};

    public RomanNumeral(String str)
    {
        setRoman(str);


    }

    public RomanNumeral(Integer orig)
    {
        setNumber(orig);


    }

    public void setNumber(Integer num)
    {
        number = num;
        
        String currentRom = "";
        int currentNum = 0;
        
        for (int i = 0; i < NUMBERS.length; i++)
        {
            currentNum = NUMBERS[i];
            while (number >= currentNum)
            {
                currentRom += LETTERS[i];
                number -= currentNum;
            }
        }
        roman = currentRom;
    }

    public void setRoman(String rom)
    {
        roman = rom;
        int currentNum = 0;
        String currentRom = "";
        for (int i = 0; i < roman.length(); i++)
        {
            currentRom = roman.substring(i, i+1);
            
            if (i <= roman.length()-2)
                {
                    if (roman.substring(i, i+2).equals("XL"))
                    {
                        currentNum += 40;
                        i++;
                        continue;
                    } else if (roman.substring(i, i+2).equals("IX"))
                    {
                        currentNum += 9;
                        i++; 
                        continue;
                    }
                } 
            
            
            for (int o = 0; o < LETTERS.length; o++)
            {
                //
                
                if (LETTERS[o].equals(currentRom))
                {
                    currentNum += NUMBERS[o];
                }
            }
            roman = roman.substring(i);
            i = 0;
        }
        number = currentNum;
    }

    public Integer getNumber()
    {
        return number;
    }

    public String toString()
    {
        return roman + "\n";
    }
}