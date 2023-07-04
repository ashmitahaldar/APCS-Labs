//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FibonacciRunner
{
    public static void main(String args[])
    {
        //add test cases
        Fibonacci f1 = new Fibonacci(50);
        f1.set();
        System.out.println(f1.get(1));
        System.out.println(f1.get(2));
        System.out.println(f1.get(3));
        System.out.println(f1.get(4));
        System.out.println(f1.get(5));
        System.out.println(f1.get(6));
        System.out.println(f1.get(11));
        System.out.println(f1.get(16));
        System.out.println(f1.get(21));
        System.out.println(f1.get(31));
        System.out.println(f1.get(41));
        System.out.println(f1.get(46));
        
        Fibonacci f2 = new Fibonacci(1);
        f2.set();
        System.out.println(f2.get(1));
        
        Fibonacci f3 = new Fibonacci(2);
        f3.set();
        System.out.println(f3.get(1));
        System.out.println(f3.get(2));
        System.out.println(f3.get(11));
    }
}