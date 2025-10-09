import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // If source is the destination, a path trivially exists.
        if (source == destination) {
            return true;
        }

        // 1. Build the adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // --- OPTIMIZATIONS START HERE ---

        // 2. Use a boolean array for O(1) visited checks
        boolean[] visited = new boolean[n];
        
        // 3. Perform BFS
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(source);
        visited[source] = true; // Mark as visited WHEN you add to queue

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adj.get(u)) {
                // If we found the destination, we are done!
                if (v == destination) {
                    return true;
                }
                
                // Use O(1) array access instead of O(n) list.contains()
                if (!visited[v]) {
                    visited[v] = true; // Mark as visited before adding
                    queue.add(v);
                }
            }
        }

        // 4. If the loop finishes and we haven't found the destination, no path exists.
        return false;
    }
}