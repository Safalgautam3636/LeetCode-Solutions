class MedianFinder {
    PriorityQueue<Integer>minHeap;
    PriorityQueue<Integer>maxHeap;
    public MedianFinder() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>((o1,o2)->o2-o1);
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll());
        } else if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.add(maxHeap.poll());
            maxHeap.add(minHeap.poll());
        }
    }

    
    public double findMedian() {
        
        if(minHeap.size()==maxHeap.size()){
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
        else if(minHeap.size()>maxHeap.size()){
            return minHeap.peek();
        }
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */