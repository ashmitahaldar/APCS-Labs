//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        
        //ask for name and size
        System.out.println("Enter 1st monster's name: ");
        String name1 = keyboard.next();
        System.out.println("Enter 1st monster's size");
        int size1 = keyboard.nextInt();
        
        //instantiate monster one        
        Monster monster1 = new Monster(name1, size1);
        
        //ask for name and size
        System.out.println("Enter 1st monster's name: ");
        String name2 = keyboard.next();
        System.out.println("Enter 1st monster's size");
        int size2 = keyboard.nextInt();
        
        //instantiate monster two
        Monster monster2 = new Monster(name2, size2);
        
        System.out.println(monster1.toString());
        System.out.println(monster2.toString());
        if (monster1.isBigger(monster2))
        {
            System.out.println("Monster one is bigger than Monster two.");
        } 
        else if (monster1.isSmaller(monster2))
        {
            System.out.println("Monster one is smaller than Monster two.");
        }
        
        if (monster1.namesTheSame(monster2))
        {
            System.out.println("Monster one has the same name as Monster two.");
        }
    }
}