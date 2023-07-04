import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class List_Lab
{
    public static int addList( ArrayList<Integer> list )
    {
        int sum = 0;

        // sum all the elements that are inside list
        for (int item : list){
            sum += item;
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // add in some numbers to the list
        // use a loop and Math.random() (search it up!)
        int noOfValues = (int) (Math.random() * 100);
        for (int i = 0; i < 5; i++){
            nums.add((int) (Math.random() * 100));
        }
        

        // this will take the list named "nums" and pass it into the function "sumList"
        System.out.println( addList( nums ) );     
    }
}
