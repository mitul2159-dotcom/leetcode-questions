class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int[] arr={-1,-1};
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                e=mid-1;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
            else if(target>nums[mid])
            {
                s=mid+1;
            }
        }
        s=0;
        e=n-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                s=mid+1;
            }
            else if(target<nums[mid])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return arr;
    }
}