class Solution {
    public int maxFreqSum(String s) {
        int[] str=new int[26];
        s=s.toLowerCase();
        int v=0;
        int c=0;
        for(char ch:s.toCharArray())
        {
           str[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v=Math.max(v,str[i]);
            }
            else
            {
                c=Math.max(c,str[i]);
            }
        }
        return v+c;
    }
}