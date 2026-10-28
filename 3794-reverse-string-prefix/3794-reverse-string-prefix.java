class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1)
        {
            return s;
        }
        String  result="";
        for(int i=k-1;i>=0;i--)
        {
            result = result + s.charAt(i);
        }
        for(int i=k;i<s.length();i++)
        {
         result = result + s.charAt(i);
        }
        return result;
    }
}