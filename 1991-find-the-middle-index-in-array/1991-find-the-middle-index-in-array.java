class Solution {
    public int findMiddleIndex(int[] nums) {
        int total=0;
        int n=nums.length;
        int rightsum=0;
        int leftsum=0;
        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            rightsum=total-leftsum-nums[i];
            if(rightsum==leftsum)
            {
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}