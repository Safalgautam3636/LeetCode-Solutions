class LRUCache {
    final Node start=new Node();
    final Node tail=new Node();
    int capacity;
    Map<Integer,Node>hash;
    public LRUCache(int capacity) {
        hash=new HashMap<>(capacity);
        this.capacity=capacity;
        start.next=tail;
        tail.prev=start;
    }
    
    public int get(int key) {
        int ans=-1;
        Node val=hash.get(key);
        if(val!=null){
            ans=val.val;
            removeNode(val);
            addNode(val);
            
        }
        return ans;
    }
    
    public void put(int key, int value) {
        Node present=hash.get(key);
        if(present!=null){
            removeNode(present);
            present.val=value;
            addNode(present);
        }
        else{
            if(capacity==hash.size()){
                Node toBeRem=tail.prev;
                int keyRem=toBeRem.key;
                removeNode(toBeRem);
                hash.remove(keyRem);
                 
            }
                Node newNode=new Node();
                newNode.key=key;
                newNode.val=value;
                hash.put(key,newNode);
                addNode(newNode);
           
            
        }
    }
    public void addNode(Node node){
        Node nextNode=start.next;
        node.next=nextNode;
        nextNode.prev=node;
        start.next=node;
        node.prev=start;
    }
    public void removeNode(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */