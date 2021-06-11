package vishal;

import java.util.Arrays;
import java.util.Comparator;


class ArrayComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {		
		return ArrayIndicesSort.arr[o1] - ArrayIndicesSort.arr[o2];
	}
	
}
public class ArrayIndicesSort {
	static int[] arr = {3, 4, -1, 4, 0, 9, 7};
	static Integer[] indArr;
	public static void main(String[] args) {
		// fill indArr with indices from 0 to arr.length - 1
		indArr = new Integer[arr.length];
		for(int i = 0; i < arr.length; i++) {
			indArr[i] = i;
		}
		
		Arrays.sort(indArr, new ArrayComparator());
		System.out.println(Arrays.toString(indArr));

	}

}
