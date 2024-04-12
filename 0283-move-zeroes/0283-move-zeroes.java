class Solution {
    public void moveZeroes(int[] nums) {
       
        
          int left = 0;
        int right = 0;

        // Iterate through the array
        while (right < nums.length) {
            // If the current element is not zero, swap it with the left pointer
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            
            right++; 
            
        }
        
    }
}