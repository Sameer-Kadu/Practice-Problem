class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c=0;
        int r[]=new int[2];
       for(int i =0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]+nums[j]==target)
            {
             return new int[] {i,j};
            }
            if(nums[(nums.length-1)-i]+nums[(nums.length-1)-j]==target)
            {
                return new int[] {(nums.length-1)-i,(nums.length-1)-j};
            }

        }
        
       }
        return r;
    }
}
