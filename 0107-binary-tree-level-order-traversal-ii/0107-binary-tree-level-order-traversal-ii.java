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
        Stack<List<Integer>>stack=new Stack();
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
            stack.add(subans);
        }
        ArrayList<List<Integer>>ans=new ArrayList();
        while(stack.isEmpty()==false){
            ans.add(stack.pop());
        }
        return ans;
    }
}