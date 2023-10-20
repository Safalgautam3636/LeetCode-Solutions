class Solution {
    public int[] sortArray(int[] nums) {
        
        sort(nums,0,nums.length-1);
        return nums;
    }
    void sort(int[]nums,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        sort(nums,left,mid);
        sort(nums,mid+1,right);
        merge(nums,left,mid,right);
        
    }
    
    void merge(int[] nums, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    for (int i = 0; i < n1; i++) {
        leftArray[i] = nums[left + i];
    }
    for (int j = 0; j < n2; j++) {
        rightArray[j] = nums[mid + 1 + j];
    }

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            nums[k++] = leftArray[i++];
        } else {
            nums[k++] = rightArray[j++];
        }
    }

    while (i < n1) {
        nums[k++] = leftArray[i++];
    }

    while (j < n2) {
        nums[k++] = rightArray[j++];
    }
}

    
    
}