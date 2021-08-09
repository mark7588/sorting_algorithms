package algorithms.sorting;

import java.util.Random;

public class InsertionSort {
	
	
	//Validation of the sorting method 
	public static void main(String[] args) {
		int[] arr = sort(ArrayUtil.randomArray());
		ArrayUtil.printArray(arr);
	}
	
	/**
	 * Implementation of insertion sort  
	 * @param data array of integers 
	 * @return 
	 */
	public static int[] sort(int[] data) {
		for(int i = 1; i < data.length; i++) {
			int preIndex = i-1;
			int current = data[i];
			while(preIndex >= 0 && data[preIndex] > current) {
				data[preIndex + 1] = data[preIndex];
				preIndex -= 1;
			}
			data[preIndex + 1] = current;
		}
		return data;
		
	}
	
	

	 
}	
