class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        char arr[]=p.toCharArray();
        Arrays.sort(arr);
        p=new String(arr);
        System.out.println(p);
        List<Integer>index=new ArrayList<>();
        for(int right=p.length();right<=s.length();right++){
            String window=s.substring(left,right);
            char arr1[]=window.toCharArray();
            Arrays.sort(arr1);
            window=new String(arr1);
            System.out.println(left+" "+right);
            if(p.equals(window)){
                index.add(left);
            }
                left++;
            
        }
        return index;
    }
}