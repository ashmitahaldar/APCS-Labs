//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover
{
   private String remove;
   private String sentence;
   
   private String newSentence;

    public StringRemover( String sen, String rem )
    {
        remove = rem;
        sentence = sen;
        newSentence = sentence;
    }

    public void removeStrings()
    {
        while (newSentence.indexOf(remove) > -1)
        {
            int removeLength = remove.length();
            String half1, half2;
            if (newSentence.indexOf(remove) != 0)
            {
             half1 = newSentence.substring(0, newSentence.indexOf(remove)-1);
            } else half1 = newSentence.substring(0, newSentence.indexOf(remove));
             
            half2 = newSentence.substring(newSentence.indexOf(remove) + removeLength);
            newSentence = half1 + half2;
        }
    }

    public String toString()
    {
        return newSentence;
    }
}