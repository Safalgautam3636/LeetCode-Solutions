/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int curr=root.val;
        if(p.val<curr&&q.val<curr){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val>curr&&q.val>curr){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}