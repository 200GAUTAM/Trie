import java.util.*;
class Graph {
	private int V;
	private LinkedList<Integer> adj[];

	Graph(int v) {
		V = v;
		adj = new LinkedList<Integer>[V];
		for(int i = 0; i<V; i++) {

			adj[i] = new LinkedList<Integer>()
		}

	}

	void addEdge(int u, int v) {
		add[u].add(v);
	}
	void topoLogicalSort() {
		Stack<Integer> st  = new Stack<Integer>();
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);
		for(int i = 0; i<V; i++) {
			if(visited[i] == false) {
				topologicalUtil(visited, st, i);
			}
		}

	}
	
	void topologicalUtil(boolean[] visited, Stack<Integer> st, int v) {
		visited[v] = true;
		Integer i;
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext()) {
			i = it.Next();
			if(!visited[i]) {
				topologicalUtil(visited, st, i);
			}
		}

		st.push(new Integer(v));		

	}
}