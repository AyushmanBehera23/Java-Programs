import java.util.*;

public class UndirectedGraphCycle {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                Queue<Pair> q = new LinkedList<>();

                q.offer(new Pair(i, -1));
                visited[i] = true;

                while (!q.isEmpty()) {

                    Pair current = q.poll();

                    int node = current.node;
                    int parent = current.parent;

                    for (int neighbor : adj.get(node)) {

                        if (!visited[neighbor]) {

                            visited[neighbor] = true;
                            q.offer(new Pair(neighbor, node));

                        } else if (neighbor != parent) {

                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1);
        adj.get(1).add(3);

        adj.get(3).add(4);
        adj.get(4).add(3);

        if (isCycle(adj)) {
            System.out.println("Cycle Found");
        } else {
            System.out.println("No Cycle");
        }
    }
}