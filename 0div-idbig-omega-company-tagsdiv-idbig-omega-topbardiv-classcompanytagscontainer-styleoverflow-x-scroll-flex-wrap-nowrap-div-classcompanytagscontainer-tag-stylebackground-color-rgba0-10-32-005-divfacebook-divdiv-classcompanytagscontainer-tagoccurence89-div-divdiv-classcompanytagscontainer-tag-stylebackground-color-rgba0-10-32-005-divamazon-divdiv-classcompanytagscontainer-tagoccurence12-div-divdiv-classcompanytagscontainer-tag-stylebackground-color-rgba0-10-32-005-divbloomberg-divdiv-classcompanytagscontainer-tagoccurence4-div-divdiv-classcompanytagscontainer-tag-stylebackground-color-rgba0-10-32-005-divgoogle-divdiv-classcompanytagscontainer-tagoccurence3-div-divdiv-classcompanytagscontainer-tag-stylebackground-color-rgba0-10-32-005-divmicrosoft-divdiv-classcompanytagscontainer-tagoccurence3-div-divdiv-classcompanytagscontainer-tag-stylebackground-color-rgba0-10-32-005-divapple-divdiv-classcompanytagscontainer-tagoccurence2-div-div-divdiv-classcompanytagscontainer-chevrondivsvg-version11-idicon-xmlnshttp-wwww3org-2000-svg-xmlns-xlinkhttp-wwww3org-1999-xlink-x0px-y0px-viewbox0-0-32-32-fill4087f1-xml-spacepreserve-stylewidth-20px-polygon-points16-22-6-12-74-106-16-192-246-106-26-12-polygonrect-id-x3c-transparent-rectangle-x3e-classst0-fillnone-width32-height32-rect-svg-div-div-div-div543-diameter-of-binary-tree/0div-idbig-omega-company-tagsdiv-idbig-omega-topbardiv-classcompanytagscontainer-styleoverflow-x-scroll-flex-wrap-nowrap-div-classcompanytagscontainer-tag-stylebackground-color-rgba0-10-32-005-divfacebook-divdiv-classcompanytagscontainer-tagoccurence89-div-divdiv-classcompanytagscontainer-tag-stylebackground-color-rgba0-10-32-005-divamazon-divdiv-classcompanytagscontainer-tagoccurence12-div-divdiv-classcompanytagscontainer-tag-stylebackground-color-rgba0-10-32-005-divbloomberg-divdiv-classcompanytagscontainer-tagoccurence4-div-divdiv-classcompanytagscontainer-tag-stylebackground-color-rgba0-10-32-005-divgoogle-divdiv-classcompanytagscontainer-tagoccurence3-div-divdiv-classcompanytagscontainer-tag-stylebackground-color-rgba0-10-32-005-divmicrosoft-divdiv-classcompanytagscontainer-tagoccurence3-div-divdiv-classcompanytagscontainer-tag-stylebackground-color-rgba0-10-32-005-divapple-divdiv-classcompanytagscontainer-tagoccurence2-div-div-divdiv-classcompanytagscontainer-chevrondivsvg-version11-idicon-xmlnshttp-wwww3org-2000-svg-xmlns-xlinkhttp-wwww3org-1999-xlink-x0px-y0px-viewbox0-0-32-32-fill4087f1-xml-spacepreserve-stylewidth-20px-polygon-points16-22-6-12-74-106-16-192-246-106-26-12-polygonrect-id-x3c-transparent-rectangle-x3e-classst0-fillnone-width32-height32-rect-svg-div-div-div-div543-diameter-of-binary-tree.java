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
    int ans=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        height(root);
        return ans;
    }
    private int height(TreeNode root){
        if(root==null)return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        ans=Math.max(ans,leftHeight+rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    }
}