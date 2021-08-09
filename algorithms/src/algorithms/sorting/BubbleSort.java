package algorithms.sorting;
public class BubbleSort {

	
	//Validation of the sorting method
	public static void main(String[] args) {
		int[] arr = sort(ArrayUtil.randomArray());
		ArrayUtil.printArray(arr);
	}
	
	/**
	 * Implementation of bubble sort method 
	 * @param data array of integers 
	 * @return 
	 */
	public static int[] sort(int[] data) {
		boolean sorted = true;
		while(sorted) {
			sorted = false;
			for(int i = 1; i < data.length; i++) {
				if(compare(data[i - 1], data[i]) > 0) {
					int temp = data[i - 1];
					data[i - 1] = data[i];
					data[i] = temp;
					sorted = true;
				}
			}
		}
		return data;
	}

	 /**
     * @param data first data to compare
     * @param data2 second data to be compared
     * @return return negative value if the second one is greater
     * return positive value if the first one is greater
     * return 0 if two data are the same 
     */
    public static int compare(int data1, int data2) {
        if(data1 < data2) {
        	return -1;
        }
        else if (data1 > data2) {
        	return 1;
        }
        else {
        	return 0;
        }
    }
    
  
}
