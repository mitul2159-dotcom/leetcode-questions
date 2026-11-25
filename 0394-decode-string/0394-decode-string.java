class Solution {
    public String decodeString(String s) {
        Deque<Integer> numberstack=new ArrayDeque<>();
        Deque<StringBuilder> stringstack=new ArrayDeque<>();
        int number=0;
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                number=number*10+(ch-'0');
            }
            else if(ch=='[')
            {
                numberstack.push(number);
                stringstack.push(curr);
                number=0;
                curr=new StringBuilder(); 
            }
            else if(ch==']')
            {
                int repeat=numberstack.pop();
                StringBuilder prev=stringstack.pop();
                for(int i=1;i<=repeat;i++)
                {
                    prev.append(curr);
                }
                curr=prev;
            }
            else
            {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}