package vishal;

import java.util.Arrays;

public class LargestNumberFromArray {

	private static int[] array = {1, 34, 3, 98, 9, 76, 45, 4};
	private static int LENGTH = array.length;
	public static void main(String[] args) {
		mergeSort(array, 0, LENGTH - 1);
		for(int i = 0; i < LENGTH; i++) {
			System.out.print(array[i]);
		}

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
		int k = 0;
		String str1, str2;
		int number1, number2;
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
		left[left.length - 1] = 0;
		right[right.length - 1] = 0;
		
		while(k != (end - start + 1)) {
			// combine left[i] and right[j] to form a number
			str1 = Integer.toString(left[i]);
			str2 = Integer.toString(right[j]);
			System.out.println(str1+" "+str2);
			number1 = Integer.parseInt(str1+str2);
			number2 = Integer.parseInt(str2+str1);
			// for descending order
			if(number1 > number2) {
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
