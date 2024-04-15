class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Arrays.sort(nums2);
        int k[]=new int[nums1.length];
        int i=0;
        while(i<nums1.length)
        {
            for(int j=0;j<nums2.length;j++)
            {
            if(nums1[i]==nums2[j])
            {
                if(j == nums2.length-1)
                {
                    k[i]=-1;
                }
                else 
                {
                    for(int l=j;l<nums2.length;l++)
                    {
                        if(nums1[i]<nums2[l])
                        {
                            k[i]=nums2[l];
                            break;
                        }
                        else
                        {
                             k[i]=-1;
                        }
                    }
                }
                
            }
            }
            i++;
        }
        return k;
    }
}