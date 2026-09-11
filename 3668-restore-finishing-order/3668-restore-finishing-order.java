class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int m=order.length;
        int n=friends.length;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(order[i]==friends[j])
                {
                    arr[k]=order[i];
                    k++;
                }
            }
        }
        return arr;
    }
}