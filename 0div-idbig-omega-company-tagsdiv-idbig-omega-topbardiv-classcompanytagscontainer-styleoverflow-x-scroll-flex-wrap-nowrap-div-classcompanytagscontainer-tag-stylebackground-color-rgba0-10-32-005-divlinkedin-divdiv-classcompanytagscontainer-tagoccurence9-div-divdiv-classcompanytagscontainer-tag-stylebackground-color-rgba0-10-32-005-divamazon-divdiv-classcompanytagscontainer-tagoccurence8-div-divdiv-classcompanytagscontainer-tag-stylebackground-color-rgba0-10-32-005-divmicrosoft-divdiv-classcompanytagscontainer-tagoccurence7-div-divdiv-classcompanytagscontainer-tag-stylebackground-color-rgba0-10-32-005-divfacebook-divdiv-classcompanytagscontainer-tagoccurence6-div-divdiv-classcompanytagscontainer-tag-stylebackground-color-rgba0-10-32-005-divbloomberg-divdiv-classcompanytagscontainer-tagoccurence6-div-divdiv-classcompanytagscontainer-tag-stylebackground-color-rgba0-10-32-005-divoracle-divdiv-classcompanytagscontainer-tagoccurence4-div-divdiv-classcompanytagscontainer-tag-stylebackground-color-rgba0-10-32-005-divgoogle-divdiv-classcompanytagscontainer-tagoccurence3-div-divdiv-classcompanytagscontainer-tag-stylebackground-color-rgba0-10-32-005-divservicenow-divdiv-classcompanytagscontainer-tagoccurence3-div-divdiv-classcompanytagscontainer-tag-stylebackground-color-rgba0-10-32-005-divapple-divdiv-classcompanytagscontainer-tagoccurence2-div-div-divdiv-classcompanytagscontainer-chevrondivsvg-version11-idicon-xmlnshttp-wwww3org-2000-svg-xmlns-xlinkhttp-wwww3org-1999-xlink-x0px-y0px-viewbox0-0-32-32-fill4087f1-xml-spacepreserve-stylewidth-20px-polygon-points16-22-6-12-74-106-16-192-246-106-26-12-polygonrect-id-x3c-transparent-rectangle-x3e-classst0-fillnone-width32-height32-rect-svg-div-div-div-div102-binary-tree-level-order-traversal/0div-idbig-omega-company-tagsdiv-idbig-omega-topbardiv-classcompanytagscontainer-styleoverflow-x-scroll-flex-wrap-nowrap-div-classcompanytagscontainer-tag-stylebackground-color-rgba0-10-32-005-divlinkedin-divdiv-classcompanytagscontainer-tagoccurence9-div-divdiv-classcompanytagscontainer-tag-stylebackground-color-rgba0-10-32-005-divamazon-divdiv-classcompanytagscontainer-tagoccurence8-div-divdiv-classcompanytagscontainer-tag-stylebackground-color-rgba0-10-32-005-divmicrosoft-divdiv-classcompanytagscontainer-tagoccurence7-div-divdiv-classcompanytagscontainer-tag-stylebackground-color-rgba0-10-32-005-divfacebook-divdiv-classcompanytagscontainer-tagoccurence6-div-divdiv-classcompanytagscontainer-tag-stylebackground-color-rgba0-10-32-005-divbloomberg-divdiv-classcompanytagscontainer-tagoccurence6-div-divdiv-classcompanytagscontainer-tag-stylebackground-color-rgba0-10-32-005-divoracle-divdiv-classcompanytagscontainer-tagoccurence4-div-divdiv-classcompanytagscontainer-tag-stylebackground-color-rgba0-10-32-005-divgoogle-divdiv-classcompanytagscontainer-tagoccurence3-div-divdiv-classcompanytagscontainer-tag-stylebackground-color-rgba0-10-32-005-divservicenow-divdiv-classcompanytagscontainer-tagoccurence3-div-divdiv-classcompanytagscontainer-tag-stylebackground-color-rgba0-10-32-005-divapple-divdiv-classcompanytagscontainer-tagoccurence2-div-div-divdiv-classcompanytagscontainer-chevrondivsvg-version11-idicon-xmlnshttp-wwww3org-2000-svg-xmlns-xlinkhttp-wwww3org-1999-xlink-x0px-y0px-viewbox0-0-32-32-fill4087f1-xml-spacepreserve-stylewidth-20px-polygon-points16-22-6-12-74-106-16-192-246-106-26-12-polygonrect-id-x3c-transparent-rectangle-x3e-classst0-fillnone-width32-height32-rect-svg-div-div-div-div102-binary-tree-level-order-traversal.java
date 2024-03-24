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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer>temp=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode element=queue.poll();
                temp.add(element.val);
                if(element.left!=null){
                    queue.add(element.left);
                }
                if(element.right!=null){
                    queue.add(element.right);
                }
                
            }
            ans.add(new ArrayList(temp));
            
        }
        return ans;
    }
}