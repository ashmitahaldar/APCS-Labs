//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
    private String password;
    public boolean valid;
    public PasswordCheck()
    {
        password = "12345uwu";
        valid = false;
    }

    public void check()
    {
        String attempt;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid){
            out.print("Enter the password :: ");
            attempt = keyboard.next();
            if (attempt.equals(password)){
                System.out.println("VALID");
                valid = true;
            } else System.out.println("INVALID");
        }
    }
}