class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>hash1=new HashSet<>();
        HashSet<Integer>hash2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hash1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            hash2.add(nums2[i]);
        }
        List<Integer>ans1=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        
        for(int x:hash1){
            if(!hash2.contains(x)){
                ans1.add(x);
            }
        }
        for(int y:hash2){
            if(!hash1.contains(y)){
                ans2.add(y);
            }
        }
        
        List<List<Integer>>hashAns=new ArrayList<>();
        hashAns.add(ans1);
        hashAns.add(ans2);
        return hashAns;
        
    }
}