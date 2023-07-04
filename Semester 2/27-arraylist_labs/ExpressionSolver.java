//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
    //add in instance variables
    private ArrayList expression;
    private String expressionStr;
    private double result;
    
    public ExpressionSolver(String s)
    {
        expression = new ArrayList<String>();
        expressionStr = s;
        result = 0;
        
        Scanner e = new Scanner(s);
        while (e.hasNext())
        {
            String thing = e.next();
            expression.add(thing);
        }
    }

    public void setExpression(String s)
    {
        expression = new ArrayList<String>();
        expressionStr = s;
        result = 0;
        
        Scanner e = new Scanner(s);
        while (e.hasNext())
        {
            String thing = e.next();
            expression.add(thing);
        }
    }

    public void solveExpression()
    {
        //System.out.println(expression +"\n"+expression.get(1).getClass()); 
        
        // Checking for multiplication and division
        for (int i = 0; i<expression.size(); i++){
            String obj = (String)expression.get(i);
            //System.out.println(expression);
            if (obj.charAt(0) == '/'){
                double op1 = Double.parseDouble((String)expression.get(i-1));
                double op2 = Double.parseDouble((String)expression.get(i+1));
                int resultop = (int)(op1/op2);
                expression.remove(i-1);
                expression.remove(i-1);
                i--;
                expression.set(i, ""+resultop);
                result = resultop;
            } else if (obj.charAt(0) == '*'){
                double op1 = Double.parseDouble((String)expression.get(i-1));
                double op2 = Double.parseDouble((String)expression.get(i+1));
                int resultop = (int)(op1*op2);
                expression.remove(i-1);
                expression.remove(i-1);
                i--;
                expression.set(i, ""+resultop);
                result = resultop;
            }
        }
        
        //Checking for addition and subtraction
        for (int i = 0; i<expression.size(); i++){
            String obj = (String)expression.get(i);
            //System.out.println(expression);
            if (obj.charAt(0) == '+'){
                double op1 = Double.parseDouble((String)expression.get(i-1));
                double op2 = Double.parseDouble((String)expression.get(i+1));
                int resultop = (int)(op1+op2);
                expression.remove(i-1);
                expression.remove(i-1);
                i--;
                expression.set(i, ""+resultop);
                result = resultop;
            } else if (obj.charAt(0) == '-'){
                double op1 = Double.parseDouble(("" + expression.get(i-1)));
                double op2 = Double.parseDouble((String)expression.get(i+1));
                int resultop = (int)(op1-op2);
                expression.remove(i-1);
                expression.remove(i-1);
                i--;
                expression.set(i, ""+resultop);
                result = resultop;
            }
        }
    }

    public String toString( )
    {
        return expressionStr + " = " + result;
    }
}