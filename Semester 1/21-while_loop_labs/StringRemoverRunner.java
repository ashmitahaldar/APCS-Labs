//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringRemoverRunner
{
    public static void main( String args[] )
    {
        //add test cases
        StringRemover sr = new StringRemover("xR-MxR-MHelloxR-M", "R-M");
        sr.removeStrings();
        System.out.println(sr);

        StringRemover sr2 = new StringRemover("sxsssxssxsxssexssxsesss","xs");
        sr2.removeStrings();
        System.out.println(sr2);
        
        StringRemover sr3 = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn ", "qwerty");
        sr3.removeStrings();
        System.out.println(sr3);
        
        StringRemover sr4 = new StringRemover("dogdogcatddodogdogdoggog", "dog");
        sr4.removeStrings();
        System.out.println(sr4);
    }
}