class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int result=0;
        if(( arrivalTime+delayedTime)<24)
        {
            return arrivalTime+delayedTime;
        }
        if(( arrivalTime+delayedTime)>24)
        {
            result= Math.abs(24-(arrivalTime+delayedTime));
        }
        return result;
    }
}