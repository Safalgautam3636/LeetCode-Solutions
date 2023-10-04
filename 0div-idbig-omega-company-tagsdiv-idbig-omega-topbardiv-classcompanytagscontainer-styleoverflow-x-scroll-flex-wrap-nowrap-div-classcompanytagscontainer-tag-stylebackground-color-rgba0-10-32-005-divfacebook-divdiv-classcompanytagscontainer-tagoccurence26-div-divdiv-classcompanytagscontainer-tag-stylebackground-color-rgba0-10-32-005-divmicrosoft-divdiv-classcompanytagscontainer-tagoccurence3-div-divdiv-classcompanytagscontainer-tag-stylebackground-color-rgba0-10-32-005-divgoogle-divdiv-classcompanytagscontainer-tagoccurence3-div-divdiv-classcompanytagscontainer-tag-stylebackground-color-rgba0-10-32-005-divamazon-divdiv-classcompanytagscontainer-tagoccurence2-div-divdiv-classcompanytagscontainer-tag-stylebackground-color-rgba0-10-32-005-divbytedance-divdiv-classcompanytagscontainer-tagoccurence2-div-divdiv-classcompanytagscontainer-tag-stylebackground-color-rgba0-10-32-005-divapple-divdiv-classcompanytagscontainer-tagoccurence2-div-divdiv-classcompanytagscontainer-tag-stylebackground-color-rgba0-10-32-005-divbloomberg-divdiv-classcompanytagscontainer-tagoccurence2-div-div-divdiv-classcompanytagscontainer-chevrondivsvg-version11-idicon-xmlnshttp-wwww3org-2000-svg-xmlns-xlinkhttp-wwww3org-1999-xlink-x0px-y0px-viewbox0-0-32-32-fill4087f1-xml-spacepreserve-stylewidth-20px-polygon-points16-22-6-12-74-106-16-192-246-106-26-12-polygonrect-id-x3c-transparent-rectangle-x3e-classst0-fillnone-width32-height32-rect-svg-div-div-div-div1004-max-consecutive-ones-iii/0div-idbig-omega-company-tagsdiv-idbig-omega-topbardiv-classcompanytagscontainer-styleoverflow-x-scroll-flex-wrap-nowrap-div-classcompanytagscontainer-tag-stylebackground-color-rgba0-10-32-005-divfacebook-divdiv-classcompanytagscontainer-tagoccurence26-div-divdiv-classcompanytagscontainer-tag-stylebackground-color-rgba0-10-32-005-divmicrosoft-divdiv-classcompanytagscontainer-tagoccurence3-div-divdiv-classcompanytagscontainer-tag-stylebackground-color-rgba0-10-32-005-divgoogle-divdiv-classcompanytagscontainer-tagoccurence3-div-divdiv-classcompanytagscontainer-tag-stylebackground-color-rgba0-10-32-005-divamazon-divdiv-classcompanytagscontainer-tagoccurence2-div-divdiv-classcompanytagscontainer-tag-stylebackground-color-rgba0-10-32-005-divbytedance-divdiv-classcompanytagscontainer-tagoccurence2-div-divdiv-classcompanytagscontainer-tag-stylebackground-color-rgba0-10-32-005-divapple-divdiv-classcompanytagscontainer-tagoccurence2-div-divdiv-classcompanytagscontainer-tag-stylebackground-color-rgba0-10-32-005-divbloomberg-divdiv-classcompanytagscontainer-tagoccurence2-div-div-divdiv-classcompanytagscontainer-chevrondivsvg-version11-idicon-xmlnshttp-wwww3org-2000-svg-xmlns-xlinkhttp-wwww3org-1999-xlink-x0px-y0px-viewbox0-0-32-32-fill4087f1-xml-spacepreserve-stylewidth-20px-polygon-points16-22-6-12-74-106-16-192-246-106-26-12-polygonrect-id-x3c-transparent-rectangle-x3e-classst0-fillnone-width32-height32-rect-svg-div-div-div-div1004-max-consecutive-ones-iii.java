class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int count = 0;
        int variable = k;
        
        int first = 0;
        int second = 0;
        
        while (second < nums.length) {
            if (nums[second] == 1) {
                second++;
            } else {
                if (variable > 0) {
                    second++;
                    variable--;
                } else {
                    // Move the left pointer (first) to the right to shrink the window.
                    while (nums[first] != 0) {
                        first++;
                    }
                    first++;  // Move past the first 0.
                    variable++;  // Increment variable since we are removing a 0.
                }
            }
            ans = Math.max(ans, second - first);
        }
        
        return ans;
    }
}
