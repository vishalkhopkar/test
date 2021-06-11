package vishal;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TopologicalSort {
	private static final int NO_OF_VERTICES = 4;
	private static boolean[] visited = new boolean[NO_OF_VERTICES];
	private static int unVisitedCount = NO_OF_VERTICES;
	private static LinkedList<Integer> sorted = new LinkedList<Integer>();
	private static int graph[][] = {
			{1},
			{},
			{1},
			{0, 2}
			
	};
	public static void main(String[] args) {
		while(unVisitedCount!=0) {
			//pick the first unvisited vertex
			int firstUnvisited = findFirstUnvisited();
			if(firstUnvisited == -1) break;
			DFS(firstUnvisited);
		}
		System.out.println(sorted);

	}
	
	private static int findFirstUnvisited() {
		for(int i=0;i<NO_OF_VERTICES;i++) {
			if(!visited[i]) return i;
		}
		
		return -1;
	}
	private static void DFS(int vertex) {
		// now this vertex is made grey
		// call DFS for all of its neighbours
		for(int v: graph[vertex]) {
			if (!visited[v])
				DFS(v);
		}
		visited[vertex] = true;
		unVisitedCount--;
		sorted.addFirst(vertex);
		
		
		
	}

}
