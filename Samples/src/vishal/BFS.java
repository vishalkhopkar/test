package vishal;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	//in the form of an adjacency list

	private static int[][] graph = {
			{1, 3, 4, 5},
			{0, 2, 4},
			{1, 3, 4, 5},
			{0, 2, 5},
			{0, 1, 2},
			{0, 2, 3}
	};
	private static void BFS() {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[6];
		 //add the first vertex
		q.add(0);
		while(!q.isEmpty()) {
			int curr = q.poll();
			System.out.println(curr);
			//add all neighbours of curr to the queue
			for(int i=0;i<graph[curr].length; i++) {
				if(!visited[graph[curr][i]])
					q.add(graph[curr][i]);
			}
			System.out.println(q);
			visited[curr] = true;
		}
	}
	public static void main(String[] args) {
		BFS();

	}

}
