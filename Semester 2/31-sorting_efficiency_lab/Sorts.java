import java.util.Arrays;
import java.util.Random;

public class Sorts
{
    public static void insertionSort(int[] array)
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void selectionSort(int[] array)
    {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) 
                if (array[j] < array[min_idx]) min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void mergeSort(int[] array, int front, int back)
    {
        int mid = (front+back)/2;
        if(mid==front) return;
        mergeSort(array, front, mid);
        mergeSort(array, mid, back);
        merge(array, front, back);

    }

    public static void merge(int[] array, int front, int back)
    {
        int dif = back-front, spot = 0;
        int[] temp = new int[ dif ];
        int beg = front, mid = (front+back)/2, saveMid = mid;
        while( beg<saveMid && mid<back ) {
            if(array[ beg ] < array[ mid ])
            temp[ spot++ ]= array[ beg++ ];
            else
            temp[ spot++ ]= array[ mid++ ];
        }        
        while( beg < saveMid ) 
            temp[ spot++ ]= array[ beg++ ];
        while( mid < back ) 
            temp[ spot++ ]= array[ mid++ ];
        for(int i = 0; i < dif; ++i)
            array[front+i]=temp[i];

    }

    public static int[] shuffle(int[] array)
    {
        Random rand = new Random();
	for (int i = 0; i < array.length; i++) {
		int randomIndexToSwap = rand.nextInt(array.length);
		int temp = array[randomIndexToSwap];
		array[randomIndexToSwap] = array[i];
		array[i] = temp;
		}
	return array;
	}
    }

