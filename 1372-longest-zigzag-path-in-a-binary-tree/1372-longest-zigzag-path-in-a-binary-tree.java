/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     int ans=0;
    public int longestZigZag(TreeNode root) {
        
        if(root.left==null&&root.right==null){
            return 0;
        }
            dfs(root.left,true,1);
            dfs(root.right,false,1);
        return ans;
    }
    void dfs(TreeNode root,boolean left,int go){
        if(root==null)return;
        ans=Math.max(go,ans);
        if(left){
            dfs(root.right,false,go+1);
            dfs(root.left,true,1);
        }
        else{
            dfs(root.left,true,go+1);
            dfs(root.right,false,1);
        }
    }
}