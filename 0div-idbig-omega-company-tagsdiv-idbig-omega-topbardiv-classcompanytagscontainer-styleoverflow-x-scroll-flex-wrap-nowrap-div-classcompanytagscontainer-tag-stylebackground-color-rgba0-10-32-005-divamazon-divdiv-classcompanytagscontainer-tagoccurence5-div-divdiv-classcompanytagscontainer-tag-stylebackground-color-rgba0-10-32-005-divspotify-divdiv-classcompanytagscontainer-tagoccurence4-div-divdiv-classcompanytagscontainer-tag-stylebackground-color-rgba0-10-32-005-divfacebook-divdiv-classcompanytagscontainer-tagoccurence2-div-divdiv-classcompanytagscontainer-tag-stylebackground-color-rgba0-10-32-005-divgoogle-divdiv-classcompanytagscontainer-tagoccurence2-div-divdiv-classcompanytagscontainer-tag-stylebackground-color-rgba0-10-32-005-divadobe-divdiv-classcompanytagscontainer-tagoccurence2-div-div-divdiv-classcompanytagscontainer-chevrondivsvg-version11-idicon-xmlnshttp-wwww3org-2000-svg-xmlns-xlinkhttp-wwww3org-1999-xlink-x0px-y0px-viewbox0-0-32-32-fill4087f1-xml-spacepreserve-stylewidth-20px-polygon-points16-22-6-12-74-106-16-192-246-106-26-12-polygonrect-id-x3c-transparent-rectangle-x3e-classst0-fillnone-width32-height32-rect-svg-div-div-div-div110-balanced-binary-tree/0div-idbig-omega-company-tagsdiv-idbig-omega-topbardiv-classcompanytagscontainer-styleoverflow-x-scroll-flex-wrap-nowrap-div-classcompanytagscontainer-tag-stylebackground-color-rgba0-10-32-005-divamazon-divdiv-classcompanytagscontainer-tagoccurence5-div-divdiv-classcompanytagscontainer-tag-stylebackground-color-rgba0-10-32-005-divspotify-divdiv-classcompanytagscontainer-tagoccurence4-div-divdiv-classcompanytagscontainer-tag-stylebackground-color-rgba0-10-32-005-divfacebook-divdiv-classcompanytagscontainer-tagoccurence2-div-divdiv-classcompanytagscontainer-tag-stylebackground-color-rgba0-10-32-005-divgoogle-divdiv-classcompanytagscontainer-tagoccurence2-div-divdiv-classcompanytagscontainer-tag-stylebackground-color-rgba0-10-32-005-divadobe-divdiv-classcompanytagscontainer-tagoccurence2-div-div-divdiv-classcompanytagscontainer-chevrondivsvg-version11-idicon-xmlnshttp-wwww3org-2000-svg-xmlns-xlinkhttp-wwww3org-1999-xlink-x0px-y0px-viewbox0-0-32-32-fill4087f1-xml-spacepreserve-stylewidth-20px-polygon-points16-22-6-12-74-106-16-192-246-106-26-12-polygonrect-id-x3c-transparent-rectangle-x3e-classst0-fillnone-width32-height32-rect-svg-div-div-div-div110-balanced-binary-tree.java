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
    boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        findDepth(root);
        return ans;
    }
    int findDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=findDepth(root.left);
        int right=findDepth(root.right);
        if(Math.abs(left-right)>1){
            ans=false;
        }
        return 1+Math.max(left,right);
    }
    
}