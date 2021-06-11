package vishal;

import java.util.Arrays;

public class NormalMergeSort {

	private static int[] array = {3, -1, 0, 6, 0, 5, 9, 10, -7};
	private static final int LENGTH = 9;
	public static void main(String[] args) {
		mergeSort(array, 0, LENGTH - 1);
		System.out.println(Arrays.toString(array));
	}
	
	private static void mergeSort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}
	
	private static void merge(int[] array, int start, int mid, int end) {
		// merge arrays start...mid and mid + 1 ... end
		int i = 0, j = 0;
		// copy elements start to mid in one array, one extra element for infinity
		int[] left = new int[mid - start + 2];
		// end - (mid + 1) + 1 becomes end - mid - 1 + 1
		int[] right = new int[end - mid + 1];
		for(int elem1 = 0; elem1 < left.length - 1; elem1++) {
			left[elem1] = array[start + elem1];
		}
		for(int elem1 = 0; elem1 < right.length - 1; elem1++) {
			right[elem1] = array[mid + 1 + elem1];
		}
		left[left.length - 1] = Integer.MAX_VALUE;
		right[right.length - 1] = Integer.MAX_VALUE;
		int k = 0;
		while(k != (end - start + 1)) {
			if(left[i] < right[j]) {
				array[start + k] = left[i];
				i++;
			}
			else {
				array[start + k] = right[j];
				j++;
			}
			k++;
		}
	}

}
