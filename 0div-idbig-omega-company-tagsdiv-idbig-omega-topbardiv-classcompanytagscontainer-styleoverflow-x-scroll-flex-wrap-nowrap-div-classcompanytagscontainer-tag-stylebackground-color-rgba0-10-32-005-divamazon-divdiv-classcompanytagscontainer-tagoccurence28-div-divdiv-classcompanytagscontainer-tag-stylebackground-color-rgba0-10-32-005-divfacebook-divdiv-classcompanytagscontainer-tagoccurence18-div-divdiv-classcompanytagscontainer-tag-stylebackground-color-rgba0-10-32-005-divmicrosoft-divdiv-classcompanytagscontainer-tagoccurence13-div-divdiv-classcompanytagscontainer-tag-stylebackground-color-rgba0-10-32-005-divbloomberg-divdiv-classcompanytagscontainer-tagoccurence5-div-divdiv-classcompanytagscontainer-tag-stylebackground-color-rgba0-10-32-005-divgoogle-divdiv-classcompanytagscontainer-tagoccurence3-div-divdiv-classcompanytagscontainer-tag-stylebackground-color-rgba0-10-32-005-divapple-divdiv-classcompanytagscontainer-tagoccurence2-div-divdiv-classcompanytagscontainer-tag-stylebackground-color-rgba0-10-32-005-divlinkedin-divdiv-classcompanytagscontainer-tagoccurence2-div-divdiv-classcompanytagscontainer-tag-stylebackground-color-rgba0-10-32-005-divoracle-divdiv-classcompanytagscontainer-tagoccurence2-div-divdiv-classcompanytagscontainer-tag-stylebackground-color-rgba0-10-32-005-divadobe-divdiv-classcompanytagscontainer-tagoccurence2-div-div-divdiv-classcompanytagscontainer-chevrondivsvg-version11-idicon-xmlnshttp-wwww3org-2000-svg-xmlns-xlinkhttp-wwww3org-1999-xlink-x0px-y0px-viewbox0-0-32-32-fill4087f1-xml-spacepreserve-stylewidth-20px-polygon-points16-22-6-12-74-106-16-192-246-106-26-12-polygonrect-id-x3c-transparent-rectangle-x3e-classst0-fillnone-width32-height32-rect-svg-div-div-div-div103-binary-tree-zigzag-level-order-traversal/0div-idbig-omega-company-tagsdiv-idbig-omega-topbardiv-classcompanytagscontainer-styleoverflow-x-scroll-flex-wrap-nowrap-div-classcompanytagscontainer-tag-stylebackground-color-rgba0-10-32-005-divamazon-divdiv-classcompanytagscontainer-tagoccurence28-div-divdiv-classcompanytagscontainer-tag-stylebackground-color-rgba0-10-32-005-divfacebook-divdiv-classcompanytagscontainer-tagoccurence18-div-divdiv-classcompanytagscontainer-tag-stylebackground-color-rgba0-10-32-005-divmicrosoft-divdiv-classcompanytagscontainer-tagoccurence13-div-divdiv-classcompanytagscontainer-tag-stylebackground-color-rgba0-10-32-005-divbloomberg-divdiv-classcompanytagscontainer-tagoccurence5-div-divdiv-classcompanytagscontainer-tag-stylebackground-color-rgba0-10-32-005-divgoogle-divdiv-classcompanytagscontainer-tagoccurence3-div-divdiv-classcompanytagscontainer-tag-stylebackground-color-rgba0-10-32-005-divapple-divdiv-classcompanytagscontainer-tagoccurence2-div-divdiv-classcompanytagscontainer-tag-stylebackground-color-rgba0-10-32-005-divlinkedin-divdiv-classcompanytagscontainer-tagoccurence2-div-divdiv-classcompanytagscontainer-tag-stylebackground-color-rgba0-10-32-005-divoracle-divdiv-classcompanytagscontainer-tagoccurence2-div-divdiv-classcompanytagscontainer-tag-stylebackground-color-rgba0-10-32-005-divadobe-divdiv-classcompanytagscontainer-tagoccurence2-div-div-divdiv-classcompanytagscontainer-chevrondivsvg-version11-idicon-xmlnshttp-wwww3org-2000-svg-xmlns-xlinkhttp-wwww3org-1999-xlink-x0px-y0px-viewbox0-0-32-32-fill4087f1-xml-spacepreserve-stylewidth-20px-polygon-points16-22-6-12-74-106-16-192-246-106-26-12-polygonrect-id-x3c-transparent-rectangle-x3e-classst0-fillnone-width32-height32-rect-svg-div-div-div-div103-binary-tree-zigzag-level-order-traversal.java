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
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode>queue=new LinkedList<>();
        List<Integer>subans=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        queue.offer(root);
        int j=0;
        while(queue.size()>0){
           
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                subans.add(node.val);
            }
            
            if(j==1){
                Collections.reverse(subans);
                 j=0;
                ans.add(subans);
                subans=new ArrayList<>();
                continue;
                
            }
            if(j==0){
                j=1;
                ans.add(subans);
                subans=new ArrayList<>();
                continue;
            }
            
            
            
            
            
            
        }
        return ans;

    }
}