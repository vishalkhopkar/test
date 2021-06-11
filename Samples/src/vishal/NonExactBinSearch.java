package vishal;

public class NonExactBinSearch {

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

	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, 9, 11, 15, 23};
		System.out.println(binarySearch(numbers, 0, numbers.length - 1, 38));

	}

}
