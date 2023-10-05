class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer>ans=new HashSet<>();
        for(int x:map.keySet()){
            if(ans.contains(map.get(x))){
                return false;
            }
            ans.add(map.get(x));
        }
        return true;
    }
}