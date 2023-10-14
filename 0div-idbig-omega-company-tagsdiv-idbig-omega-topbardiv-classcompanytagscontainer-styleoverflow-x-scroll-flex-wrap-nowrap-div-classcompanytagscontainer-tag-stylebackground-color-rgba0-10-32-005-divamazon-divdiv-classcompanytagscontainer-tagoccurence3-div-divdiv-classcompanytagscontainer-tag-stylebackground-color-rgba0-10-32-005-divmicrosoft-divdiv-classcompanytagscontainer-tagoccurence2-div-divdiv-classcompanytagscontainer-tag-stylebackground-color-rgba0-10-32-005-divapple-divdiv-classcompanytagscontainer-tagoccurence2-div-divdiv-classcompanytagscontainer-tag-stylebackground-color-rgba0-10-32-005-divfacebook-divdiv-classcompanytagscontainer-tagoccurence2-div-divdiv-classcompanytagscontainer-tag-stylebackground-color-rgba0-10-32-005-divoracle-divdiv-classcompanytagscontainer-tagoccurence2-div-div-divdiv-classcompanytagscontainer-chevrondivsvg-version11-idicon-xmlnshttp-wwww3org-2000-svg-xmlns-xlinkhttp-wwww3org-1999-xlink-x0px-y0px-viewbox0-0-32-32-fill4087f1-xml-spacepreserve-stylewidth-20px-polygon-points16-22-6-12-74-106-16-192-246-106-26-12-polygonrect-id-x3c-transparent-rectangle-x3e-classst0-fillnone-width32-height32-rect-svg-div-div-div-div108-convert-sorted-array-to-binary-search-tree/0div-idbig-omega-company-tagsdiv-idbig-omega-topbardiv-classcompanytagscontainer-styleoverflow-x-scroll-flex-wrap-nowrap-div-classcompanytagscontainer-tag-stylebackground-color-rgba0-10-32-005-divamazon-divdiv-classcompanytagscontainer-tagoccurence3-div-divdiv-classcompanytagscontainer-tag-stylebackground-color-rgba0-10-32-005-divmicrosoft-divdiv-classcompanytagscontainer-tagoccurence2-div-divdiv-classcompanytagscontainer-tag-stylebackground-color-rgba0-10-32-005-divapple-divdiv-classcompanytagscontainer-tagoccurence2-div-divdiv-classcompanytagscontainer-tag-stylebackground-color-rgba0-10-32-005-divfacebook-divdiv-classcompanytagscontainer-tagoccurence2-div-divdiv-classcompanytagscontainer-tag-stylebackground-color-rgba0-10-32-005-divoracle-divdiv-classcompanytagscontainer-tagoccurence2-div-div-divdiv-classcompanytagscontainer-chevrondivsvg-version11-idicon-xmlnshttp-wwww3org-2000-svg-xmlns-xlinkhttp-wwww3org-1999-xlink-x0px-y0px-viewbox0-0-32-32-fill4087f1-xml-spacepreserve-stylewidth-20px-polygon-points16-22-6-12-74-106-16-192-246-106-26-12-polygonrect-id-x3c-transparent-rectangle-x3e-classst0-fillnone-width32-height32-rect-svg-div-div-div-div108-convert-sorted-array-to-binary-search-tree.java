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
    public TreeNode sortedArrayToBST(int[] nums) {
        return noderComputer(nums,0,nums.length-1);
    }
    TreeNode noderComputer(int[]nums,int i,int j){
        if(i<=j){
            int mid=(i+j)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=noderComputer(nums,i,mid-1);
            root.right=noderComputer(nums,mid+1,j);
            return root;
        }
        
        return null;
        
    }
}