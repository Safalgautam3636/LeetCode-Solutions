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
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[]{0}; // Initialize the result to 0
        depth(root, result);
        return result[0];
    }
    
    public int depth(TreeNode root, int[] result) {
        if (root == null) {
            return 0;
        }
        
        int left = depth(root.left, result);
        int right = depth(root.right, result);
        
        // Calculate the diameter through the current node
        result[0] = Math.max(result[0], left + right);
        
        // Return the depth of the current node
        return 1 + Math.max(left, right);
    }
}
