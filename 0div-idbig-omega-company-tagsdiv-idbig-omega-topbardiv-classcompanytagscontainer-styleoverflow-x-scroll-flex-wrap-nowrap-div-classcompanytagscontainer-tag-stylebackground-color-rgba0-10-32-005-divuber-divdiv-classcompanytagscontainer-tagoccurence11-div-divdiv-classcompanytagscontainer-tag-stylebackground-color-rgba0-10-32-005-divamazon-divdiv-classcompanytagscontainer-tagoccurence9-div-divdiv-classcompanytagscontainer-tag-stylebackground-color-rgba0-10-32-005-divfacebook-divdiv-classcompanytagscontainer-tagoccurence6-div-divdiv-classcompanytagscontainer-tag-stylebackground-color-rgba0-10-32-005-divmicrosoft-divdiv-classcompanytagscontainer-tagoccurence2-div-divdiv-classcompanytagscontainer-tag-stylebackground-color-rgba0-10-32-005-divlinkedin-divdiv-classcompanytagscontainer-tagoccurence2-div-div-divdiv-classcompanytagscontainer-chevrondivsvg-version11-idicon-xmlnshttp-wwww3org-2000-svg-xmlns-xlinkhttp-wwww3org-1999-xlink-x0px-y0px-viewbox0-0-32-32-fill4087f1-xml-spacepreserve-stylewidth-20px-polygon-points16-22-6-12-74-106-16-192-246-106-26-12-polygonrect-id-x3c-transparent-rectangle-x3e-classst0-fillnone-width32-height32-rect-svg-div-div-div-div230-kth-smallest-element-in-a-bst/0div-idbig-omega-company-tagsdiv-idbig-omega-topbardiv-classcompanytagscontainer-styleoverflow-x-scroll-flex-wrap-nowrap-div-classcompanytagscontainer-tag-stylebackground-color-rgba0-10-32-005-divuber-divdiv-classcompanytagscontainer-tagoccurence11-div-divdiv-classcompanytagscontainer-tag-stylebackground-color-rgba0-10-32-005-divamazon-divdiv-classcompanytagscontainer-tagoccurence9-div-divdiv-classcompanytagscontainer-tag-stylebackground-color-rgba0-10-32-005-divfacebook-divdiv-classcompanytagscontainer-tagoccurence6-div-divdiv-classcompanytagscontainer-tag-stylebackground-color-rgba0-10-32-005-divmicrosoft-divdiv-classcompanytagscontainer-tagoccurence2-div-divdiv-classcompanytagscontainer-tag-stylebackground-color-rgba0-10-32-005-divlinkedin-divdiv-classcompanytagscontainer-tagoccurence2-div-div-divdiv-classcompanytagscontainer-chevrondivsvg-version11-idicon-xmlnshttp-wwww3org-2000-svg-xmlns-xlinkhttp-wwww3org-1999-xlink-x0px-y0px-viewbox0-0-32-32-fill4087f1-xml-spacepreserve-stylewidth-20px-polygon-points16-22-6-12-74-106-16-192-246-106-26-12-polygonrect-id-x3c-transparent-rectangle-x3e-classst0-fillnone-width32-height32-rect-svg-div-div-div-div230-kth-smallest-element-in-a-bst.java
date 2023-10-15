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
    int counter=1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    void inorder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        if(counter==k){
            ans=root.val;
        }
        counter++;
        inorder(root.right,k);
        
    }
}