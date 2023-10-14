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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<List<TreeNode>>queue=new LinkedList<>();
        List<TreeNode>list=new ArrayList<>();
        list.add(root);
        //element
        list.add(root);
        queue.add(list);
        TreeNode xparent=null;
        TreeNode yparent=null;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            boolean xx=false;
            boolean yy=false;
            for(int i=0;i<size;i++){
                List<TreeNode>certain=queue.poll();
                TreeNode element=certain.get(1);
                TreeNode parent=certain.get(0);
                if(x==element.val){
                    xparent=parent;
                    xx=true;
                }
                if(y==element.val){
                    yparent=parent;
                    yy=true;
                }
                else {
                    List<TreeNode>temp;
                    if(element.left!=null){
                        temp= new ArrayList<>();
                        temp.add(element);
                        temp.add(element.left);
                        queue.add(temp);
                    }
                    if(element.right!=null){
                        temp= new ArrayList<>();
                        temp.add(element);
                        temp.add(element.right);
                        queue.add(temp);
                    }
                }
            }
            if(xx&&yy&&xparent!=yparent){
                return true;
            }
            if(xx&&yy&&xparent==yparent){
                return false;
            }
            
        }
        return false;
    }
}