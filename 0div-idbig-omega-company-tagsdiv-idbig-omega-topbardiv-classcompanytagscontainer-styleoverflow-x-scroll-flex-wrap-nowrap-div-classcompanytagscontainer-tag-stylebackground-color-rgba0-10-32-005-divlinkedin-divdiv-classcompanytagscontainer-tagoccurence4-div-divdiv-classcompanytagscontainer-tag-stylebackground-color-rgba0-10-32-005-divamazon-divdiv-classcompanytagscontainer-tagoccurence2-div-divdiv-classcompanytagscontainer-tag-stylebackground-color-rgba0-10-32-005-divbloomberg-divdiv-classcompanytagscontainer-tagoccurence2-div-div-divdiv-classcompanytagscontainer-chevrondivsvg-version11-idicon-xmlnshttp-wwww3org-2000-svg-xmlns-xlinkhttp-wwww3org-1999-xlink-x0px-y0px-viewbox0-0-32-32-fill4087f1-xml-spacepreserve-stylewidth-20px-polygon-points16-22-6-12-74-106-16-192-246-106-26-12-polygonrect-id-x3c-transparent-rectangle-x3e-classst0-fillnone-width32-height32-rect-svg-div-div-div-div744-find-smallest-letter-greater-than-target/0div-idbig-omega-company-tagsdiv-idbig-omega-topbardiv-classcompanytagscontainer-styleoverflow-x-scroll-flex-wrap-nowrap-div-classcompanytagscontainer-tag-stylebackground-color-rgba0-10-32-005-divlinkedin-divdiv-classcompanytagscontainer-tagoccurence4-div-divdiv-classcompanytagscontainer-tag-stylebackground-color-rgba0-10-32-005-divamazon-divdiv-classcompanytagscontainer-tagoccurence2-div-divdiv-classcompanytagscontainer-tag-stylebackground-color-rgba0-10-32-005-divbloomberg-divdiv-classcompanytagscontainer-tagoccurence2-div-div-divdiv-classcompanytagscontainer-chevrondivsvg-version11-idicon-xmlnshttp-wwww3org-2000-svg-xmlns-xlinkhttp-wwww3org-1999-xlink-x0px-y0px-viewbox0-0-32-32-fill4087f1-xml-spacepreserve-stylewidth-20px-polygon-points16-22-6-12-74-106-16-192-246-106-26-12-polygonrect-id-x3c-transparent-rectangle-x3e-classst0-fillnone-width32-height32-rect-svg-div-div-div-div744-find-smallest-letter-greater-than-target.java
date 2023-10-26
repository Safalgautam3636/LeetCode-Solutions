class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int first=0;
        int last=letters.length-1;
        // go to the lowest boundry possible
        //if i find the target then I will instantly return i+1 element because the array is sorted
        // if i hit any current element that is greater than target then reduce search space i.e. right=mid-1;
        // if there dont exist element like that then return the first one;
        char ans=letters[0];
        while(first<=last){
            int mid=first+(last-first)/2;
            if(mid+1<=letters.length-1&&letters[mid]==target){
                
                while(mid+1<=letters.length-1&&letters[mid]==letters[mid+1]){
                    mid++;
                }
                
                if(mid>=letters.length-1){
                    break;
                }
                return letters[mid+1];
            }
            else if(letters[mid]>target){
                ans=letters[mid];
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return ans;
    }
}