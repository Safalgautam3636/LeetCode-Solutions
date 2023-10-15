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
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean valid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(min!=Long.MAX_VALUE&&root.val<=min){
            return false;
        }
        if(max!=Long.MIN_VALUE&&root.val>=max){
            return false;
        }
        return valid(root.left, min, root.val)&&valid(root.right, root.val, max);
    }
}