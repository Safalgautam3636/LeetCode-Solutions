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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>subans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode poper=queue.poll();
                if(poper.left!=null){
                    queue.offer(poper.left);
                }
                if(poper.right!=null){
                    queue.offer(poper.right);
                }
                subans.add(poper.val);
            }
            ans.add(0,subans);
            
        }
        return ans;
    }
}