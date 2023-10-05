class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count=0;
        int first=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
// Input: intervals = [[1,2],[2,3],[3,4],[1,3]] ===>>>[[1,2],,[1,3],[2,3],[3,4]]
            
            int second=intervals[i][0];
            System.out.println(first+""+second);
            if(first>second){
                first=Math.min(first,intervals[i][1]);
                count++;
            }
            else{
                first=intervals[i][1];
            }
            
            
        }
        return count;
    }
}