package vishal;

public class DetectionOfCycles {
	/*
	 * Logic:
	 * Do DFS, at any point of time
	 * if you realise that you have a grey neighbour,
	 * it means there is a cycle
	 */
	private static final int NO_OF_VERTICES = 7;
	private static int unVisitedCount = NO_OF_VERTICES;
	private static int[] colour = new int[NO_OF_VERTICES];
	private static int noOfCycles = 0;
	/*
	private static int graph[][] = {
			{1, 7},
			{2, 7},
			{5},
			{2, 4},
			{5},
			{},
			{7},
			{},
			{}
			
	};*/
	private static int graph[][] = {
			{1},
			{2},
			{3},
			{0, 4},
			{5},
			{6},
			{2}
	};
	public static void main(String[] args) {
		while(unVisitedCount!=0) {
			//pick the first unvisited vertex
			int firstUnvisited = findFirstUnvisited();
			if(firstUnvisited == -1) break;
			DFS(firstUnvisited);
		}
		System.out.println("NO OF CYCLES "+noOfCycles);

	}
	private static int findFirstUnvisited() {
		for(int i=0;i<NO_OF_VERTICES;i++) {
			if(colour[i] == 0) return i;
		}
		
		return -1;
	}
	private static void DFS(int vertex) {
		// now this vertex is made grey
		colour[vertex] = 1;
		// call DFS for all of its neighbours
		
		for(int v: graph[vertex]) {
			if(colour[v] == 1) {
				//grey
				System.out.println("CYCLE DETECTED");
				noOfCycles++;
				
			}
			if (colour[v] == 0)
				DFS(v);
		}
		colour[vertex] = 2; //black
		unVisitedCount--;
		
		
		
		
	}

}
