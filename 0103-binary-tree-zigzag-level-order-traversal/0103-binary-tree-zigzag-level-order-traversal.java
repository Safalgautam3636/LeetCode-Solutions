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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            List<Integer>instance=new ArrayList<>();
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                instance.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                    
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if(level%2==1){
                Collections.reverse(instance);
            }
            level++;
            ans.add(instance);
        }
        return ans;
    }
}