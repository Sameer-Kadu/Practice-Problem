class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length ==1)
        {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int c = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(i+1>=nums.length)
            {
                return max;
            }
            if(nums[i]<nums[i+1])
            {
                c++;
            }
            else
            {
                c=1;
            }
            
            if(c>max)
            {
                    max = c;
                   
            }
            
        }
        return max;
    }
}