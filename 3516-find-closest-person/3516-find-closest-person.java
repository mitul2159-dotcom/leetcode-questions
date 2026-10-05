class Solution {
    public int findClosest(int x, int y, int z) {
        int sub1=Math.abs(x-z);
        int sub2=Math.abs(y-z);
        if(sub1<sub2)
        {
            return 1;
        }
        else if(sub2<sub1)
        {
            return 2;
        }
        return 0;
    }
}