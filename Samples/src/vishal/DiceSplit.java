package vishal;

import java.lang.annotation.Retention;
import java.util.Arrays;

public class DiceSplit {
	public int[] solution(int[] A, int F, int M) {
		int[] retErr = {0};
		int[] ret = new int[F];
		int sumA = 0;
		// find sum of all elems of A
		for(int i=0;i<A.length;i++) {
			sumA += A[i];
		}
		// find the remaining sum
        int remSum = M*(A.length + F) - sumA;
        
        // we need to split remSum into F different elems where each elem can be >=1, <=6
        if(remSum > 6*F) {
        	// not possible
        	return retErr;
        	
        }
        if(remSum < F) {
        	// not possible with all 1s
        	return retErr;
        	
        }
        return split(remSum, F);
        
    }
	private int[] split(int remSum, int F) {
		int[] retErr = {0};
		int[] ret = new int[F];
		int bachaSum = remSum;
        int firstRemSpace = 0;
        while(bachaSum != 0) {
        	int res = bachaSum % (F - firstRemSpace);
        	double quo = (double)bachaSum/(double)(F - firstRemSpace);
        	if(res == 0 && quo <= 6) {
        		// fill all remaining spaces with quo
        		for(int i = firstRemSpace; i < F; i++) {
        			ret[i] = (int)quo;
        			
        		}
        		bachaSum = 0;
        		return ret;
        	}
        	else {
        		// quo cannot be an integer here
        		int ceil = (int) Math.ceil(quo);
        		System.out.println("CEIL NOW "+ceil);
        		// if quo == 1.667, ceil will be 2
        		// first ceil in the firstRemSpace
        		ret[firstRemSpace] = ceil;
        		firstRemSpace++;
        		bachaSum -= ceil;
        		System.out.println("BACHA SUM NOW "+bachaSum);
        	}
        }
        //not possible
        return retErr;
	}
	public static void main(String[] args) {
		DiceSplit d = new DiceSplit();
		System.out.println(Arrays.toString(d.split(42, 9)));

	}

}
