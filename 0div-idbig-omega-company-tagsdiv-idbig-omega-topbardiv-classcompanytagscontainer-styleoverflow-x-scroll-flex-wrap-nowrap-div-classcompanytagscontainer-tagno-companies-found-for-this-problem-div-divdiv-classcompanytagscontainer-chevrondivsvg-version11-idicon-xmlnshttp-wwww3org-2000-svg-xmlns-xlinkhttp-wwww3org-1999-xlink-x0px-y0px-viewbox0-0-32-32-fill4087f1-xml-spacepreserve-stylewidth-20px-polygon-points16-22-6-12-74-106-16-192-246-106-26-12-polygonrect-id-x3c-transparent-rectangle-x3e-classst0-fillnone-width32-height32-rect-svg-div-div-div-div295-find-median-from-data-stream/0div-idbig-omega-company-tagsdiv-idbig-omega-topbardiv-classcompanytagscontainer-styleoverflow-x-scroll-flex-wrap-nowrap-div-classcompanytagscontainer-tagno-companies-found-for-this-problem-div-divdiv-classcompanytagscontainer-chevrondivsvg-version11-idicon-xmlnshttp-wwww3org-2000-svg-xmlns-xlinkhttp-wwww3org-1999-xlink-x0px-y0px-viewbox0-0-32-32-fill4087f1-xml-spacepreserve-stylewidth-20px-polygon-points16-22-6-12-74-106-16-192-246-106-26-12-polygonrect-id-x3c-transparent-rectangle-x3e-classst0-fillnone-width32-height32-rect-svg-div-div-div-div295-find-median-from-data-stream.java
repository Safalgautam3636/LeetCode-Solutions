class MedianFinder {
    //has all the small elements
    Queue<Integer>maxHeap;
    //has all the greater elements
    Queue<Integer>minHeap;
    
    public MedianFinder() {
        maxHeap=new PriorityQueue<>((a,b)->b-a);
        minHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if(maxHeap.size()-minHeap.size()>1||!minHeap.isEmpty() && minHeap.peek()<maxHeap.peek()){
            minHeap.offer(maxHeap.poll());
        }
        if(minHeap.size()-maxHeap.size()>1){
            maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+minHeap.peek())/2;
        }
        else if(maxHeap.size()>minHeap.size()){
            return (double)maxHeap.peek();
        }
        else{
            return (double)minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */