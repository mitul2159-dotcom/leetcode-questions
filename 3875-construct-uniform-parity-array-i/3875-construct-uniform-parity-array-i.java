class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int[] nums2=new int[n];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=i+1;j<nums1.length;j++)
            {
                if(i%2!=0)
                {
                    nums2[i] = nums1[i] - nums1[j];
                }
                else
                {
                    nums2[i] = nums1[i];
                }
            }
        }
        for(int k=0;k<nums2.length;k++)
        {
            if(nums2[k]%2==0 || nums2[k]%3==0)
            {
                return true;
            }
        }
        return false;
    }
}