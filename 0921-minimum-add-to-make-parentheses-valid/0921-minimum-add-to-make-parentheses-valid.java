class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int result=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);    
            }
            else
            {
               if(st.isEmpty())
               {
                result++;
               }
               else
               {
                st.pop();
               }
            }
        }
        int finalans=result+st.size();
        return finalans;
    }
}