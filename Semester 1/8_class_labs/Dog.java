//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
    private int age;
    private String name;

    public Dog( String n )  
    {
        age = 1;
        name = n;
    }

    public Dog( String n, int a )  
    {
        //fill in this constructor
        age = a;
        name = n;
    }

    public void increaseAgeByOne()
    {
        //fill in this method
        age += 1;
    }

    public int getPeopleAge( int val )
    {
        //fill in this method
        return (age * val);
    }

    public int getAge()    {
        return age;
    }

    public String getName()    {
        return name;
    }

    public String toString()    {
        return "Dog - " + name + " " + age;
    }
}
