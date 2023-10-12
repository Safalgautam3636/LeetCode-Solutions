// *
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root!=null){
            if(Math.abs(findDepth(root.left)-findDepth(root.right))>1){
                return false;
            }
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    int findDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(findDepth(root.left),findDepth(root.right));
    }
    
}