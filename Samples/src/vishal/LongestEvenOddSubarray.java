package vishal;

public class LongestEvenOddSubarray {

	public static void main(String[] args) {
		int[] array = {3, 4, 5, 1, 14, 0, 3, 12, 5, 8, 44};
		int maxLength = 0, currLength = 1;
		boolean expectation;
		for(int i = 1; i < array.length; i++) {
			if((array[i] + array[i - 1]) % 2 != 0) {
				// alternating
				currLength++;
			}
			else {
				maxLength = Math.max(maxLength, currLength);
				currLength = 1;
			}
			System.out.println("i = "+i+" currlength = "+currLength+" maxLength "+maxLength);
		}
		maxLength = Math.max(maxLength, currLength);
		System.out.println(maxLength);
	}

}
