class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n!=m){
            return 0;
        }
        HashMap<String,Integer>hash=new HashMap<>();
        for(int[]row:grid){
            System.out.println(Arrays.toString(row));
            hash.put(Arrays.toString(row),hash.getOrDefault(Arrays.toString(row),0)+1);
        }
        System.out.println(hash);
        int count=0;
        for(int i=0;i<n;i++){
            int[]ans=new int[n];
            for(int j=0;j<m;j++){
                ans[j]=grid[j][i];
            }
            System.out.println(hash.getOrDefault(hash.get(Arrays.toString(ans)),0));
            count+=hash.getOrDefault(Arrays.toString(ans),0);
        }
        return count;
    }
}