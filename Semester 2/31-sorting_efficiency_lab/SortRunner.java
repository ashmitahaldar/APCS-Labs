import java.util.Arrays;
import java.util.Date;

public class SortRunner
{
    public static void main(String[] args)
    {
        Sorts s = new Sorts();
        // making arrays for trial 1
        int[] array11 = new int[100000];
        for (int i = 0; i < 100000; i++)
        {
            array11[i] = i;
        }
        
        array11 = Sorts.shuffle(array11);
        
        int[] array12 = new int[100000];
        for (int i = 0; i < 100000; i++)
        {
            array12[i] = array11[i];
        }
        
        int[] array13 = new int[100000];
        for (int i = 0; i < 100000; i++)
        {
            array13[i] = array11[i];
        }
        
        // Random array test
        System.out.println("Random array \n ----------");
        // Selection
        long timeStart = System.currentTimeMillis();
        Sorts.selectionSort(array11);
        long timeEnd = System.currentTimeMillis();
        long timeTaken = timeEnd - timeStart;
        System.out.println("Selection time: " + timeTaken + "MS");
        
        // insertion
        timeStart = System.currentTimeMillis();
        Sorts.insertionSort(array12);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Insertion time: " + timeTaken + "MS");
        
        // merge
        timeStart = System.currentTimeMillis();
        Sorts.mergeSort(array13, 0, array13.length-1);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Merge time: " + timeTaken + "MS \n");
        
        
        // Sorted array test
        System.out.println("Sorted array \n ----------");
        // Selection
        timeStart = System.currentTimeMillis();
        Sorts.selectionSort(array11);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Selection time: " + timeTaken + "MS");
        
        // insertion
        timeStart = System.currentTimeMillis();
        Sorts.insertionSort(array12);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Insertion time: " + timeTaken + "MS");
        
        // merge
        timeStart = System.currentTimeMillis();
        Sorts.mergeSort(array13, 0, array13.length-1);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Merge time: " + timeTaken + "MS \n");
        
        
        // making arrays for trial 3
        int[] array21 = new int[100000];
        for (int i = 99999; i >= 0; i--)
        {
            array21[99999-i] = i;
        }
        
        int[] array22 = new int[100000];
        for (int i = 0; i < 100000; i++)
        {
            array22[i] = array21[i];
        }
        
        int[] array23 = new int[100000];
        for (int i = 0; i < 100000; i++)
        {
            array23[i] = array21[i];
        }
        // Backwards array test
        System.out.println("Backwards array \n ----------");
        // Selection
        timeStart = System.currentTimeMillis();
        Sorts.selectionSort(array21);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Selection time: " + timeTaken + "MS");
        
        // insertion
        timeStart = System.currentTimeMillis();
        Sorts.insertionSort(array22);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Insertion time: " + timeTaken + "MS");
        
        // merge
        timeStart = System.currentTimeMillis();
        Sorts.mergeSort(array23, 0, array23.length-1);
        timeEnd = System.currentTimeMillis();
        timeTaken = timeEnd - timeStart;
        System.out.println("Merge time: " + timeTaken + "MS\n\n");
    }
}
