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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        List<Integer>ans=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode ele=queue.poll();
                if(i==size-1){
                    ans.add(ele.val);
                }
                if(ele.left!=null){
                    queue.add(ele.left);
                }
                if(ele.right!=null)
                {
                    queue.add(ele.right);
                }
            }
        }
        return ans;
    }
}