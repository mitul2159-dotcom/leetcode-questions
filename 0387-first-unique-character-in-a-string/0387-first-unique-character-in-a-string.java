class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            freq[current-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            int current=s.charAt(i);
            if(freq[current-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}