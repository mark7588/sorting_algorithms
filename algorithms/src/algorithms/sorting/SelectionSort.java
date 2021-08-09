package algorithms.sorting;

public class SelectionSort {
	
	//User interface to check the sorting method 
	//Can be edited by anyone to verify the method working properly
	public static void main(String[] args) {
		int[] arr = sort(ArrayUtil.randomArray());
		ArrayUtil.printArray(arr);
	}
	
	public static int[] sort(int[] data) {
		int n = data.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int min_idx = i;
			for(int j = i+1; j < n; j++) {
				if(data[j] < data[min_idx]) {
					min_idx = j;
				}
			}
			int temp = data[i];
			data[i] = data[min_idx];
			data[min_idx] = temp;
			}
		return data;
	}
	
	
	

}
