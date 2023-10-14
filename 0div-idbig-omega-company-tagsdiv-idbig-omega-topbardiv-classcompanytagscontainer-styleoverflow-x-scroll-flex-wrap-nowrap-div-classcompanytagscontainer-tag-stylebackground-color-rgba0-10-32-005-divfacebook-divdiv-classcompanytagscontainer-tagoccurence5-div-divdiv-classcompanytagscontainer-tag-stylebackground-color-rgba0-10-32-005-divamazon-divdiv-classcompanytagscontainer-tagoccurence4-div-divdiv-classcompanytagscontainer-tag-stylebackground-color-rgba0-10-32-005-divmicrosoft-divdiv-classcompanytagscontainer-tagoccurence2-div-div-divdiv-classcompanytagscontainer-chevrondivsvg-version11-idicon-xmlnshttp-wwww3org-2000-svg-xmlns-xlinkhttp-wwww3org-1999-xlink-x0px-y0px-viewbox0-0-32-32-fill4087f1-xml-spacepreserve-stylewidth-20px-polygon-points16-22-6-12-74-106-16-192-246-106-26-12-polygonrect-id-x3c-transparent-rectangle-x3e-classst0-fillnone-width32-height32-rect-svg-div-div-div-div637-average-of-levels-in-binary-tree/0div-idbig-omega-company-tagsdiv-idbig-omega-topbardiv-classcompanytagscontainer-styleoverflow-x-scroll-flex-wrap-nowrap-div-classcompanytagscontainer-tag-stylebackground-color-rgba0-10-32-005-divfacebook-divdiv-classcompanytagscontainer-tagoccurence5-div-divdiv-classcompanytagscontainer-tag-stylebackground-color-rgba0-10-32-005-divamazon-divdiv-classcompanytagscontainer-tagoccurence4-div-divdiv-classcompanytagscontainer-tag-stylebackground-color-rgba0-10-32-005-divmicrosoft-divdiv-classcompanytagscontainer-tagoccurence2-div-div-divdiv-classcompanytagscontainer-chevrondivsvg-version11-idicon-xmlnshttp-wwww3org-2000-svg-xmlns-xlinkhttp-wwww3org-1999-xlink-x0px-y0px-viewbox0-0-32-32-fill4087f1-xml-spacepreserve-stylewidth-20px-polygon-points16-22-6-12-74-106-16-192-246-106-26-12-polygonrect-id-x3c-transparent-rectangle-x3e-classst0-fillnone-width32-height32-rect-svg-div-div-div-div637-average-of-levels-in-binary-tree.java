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
    public List<Double> averageOfLevels(TreeNode root) {
            if(root==null){
                return new ArrayList<>();
            }
            Queue<TreeNode>queue=new LinkedList<>();
            List<Double>ans=new ArrayList<>();
            queue.offer(root);
            while(queue.size()>0){
                int size=queue.size();
                double sum=0;
                int count=0;
                for(int i=0;i<size;i++){
                    TreeNode node=queue.poll();
                    sum+=node.val;
                    count++;
                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }
                }
                ans.add(sum/count);
            }
            return ans;

    }
}