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
    int ctr=0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return ans;
    }
    void traverse(TreeNode root,int k){
        if(root==null)return;
        traverse(root.left,k);
        ctr++;
        if(k==ctr){
            ans=root.val;
            traverse(null,0);
        }
        traverse(root.right,k);
    }
}