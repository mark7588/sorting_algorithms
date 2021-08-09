package algorithms.sorting;

import java.util.Random;

/**
 * Contains helper method related to array 
 * @author taejoonkim
 */
public class ArrayUtil {
	
	// Print all of the elements in the array
	public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	
	// Generate an array consisted of random integers
	public static int[] randomArray() {
		  Random rd = new Random(); // creating Random object
	      int[] arr = new int[10];
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = rd.nextInt(100); // storing random integers in an array
	      }
		return arr;
	}
}
