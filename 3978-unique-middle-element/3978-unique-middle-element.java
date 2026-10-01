class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int mid=s+(e-s)/2;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==nums[mid])
            {
                count++;
            }
        }
        if(count==1)
        {
            return true;
        }
        return false;
    }
}