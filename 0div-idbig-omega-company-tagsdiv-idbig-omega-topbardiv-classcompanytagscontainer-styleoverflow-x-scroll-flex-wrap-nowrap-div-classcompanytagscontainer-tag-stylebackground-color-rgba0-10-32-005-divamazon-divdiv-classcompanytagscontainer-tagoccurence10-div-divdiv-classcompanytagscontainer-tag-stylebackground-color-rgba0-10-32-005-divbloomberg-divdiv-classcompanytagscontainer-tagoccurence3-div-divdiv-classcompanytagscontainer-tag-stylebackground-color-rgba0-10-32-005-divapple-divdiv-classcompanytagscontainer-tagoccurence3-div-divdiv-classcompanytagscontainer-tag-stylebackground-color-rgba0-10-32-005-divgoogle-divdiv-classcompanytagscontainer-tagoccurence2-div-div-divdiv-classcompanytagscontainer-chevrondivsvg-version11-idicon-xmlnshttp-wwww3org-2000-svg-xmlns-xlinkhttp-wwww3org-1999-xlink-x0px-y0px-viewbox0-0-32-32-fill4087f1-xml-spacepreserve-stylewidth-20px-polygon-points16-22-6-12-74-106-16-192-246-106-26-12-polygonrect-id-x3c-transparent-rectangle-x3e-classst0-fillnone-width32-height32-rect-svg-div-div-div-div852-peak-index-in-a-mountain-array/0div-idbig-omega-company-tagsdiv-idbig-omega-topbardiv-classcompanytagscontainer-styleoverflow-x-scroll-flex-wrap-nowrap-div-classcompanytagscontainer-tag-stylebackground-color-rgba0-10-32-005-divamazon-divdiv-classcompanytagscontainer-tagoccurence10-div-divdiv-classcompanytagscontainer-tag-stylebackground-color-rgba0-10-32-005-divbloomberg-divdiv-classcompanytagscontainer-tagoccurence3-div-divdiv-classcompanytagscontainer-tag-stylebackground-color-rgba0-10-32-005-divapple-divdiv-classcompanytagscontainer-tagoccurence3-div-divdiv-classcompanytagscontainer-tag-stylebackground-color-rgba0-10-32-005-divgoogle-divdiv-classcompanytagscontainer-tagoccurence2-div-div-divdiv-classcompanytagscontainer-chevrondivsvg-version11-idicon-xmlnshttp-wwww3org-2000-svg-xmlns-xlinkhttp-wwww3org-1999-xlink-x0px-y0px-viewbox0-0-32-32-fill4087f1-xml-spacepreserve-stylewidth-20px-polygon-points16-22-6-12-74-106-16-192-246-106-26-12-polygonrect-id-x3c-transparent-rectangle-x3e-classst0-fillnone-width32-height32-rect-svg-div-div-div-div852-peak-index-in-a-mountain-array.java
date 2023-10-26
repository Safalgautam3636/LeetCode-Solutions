class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(mid>0&&mid<arr.length-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(arr[mid]<arr[mid-1]){
                    last=mid;
                }
                else{
                    first=mid;
                }
            }
        }
        return first;
    }
}