class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start=0;
        int end=people.length-1;
        int counter=0;
        while(start<=end){
            int sum=people[start]+people[end];
            if(start==end){
                counter++;
                break;
            }
            if(sum<=limit){
                counter++;
                start++;
                end--;
            }
            else{
                counter++;
                end--;
            }
        }
        return counter;
    }
}