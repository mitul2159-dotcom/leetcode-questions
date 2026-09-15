class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        int size=0;
        for(int x:nums)
            while(x>0) {
                size++;
                x/=10;
            }
        int[] arr=new int[size];
        int k=size-1;
        for(int i=n-1;i>=0;i--)
        {
            int x=nums[i];
            while(x>0)
            {
                int digit=x%10;
                arr[k]=digit;
                k--;
                x=x/10;
            }
        }
        return arr;
    }
}