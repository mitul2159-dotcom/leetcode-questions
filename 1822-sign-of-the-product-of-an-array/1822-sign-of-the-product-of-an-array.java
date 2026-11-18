class Solution {
    public int arraySign(int[] nums) {
        int a=1;
       for(int i:nums)
       {
        if(i>0)
        {
         a=a*1;
        }
        if(i<1)
        {
            a=a*(-1);
        }
        if(i==0)
        {
            return 0;
        }
       } 
       return a;
    }
}