package vishal;

import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
	private static final int NO_OF_VERTICES = 8;
	private static int unVisitedCount = NO_OF_VERTICES;
	private static boolean[] visited = new boolean[NO_OF_VERTICES];
	private static int[] colour = new int[NO_OF_VERTICES];
	private static int[][] graph = {
			{1, 2},
			{0, 2},
			{0, 1, 3, 5},
			{2, 4, 6},
			{3, 7},
			{2},
			{3},
			{4}
	};
	public static void main(String[] args) {
		while(unVisitedCount!=0) {
			//pick the first unvisited vertex
			int firstUnvisited = findFirstUnvisited();
			if(firstUnvisited == -1) break;
			BFS(firstUnvisited);
		}

	}
	private static int findFirstUnvisited() {
		for(int i=0;i<NO_OF_VERTICES;i++) {
			if(!visited[i]) return i;
		}
		
		return -1;
	}
	private static void BFS(int vertex) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		 //add the first vertex
		q.add(vertex);
		colour[vertex] = 1; //red
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.println(curr);
			//add all neighbours of curr to the queue
			for(int v : graph[curr]) {
				if(colour[v]!=0 && colour[v] == colour[curr]) {
					// not bipartite
					System.out.println("NOT A BIPARTITE GRAPH");
				}
				if(colour[v] == 0) {
					//white
					q.add(v);
					if(colour[curr] == 1) {
						colour[v] =2;
					}
					else colour[v] = 1;
				}
					
			}
			//System.out.println(q);
			visited[curr] = true;
			unVisitedCount --;
		}
	}

}
