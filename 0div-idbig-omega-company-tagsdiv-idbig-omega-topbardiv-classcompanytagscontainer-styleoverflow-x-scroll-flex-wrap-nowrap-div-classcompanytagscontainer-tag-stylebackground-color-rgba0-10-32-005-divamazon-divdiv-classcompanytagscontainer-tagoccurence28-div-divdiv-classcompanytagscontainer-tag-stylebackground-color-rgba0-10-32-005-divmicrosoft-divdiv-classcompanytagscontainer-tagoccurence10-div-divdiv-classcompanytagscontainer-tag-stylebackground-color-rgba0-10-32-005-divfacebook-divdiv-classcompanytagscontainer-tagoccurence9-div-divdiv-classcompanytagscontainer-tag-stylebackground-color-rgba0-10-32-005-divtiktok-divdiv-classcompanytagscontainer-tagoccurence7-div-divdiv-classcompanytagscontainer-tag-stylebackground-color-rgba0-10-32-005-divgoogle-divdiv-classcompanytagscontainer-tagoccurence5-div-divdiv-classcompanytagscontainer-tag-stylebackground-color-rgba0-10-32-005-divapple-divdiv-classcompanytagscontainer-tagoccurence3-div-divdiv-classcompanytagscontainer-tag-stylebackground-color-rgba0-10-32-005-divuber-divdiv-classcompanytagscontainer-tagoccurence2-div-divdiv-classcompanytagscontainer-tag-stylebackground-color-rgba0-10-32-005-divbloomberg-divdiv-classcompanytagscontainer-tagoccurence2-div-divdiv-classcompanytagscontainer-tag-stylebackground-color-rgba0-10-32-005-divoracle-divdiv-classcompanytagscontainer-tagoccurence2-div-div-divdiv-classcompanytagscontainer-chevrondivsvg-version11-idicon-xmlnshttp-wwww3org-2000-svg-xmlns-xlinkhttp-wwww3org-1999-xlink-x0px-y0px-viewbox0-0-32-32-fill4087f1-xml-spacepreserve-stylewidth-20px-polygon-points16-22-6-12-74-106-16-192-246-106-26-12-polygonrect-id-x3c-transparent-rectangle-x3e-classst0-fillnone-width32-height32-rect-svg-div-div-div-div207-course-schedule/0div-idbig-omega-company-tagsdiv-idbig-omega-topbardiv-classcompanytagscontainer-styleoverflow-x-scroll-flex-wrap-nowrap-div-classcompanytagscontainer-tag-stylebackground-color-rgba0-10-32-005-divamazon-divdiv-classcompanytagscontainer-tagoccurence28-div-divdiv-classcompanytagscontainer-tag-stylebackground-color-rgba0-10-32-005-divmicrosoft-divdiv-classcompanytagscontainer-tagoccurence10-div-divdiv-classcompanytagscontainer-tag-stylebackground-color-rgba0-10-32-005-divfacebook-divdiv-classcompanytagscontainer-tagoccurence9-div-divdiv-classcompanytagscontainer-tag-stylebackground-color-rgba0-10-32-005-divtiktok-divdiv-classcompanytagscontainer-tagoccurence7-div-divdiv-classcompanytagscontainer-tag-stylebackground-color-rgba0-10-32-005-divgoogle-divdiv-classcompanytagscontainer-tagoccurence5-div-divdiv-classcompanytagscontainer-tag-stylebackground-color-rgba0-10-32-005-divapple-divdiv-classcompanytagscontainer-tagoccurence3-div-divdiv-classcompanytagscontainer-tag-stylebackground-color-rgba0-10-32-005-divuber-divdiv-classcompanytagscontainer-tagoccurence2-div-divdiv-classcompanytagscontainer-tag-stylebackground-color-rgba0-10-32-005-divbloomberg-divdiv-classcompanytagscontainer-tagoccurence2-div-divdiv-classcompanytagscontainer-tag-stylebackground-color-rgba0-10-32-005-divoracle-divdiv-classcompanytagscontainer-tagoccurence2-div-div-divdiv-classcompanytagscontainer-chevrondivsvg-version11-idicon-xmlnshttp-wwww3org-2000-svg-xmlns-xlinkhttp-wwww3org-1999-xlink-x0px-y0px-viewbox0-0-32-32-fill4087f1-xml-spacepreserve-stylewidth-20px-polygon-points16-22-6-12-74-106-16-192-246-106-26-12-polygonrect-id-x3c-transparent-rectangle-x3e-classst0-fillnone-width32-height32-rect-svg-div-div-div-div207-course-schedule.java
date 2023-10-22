class Solution {
    boolean dfsCheck(int node, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
        vis[node] = true;
        path[node] = true;
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                if (dfsCheck(it, adj, vis, path))
                    return true;
            } else if (path[it]) {
                return true;
            }
        }
        path[node] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adj.get(prereq[0]).add(prereq[1]);
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (dfsCheck(i, adj, vis, path))
                    return false;
            }
        }
        return true;
    }
}
