class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        for(int i=1;i<=k;i++)
        {
            int m=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                    m=j;
                }
            }
            nums[m]=nums[m]*multiplier;
        }
        return nums;
    }
}