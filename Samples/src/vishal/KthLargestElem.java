package vishal;

public class KthLargestElem {
	private static int[] array = {4, -5, 6, 1, 0, -10, 4, 5, 3, 9};
	private static int ret;
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
	private static void quicksort(int start, int end, int k) {
		if(start < end) {
			int partition = partition(start, end);
			if(partition == (array.length - k)) {
				ret = array[partition];
				return;
			}
			//partition is the index
			
			quicksort(start, partition - 1, k);
			quicksort(partition + 1, end, k);
			
		}
	}
	public static void main(String[] args) {
		quicksort(0, array.length - 1, 3);

	}

}
