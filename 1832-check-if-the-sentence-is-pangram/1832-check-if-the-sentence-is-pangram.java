class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] b=new boolean[26];
        for(char c:sentence.toCharArray())
        {
            b[c-'a']=true;
        }
        for(boolean a:b)
        {
            if(!a)
            {
                return false;
            }
        }
        return true;
    }
}