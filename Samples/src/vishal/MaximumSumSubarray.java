package vishal;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int[] array = {-5, 1, -2, 3, -1, 2, -2};
		int tmpSum, tmpMax;
		int maxTillHere = array[0];
		int maxOfMaxTillHere = maxTillHere;
		for(int i = 1; i < array.length; i++) {
			// find out max till array[i]			
			tmpSum = array[i] + maxTillHere;
			// choice 1 is tmpsum
			// choice 2 is array[i] alone
			// choice 3 is maxTillHere alone
			
			maxTillHere = Math.max(tmpSum, array[i]);
			System.out.println("i = "+i+" max till here "+maxTillHere);
			maxOfMaxTillHere = Math.max(maxOfMaxTillHere, maxTillHere);
			
		}
		System.out.println(maxOfMaxTillHere);
	}

}
