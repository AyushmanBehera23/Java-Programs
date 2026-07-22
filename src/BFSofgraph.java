import java.util.*;

class BFSofgraph {

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        int v = adj.size();

        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visit = new boolean[v];

        q.add(0);
        visit[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            ans.add(node);

            for (int neighbor : adj.get(node)) {

                if (!visit[neighbor]) {
                    visit[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return ans;
    }
}