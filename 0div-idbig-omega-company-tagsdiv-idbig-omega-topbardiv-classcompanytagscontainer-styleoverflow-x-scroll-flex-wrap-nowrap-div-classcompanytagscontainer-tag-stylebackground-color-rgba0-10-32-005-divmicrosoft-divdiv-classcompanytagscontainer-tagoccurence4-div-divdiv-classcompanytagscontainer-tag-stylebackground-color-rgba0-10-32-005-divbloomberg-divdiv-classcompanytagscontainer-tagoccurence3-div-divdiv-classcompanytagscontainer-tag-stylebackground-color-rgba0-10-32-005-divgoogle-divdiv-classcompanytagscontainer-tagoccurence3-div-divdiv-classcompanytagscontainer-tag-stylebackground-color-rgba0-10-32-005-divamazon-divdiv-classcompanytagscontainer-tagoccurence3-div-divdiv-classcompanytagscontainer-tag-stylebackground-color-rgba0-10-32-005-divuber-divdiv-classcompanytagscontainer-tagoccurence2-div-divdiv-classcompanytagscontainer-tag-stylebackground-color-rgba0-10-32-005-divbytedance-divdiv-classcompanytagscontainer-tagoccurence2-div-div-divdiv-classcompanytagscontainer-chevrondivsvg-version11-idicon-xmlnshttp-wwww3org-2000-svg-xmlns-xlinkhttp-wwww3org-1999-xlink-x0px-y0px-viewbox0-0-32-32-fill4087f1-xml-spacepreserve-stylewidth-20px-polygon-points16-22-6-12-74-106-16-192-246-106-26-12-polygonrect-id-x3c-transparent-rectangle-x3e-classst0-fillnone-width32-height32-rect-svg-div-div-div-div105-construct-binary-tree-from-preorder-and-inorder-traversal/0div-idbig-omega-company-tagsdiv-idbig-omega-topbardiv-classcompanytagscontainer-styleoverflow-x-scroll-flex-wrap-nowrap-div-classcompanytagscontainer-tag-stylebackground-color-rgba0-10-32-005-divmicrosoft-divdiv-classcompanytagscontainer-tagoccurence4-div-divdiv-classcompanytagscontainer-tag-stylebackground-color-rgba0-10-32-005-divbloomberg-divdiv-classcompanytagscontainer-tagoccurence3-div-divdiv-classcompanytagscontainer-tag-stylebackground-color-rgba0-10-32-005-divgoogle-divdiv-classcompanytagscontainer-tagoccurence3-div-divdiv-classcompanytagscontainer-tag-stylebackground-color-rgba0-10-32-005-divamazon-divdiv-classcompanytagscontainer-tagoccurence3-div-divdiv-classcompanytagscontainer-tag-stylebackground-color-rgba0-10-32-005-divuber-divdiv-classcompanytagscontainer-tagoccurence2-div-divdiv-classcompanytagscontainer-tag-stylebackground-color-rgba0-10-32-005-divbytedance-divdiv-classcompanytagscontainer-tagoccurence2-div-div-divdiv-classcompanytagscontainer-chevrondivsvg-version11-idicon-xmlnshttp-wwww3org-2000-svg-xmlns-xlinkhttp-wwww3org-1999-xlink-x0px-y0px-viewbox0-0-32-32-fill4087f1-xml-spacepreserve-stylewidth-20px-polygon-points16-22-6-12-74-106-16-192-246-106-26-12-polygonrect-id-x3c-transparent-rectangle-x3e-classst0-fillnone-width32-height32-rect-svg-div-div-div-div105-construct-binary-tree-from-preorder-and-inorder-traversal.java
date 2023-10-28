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
        if(preorder==null||preorder.length==0)return null;
        int root=preorder[0];
        int point=0;
        for(int i=0;i<inorder.length;i++){
            if(root==inorder[i]){
                point=i;
            }
        }
        TreeNode rootNode=new TreeNode(root);
        rootNode.left=buildTree(Arrays.copyOfRange(preorder,1,point+1),Arrays.copyOfRange(inorder,0,point));
        rootNode.right=buildTree(Arrays.copyOfRange(preorder,point+1,preorder.length),Arrays.copyOfRange(inorder,point+1,inorder.length));
        return rootNode;
        
    }
}