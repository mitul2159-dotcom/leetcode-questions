class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double min=1000;
        int max=-1;
        Arrays.sort(nums);
       int s=0;
       int e=n-1;
       while(s<e)
       {
         double avg=(nums[s]+nums[e])/2.0;
         if(avg<min)
         {
            min=avg;
         }
         s++;
         e--;
       }
       return min;
    }
}