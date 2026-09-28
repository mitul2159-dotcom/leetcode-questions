class Solution {
    public int numJewelsInStones(String jewels,String stones)
     {
        int count=0;
         for(int i=0;i<jewels.length();i++)
         {
            char c=jewels.charAt(i);
            for(int j=0;j<stones.length();j++)
            {
                char c1=stones.charAt(j);
                {
                    if(c==c1)
                    {
                        count++;
                    }
                }
            }
         }
         return count;
    }
}