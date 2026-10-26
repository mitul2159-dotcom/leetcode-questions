class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq=new int[10];
        while(n>0)
        {
            int digit=n%10;
            freq[digit]++;
            n=n/10;
        }
        int ans=-1;
        int count = Integer.MAX_VALUE;
        for(int i=0;i<=9;i++)
        {
            if(freq[i]>0 && freq[i]<count)
            {
                count=freq[i];
                ans=i;
            }
            else if (freq[i] == count) {
                    ans = Math.min(ans, i);
        }
    }
      return ans;
}
}