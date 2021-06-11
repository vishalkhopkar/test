package vishal;

import java.util.Arrays;

public class TwoSum {

	private static int binarySearch(int[] numbers, int left, int right, int key) {
		System.out.println("BS("+left+", "+right+")");
        if(left == right){
        	// only 1 number remaining
        	if(numbers[left] <= key)
        		return left;
        	else
        		return -1;
        }
        if(left > right){
            return -1;
        }
        int mid = (left + right)/2 + 1;
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] > key) {
        	int leftBinSearch = binarySearch(numbers, left, mid-1, key);
        	if(leftBinSearch > -1){
                return leftBinSearch;
            }
        	
        	
        }      
        else {
        	int rightBinSearch = binarySearch(numbers, mid, right, key);
            if(rightBinSearch > -1){
                return rightBinSearch;
            }
        }
        
        
        return -1;
    }
	
	private static int[] twoSumTillIndex(int[] numbers, int index, int target) {
		int right = index, left = 0;
		int[] ret = new int[2];
		while(true) {
			int sum = numbers[left] + numbers[right];
			if(sum == target) {
				ret[0] = left;
				ret[1] = right;
				break;
			}
			else if(sum > target) {
				right--;
				left = 0;
			}
			else {
				left++;
				if(left == right) {
					// should not occur
				}
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, 9, 11, 15, 23};
		int target = 38;
		int index = binarySearch(numbers, 0, numbers.length -1, target);
		System.out.println(Arrays.toString(twoSumTillIndex(numbers, index, target)));

	}

}
