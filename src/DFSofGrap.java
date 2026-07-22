import java.util.*;
class DFSofGraph {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        recu(0, adj, visited, result);
        return result;
    }
    void recu(int node, ArrayList<ArrayList<Integer>> adj,
              boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int a : adj.get(node)) {
            if (!visited[a]) {
                recu(a, adj, visited, result);
            }
        }
    }
}