//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxWord
{
    public static String go( String word )
    {
        String output="";

        switch(word.length()){
            case 1:
                output += word;
                break;
            default:
                //top line
                output += word + "\n";

                //middle lines
                int middleLinesTotal = word.length() - 2;
                int count = 1;
                String middleLines = "";
                while (count <= middleLinesTotal)
                {
                    middleLines += word.substring(count, count+1);
                    for (int i = 0; i < middleLinesTotal; i++)
                    {
                        middleLines += " ";
                    }
                    middleLines += word.substring(word.length()-1-count, word.length()-count);
                    middleLines += "\n";
                    count++;
                }
                output += middleLines;

                //bottom line
                String bottomLine = "";
                for (int i = word.length()-1; i >= 0; i--)
                {
                    bottomLine += word.substring(i, i+1);
                }
                output += bottomLine + "\n";

        }

        return output+"\n";
    }
}