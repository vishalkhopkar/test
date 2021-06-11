package vishal;

import java.util.Arrays;

public class QuickSort {

	/**
	 * idea:
	 * 1. find a pivot element at every step
	 */
	private static int[] array = {4, -5, 6, 1, 0, -10, 4, 5, 3, 9};
	
	private static int partition(int start, int end) {
		int x = array[end];
		int tmp;
		int i = start - 1;
		for(int j = start; j < end; j++) {
			if(array[j] <= x) {
				i++;
				// swap array[i], array[j]
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
			}
		}
		// swap array[i+1], array[end]
		tmp = array[i+1];
		array[i+1] = array[end];
		array[end] = tmp;
		System.out.println("FOUND PARTITION "+array[i+1]);
		return (i+1);
	}
	private static void quicksort(int start, int end) {
		if(start < end) {
			int partition = partition(start, end);
			//partition is the index
			quicksort(start, partition - 1);
			quicksort(partition + 1, end);
			
		}
	}
	public static void main(String[] args) {
		quicksort(0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

}
