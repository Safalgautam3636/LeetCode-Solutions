import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(path, ans, graph, 0);
        return ans;
    }

    void dfs(List<Integer> path, List<List<Integer>> ans, int[][] graph, int start) {
        path.add(start);
        if (start == graph.length - 1) {
            ans.add(new ArrayList<>(path)); // Make a copy of the path before adding
            return;
        } else {
            for (int x : graph[start]) {
                dfs(new ArrayList(path), ans, graph, x);
            }
        }
        path.remove(path.size() - 1);
    }
}
