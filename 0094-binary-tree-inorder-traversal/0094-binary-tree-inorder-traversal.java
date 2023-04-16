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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
        
    }
    void inorder(TreeNode root,List<Integer>ans){
        if(root==null){
            return;
        }
        Stack<TreeNode>stack=new Stack<>();
        while(stack.isEmpty()==false||root!=null){
            if(root==null){
                root=stack.pop();
                ans.add(root.val);
                root=root.right;
            }
            else{
                stack.push(root);
                root=root.left;
            }
        }
    }
}