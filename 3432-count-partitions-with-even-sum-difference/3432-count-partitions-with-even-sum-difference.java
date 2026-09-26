class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }
        int s=0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            s+=nums[i];
            int e=total-s;
            if((s-e)%2==0)
            {
                count++;
            }
        }
        return count;
    }
}