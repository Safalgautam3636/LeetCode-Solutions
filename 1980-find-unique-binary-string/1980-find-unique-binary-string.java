class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> hash = new HashSet<>();
        for (String x : nums) {
            hash.add(x);
        }
        
        int n = nums[0].length();
        String binaryString = generateBinaryString(hash, "", n);
        return binaryString;
    }
    
    private String generateBinaryString(HashSet<String> hash, String binaryString, int n) {
        if (binaryString.length() == n) {
            if (!hash.contains(binaryString)) {
                return binaryString;
            } else {
                return null;
            }
        }
        
        String str = generateBinaryString(hash, binaryString + "0", n);
        if (str != null) {
            return str;
        }
        
        str = generateBinaryString(hash, binaryString + "1", n);
        if (str != null) {
            return str;
        }
        
        return null;
    }
}
