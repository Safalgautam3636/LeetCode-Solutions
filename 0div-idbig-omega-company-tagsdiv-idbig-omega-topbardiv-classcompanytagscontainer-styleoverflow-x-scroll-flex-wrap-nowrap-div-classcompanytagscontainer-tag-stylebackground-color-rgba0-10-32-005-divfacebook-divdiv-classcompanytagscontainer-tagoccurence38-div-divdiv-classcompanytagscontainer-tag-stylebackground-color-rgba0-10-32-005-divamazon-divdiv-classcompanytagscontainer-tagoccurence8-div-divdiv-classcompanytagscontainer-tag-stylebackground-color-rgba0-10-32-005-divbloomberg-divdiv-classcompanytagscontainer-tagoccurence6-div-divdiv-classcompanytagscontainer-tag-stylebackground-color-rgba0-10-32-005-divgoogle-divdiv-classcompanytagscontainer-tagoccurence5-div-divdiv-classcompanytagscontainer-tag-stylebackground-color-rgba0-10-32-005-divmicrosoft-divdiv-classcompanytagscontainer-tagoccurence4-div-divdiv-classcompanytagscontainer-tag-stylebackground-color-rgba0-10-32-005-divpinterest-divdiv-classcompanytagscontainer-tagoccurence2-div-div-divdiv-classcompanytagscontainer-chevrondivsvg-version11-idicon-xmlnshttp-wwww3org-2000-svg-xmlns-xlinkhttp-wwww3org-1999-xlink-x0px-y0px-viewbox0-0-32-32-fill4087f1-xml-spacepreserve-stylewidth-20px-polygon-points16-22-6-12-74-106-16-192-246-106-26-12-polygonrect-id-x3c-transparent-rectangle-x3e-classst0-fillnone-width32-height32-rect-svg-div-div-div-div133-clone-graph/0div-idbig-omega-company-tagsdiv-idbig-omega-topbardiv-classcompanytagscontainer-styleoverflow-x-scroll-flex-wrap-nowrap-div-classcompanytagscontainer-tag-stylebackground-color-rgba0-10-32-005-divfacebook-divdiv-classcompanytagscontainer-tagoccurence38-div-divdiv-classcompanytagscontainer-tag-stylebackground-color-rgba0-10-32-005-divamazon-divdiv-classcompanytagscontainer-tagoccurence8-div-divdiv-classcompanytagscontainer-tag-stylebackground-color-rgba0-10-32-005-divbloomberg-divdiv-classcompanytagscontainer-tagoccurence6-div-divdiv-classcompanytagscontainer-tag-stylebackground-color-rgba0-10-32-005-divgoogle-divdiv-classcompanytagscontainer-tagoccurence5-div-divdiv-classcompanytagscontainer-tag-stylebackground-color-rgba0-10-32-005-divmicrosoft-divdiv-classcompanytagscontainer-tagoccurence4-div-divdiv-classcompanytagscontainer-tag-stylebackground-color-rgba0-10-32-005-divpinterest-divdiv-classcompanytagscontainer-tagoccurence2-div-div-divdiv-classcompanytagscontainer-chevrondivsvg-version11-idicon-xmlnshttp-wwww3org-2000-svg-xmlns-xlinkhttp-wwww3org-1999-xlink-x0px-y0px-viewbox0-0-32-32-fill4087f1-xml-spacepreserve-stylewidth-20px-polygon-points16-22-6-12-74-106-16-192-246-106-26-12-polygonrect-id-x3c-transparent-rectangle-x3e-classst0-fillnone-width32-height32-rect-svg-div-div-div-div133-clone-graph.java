/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Queue<Node>queue=new LinkedList<>();
        HashMap<Node,Node>hash=new HashMap<>();
        queue.add(node);
        if(node==null)return null;
        hash.put(node,new Node(node.val));
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            for(Node neighbor:curr.neighbors){
                if(!hash.containsKey(neighbor)){
                    hash.put(neighbor,new Node(neighbor.val));
                    queue.add(neighbor);
                }
                hash.get(curr).neighbors.add(hash.get(neighbor));
            }
        }
        return hash.get(node);
    }
}