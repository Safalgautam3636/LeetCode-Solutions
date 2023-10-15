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
    public void flatten(TreeNode root) {
        if(root==null)return;
        TreeNode trackerPointer=root;
        
        while(trackerPointer!=null){
            TreeNode leftPointer=trackerPointer.left;
            if(leftPointer!=null){
                TreeNode rightPointer=leftPointer;
                while(rightPointer.right!=null){
                    rightPointer=rightPointer.right;
                }
                rightPointer.right=trackerPointer.right;
                trackerPointer.right=leftPointer;
                trackerPointer.left=null;
            }
            trackerPointer=trackerPointer.right;
        }
    }
}