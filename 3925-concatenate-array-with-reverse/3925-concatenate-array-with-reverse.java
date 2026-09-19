class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n*2];
        for(int i=0;i<nums.length;i++)
        {
            arr1[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
               int temp=nums[n-i-1];
                arr1[n+i]=temp;
        }
        return arr1;
    }
}