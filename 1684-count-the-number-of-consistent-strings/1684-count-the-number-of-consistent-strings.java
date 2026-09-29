class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<words[i].length();j++)
            {
                boolean found=false;
                for(int k=0;k<allowed.length();k++)
                {
                    if(words[i].charAt(j)==allowed.charAt(k))
                    {
                        found=true;
                        break;
                    }
                }
                if(found==false)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                count++;
            }
        }
        return count;
    }
}