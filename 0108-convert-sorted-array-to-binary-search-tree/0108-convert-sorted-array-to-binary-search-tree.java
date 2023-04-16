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
        return sort(nums,0,nums.length-1);
    }
    TreeNode sort(int[]nums,int left,int right){
        if(left<=right){
            int mid=left+(right-left)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=sort(nums,left,mid-1);
            root.right=sort(nums,mid+1,right);
            return root;
        }
        return null;
        
    }
}