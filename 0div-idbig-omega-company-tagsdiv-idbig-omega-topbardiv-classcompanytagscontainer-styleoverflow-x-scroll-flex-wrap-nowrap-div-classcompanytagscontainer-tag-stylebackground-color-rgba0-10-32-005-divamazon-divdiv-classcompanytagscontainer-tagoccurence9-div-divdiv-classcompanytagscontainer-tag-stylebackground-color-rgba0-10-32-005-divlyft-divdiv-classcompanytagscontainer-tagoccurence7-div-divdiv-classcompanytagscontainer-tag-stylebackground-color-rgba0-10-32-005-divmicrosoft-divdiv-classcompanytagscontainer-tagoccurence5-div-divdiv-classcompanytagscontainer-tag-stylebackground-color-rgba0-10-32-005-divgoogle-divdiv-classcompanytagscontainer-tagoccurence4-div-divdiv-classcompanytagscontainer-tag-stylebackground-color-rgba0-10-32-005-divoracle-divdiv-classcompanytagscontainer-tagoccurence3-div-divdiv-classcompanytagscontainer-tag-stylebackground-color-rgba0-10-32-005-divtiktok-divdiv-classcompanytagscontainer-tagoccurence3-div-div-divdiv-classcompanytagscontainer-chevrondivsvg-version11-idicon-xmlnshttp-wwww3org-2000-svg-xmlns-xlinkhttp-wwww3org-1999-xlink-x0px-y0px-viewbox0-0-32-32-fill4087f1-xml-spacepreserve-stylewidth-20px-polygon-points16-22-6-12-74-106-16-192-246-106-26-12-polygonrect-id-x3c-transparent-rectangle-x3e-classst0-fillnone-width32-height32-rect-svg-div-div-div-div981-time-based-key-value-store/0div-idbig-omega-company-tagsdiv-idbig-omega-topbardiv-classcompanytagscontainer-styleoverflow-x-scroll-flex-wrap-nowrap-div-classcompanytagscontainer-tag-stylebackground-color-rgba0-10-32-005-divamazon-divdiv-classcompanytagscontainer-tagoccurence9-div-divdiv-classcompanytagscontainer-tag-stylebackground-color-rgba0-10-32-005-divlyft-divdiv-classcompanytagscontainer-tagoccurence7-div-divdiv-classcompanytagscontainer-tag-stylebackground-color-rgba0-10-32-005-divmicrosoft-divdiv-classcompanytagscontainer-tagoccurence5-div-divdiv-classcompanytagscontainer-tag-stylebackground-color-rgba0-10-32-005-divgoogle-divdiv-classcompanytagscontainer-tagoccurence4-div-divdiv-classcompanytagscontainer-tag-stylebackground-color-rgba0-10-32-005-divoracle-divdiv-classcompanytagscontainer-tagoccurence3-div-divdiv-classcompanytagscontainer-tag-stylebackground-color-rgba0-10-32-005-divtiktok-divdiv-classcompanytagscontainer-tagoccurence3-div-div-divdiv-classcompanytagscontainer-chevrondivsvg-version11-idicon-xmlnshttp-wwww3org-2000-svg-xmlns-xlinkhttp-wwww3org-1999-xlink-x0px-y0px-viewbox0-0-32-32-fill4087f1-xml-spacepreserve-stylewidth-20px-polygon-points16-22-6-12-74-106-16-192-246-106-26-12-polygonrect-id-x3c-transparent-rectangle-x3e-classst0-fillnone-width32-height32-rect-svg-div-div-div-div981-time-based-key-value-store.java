class Pair{
    String value;
    int timestamp;
    Pair(String value,int timestamp){
        this.value=value;
        this.timestamp=timestamp;
    }
}
class TimeMap {
    // hashmap(key,val) where key is like a string and values are the list of pair of<value and timestamp> 
    Map<String,List<Pair>>storage;
    public TimeMap() {
        storage=new LinkedHashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        Pair collection=new Pair(value,timestamp);
        if(!storage.containsKey(key)){
            List<Pair>list=new ArrayList<>();
            storage.put(key,list);
        }
        List<Pair>pairs=storage.get(key);
        pairs.add(collection);
        storage.put(key,pairs);
    }
    
    public String get(String key, int timestamp) {
        String ans="";
        
        
        if (!storage.containsKey(key)) {
            return ans;
        }
        List<Pair>array=storage.get(key);
        int first=0;
        int last=array.size()-1;
        int target=timestamp;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(array.get(mid).timestamp<=target){
                ans= array.get(mid).value;
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */