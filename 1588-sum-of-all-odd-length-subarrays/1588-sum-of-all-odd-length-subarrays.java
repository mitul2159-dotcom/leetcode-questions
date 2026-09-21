class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       List<List<Integer>> list=new ArrayList<>();
       int n=arr.length;
       for(int i=0;i<n;i++)
       {
        for(int j=i;j<n;j++)
        {
            List<Integer> items=new ArrayList<>();
            for(int k=i;k<=j;k++)
            {
                items.add(arr[k]);
            }
             list.add(items);
        }
       } 
       int m=list.size();
       int sum=0;
       for(int i=0;i<m;i++)
       {
        if(list.get(i).size()%2!=0)
        {
            for(int j=0;j<list.get(i).size();j++)
            {
                sum+=list.get(i).get(j);
            }
        }
       }
       return sum;
    }
}