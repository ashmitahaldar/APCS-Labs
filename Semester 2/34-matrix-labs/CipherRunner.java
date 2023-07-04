//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class CipherRunner
{
   public static void main( String args[] )
   {
           // encode and print out a few strings, then decode and verify
           // they match what you started with
           TopLeftDiagonal tld = new TopLeftDiagonal();
           out.println(tld.encode("friendly"));
           out.println(tld.decode("friendly") + "\n");
           out.println(tld.encode("abc"));
           out.println(tld.decode("abc") + "\n");
           out.println(tld.encode("dnadoublehelix"));
           out.println(tld.decode("dnadoublehelix") + "\n");
           out.println(tld.encode("cipherscodesandstrings"));
           out.println(tld.decode("cipherscodesandstrings") + "\n");
           out.println(tld.encode("elvissoundgardenhinderseetherbeatles"));
           out.println(tld.decode("elvissoundgardenhinderseetherbeatles") + "\n");
   }
}