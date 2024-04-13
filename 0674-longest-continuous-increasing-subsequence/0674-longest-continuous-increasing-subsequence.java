class Solution {
    public int findLengthOfLCIS(int[] nums) {
    
    
        if (nums.length == 0) {
            return 0;
        }
        
        int maxLen = 1;
        int currentLen = 1;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            
            maxLen = Math.max(maxLen, currentLen);
        }
        
        return maxLen;
    }


    
}