package vishal;

public class BTVisibles {
	class Tree {
		  public int x;
		  public Tree l;
		  public Tree r;
		}
	int noOfVisibles = 0;
    private void countVisibles(Tree T, int currMax){
        if(T.x >= currMax){
            noOfVisibles++;
            currMax = T.x;
        }
        if(T.l != null)
        	countVisibles(T.l, currMax);
        if(T.r != null)
        	countVisibles(T.r, currMax);
    }
	public int Solution(Tree T) {
		countVisibles(T, Integer.MIN_VALUE);
        return noOfVisibles;
	}
	
	public static void main(String[] args) {
		
	}
}
