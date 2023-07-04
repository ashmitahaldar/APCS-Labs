//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
    public static void main( String args[] )
    {
        ExpressionSolver e = new ExpressionSolver("3 + 5");
        e.solveExpression();
        System.out.println(e);
        
        e.setExpression("3 * 5");
        e.solveExpression();
        System.out.println(e);
        
        e.setExpression("3 - 5");
        e.solveExpression();
        System.out.println(e);
        
        e.setExpression("3 / 5");
        e.solveExpression();
        System.out.println(e);
        
        e.setExpression("5 / 5 * 2 + 8 / 2 + 5");
        e.solveExpression();
        System.out.println(e);
        
        e.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        e.solveExpression();
        System.out.println(e);
    }
}