package vishal;

public class MinimumSumTriangle {
	
	private static int[][] triangle =
		{
				{1},
				{0, 3},
				{2, 6, 5},
				{312, 51, 0, 1}
		};
	private static int minWeight = Integer.MAX_VALUE;
	private static void DFS(int x, int y, int currWeight) {
		if(x < triangle.length - 1) {
			// this node has children, this is not the last level
			DFS(x + 1, y, currWeight + triangle[x+1][y]);
			DFS(x + 1, y + 1, currWeight + triangle[x+1][y+1]);
		}
		else {
			System.out.println("WE ARE AT "+triangle[x][y]);
			// this does not have any more children
			if(currWeight < minWeight) {
				System.out.println("CHANGING MIN WEIGHT TO "+currWeight);
				minWeight = currWeight;
			}
		}
	}
	public static void main(String[] args) {
		DFS(0, 0, triangle[0][0]);
		System.out.println(minWeight);
		
		double n = 7.0;
		int p = (int)n;
		System.out.println(n == p);

	}

}
