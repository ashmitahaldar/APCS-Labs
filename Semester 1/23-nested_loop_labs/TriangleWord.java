//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
    private String word;

    public TriangleWord(String w)
    {
        word=w;
    }

    public String toString()
    {
        String output = "";
        String copy = word.substring(1);
        StringBuilder str = new StringBuilder(copy);
        str = str.reverse().append(word);
        String line = str.toString();
        for(int o = 0; o < word.length(); o++){
            for(int i = 0; i < line.length(); i++){
                if(o + 1 == word.length() || Math.abs(i - line.length()/2) == o){
                    output+=(line.charAt(i));
                }else{
                    output+=(" ");
                }
            }
            output+="\n";        
        }
        return output+"\n";
    }
}