class Solution {
    public int minPartitions(String n) {
       int[] arr=new int[n.length()];
       int max=0;
       for(int i=0;i<n.length();i++)
       {
         arr[i] = n.charAt(i) - '0';
       }
       for(int i=0;i<arr.length;i++)
       {
        if(max<arr[i])
        {
            max=arr[i];
        }
       }
       return max;
    }
}