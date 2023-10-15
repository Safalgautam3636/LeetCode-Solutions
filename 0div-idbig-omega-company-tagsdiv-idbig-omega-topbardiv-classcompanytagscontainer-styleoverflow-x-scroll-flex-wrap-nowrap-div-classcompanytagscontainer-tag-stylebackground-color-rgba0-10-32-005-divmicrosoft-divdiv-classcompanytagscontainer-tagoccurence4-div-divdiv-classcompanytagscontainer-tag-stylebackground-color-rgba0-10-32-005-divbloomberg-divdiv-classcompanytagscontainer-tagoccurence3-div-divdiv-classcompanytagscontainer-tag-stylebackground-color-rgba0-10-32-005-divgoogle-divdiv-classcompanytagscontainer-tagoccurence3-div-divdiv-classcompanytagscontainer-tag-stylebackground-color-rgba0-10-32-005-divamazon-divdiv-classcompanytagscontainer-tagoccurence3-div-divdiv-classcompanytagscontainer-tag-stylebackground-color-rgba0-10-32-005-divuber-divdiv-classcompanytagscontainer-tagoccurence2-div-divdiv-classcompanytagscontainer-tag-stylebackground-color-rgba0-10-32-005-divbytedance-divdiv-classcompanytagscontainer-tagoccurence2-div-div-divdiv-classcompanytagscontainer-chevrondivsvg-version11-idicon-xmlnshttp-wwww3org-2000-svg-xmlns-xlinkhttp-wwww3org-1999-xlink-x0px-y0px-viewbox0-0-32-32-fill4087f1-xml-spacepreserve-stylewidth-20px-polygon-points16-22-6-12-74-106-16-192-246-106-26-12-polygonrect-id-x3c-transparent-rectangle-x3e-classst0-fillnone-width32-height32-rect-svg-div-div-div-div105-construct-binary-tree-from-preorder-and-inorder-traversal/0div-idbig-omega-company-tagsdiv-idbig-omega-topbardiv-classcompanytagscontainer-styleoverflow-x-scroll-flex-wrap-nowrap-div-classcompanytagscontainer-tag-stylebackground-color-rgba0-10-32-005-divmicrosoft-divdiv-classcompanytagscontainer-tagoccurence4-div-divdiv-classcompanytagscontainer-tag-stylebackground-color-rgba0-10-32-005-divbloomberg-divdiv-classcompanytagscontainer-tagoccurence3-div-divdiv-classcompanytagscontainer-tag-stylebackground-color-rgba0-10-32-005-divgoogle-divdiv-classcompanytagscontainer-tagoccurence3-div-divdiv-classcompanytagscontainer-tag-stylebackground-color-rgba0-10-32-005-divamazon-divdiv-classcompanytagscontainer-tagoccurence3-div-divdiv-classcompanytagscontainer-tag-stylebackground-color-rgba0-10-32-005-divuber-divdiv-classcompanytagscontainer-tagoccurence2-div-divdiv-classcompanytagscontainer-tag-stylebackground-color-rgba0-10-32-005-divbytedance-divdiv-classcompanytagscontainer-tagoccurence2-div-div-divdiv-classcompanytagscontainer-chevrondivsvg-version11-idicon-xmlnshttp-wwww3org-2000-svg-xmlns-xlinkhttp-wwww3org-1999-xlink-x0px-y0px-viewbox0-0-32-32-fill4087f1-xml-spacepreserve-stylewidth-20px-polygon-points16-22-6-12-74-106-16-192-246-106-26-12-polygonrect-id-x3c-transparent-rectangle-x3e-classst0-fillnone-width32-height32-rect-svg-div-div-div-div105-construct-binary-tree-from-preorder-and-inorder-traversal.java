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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||preorder.length==0){
            return null;
        }
        int index=0;
        int root=preorder[0];
        for(int i=0;i<inorder.length;i++){
            if(root==inorder[i])
                index=i;
        }
        TreeNode rootNode=new TreeNode(root);
        rootNode.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        rootNode.right=buildTree(Arrays.copyOfRange(preorder,index+1,inorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return rootNode;
    }
}