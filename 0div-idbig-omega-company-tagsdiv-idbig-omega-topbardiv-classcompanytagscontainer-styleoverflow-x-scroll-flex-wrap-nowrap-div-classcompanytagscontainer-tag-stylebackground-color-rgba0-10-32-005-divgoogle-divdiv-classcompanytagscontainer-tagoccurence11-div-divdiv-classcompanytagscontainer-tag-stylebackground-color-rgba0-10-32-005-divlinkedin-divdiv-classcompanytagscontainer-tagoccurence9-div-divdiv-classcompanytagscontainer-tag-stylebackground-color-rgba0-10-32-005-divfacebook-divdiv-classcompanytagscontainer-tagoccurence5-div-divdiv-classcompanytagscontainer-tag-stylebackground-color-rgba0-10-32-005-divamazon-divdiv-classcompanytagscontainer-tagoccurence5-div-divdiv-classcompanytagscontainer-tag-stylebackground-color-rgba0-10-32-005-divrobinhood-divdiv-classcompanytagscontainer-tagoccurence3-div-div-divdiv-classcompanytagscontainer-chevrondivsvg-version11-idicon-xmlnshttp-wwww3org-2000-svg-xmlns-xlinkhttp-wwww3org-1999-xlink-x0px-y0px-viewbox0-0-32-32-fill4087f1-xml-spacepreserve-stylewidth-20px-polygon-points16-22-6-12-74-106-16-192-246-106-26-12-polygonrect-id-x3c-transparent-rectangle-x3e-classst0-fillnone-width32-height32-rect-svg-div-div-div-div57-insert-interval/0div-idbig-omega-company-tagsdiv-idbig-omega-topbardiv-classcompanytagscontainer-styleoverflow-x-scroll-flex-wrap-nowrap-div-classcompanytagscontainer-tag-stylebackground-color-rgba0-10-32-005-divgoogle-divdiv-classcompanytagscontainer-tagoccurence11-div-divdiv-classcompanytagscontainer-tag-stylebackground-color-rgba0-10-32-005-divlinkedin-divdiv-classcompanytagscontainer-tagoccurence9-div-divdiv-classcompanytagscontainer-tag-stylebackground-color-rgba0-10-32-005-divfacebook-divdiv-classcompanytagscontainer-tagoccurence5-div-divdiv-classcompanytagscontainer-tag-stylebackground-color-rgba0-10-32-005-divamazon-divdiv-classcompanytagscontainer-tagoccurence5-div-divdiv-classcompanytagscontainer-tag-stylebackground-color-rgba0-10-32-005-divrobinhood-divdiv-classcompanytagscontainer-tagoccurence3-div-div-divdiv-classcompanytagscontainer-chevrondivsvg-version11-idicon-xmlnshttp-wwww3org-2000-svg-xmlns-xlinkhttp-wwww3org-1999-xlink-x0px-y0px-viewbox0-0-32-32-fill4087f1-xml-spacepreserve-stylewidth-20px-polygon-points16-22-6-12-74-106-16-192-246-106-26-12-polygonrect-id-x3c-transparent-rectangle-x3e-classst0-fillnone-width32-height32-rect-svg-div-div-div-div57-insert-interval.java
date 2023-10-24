class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>ans=new ArrayList<>();
        for(int[] interval:intervals){
            // [[2,5]] //newInterval=[4,5]
            // case 1 : when interval[end] < newInterval[start],ex-newInterval = [4,8], interval = [1,2]
            // case 2 : when interval[start] > newInterval[end],ex-newInterval = [4,8], interval = [12,16]
            // case 3 : when new interval is already added in output list
            if(newInterval==null){
                ans.add(interval);
            }
            else if(interval[1]<newInterval[0]){
                ans.add(interval);
            }
            else if(newInterval[1]<interval[0]){
                ans.add(newInterval);
                ans.add(interval);
                newInterval=null;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],interval[0]);
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }
        }
        if(newInterval!=null)ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}