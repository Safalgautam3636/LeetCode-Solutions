class Solution {
    int find(long search,int[]positions){
        int pfirst=0;
        int plast=positions.length-1;
        int first=0;
        int last=positions.length-1;
        int store=0;
        if(positions[positions.length-1]<search)
            return 0;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(positions[mid]>=search){
                last=mid-1;
                store=mid;
            }
            else{
                first=mid+1;
                
            }
        }
        
        return (plast-store+1)<0?(0):(plast-store+1);
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            
            int spell=spells[i];
            
            long search=(long)Math.ceil((double)success/spell);
            System.out.println(search);
            ans[i]=find(search,potions);
            
            
        }
        return ans;
    }
}