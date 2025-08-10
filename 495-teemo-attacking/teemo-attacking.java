class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int n=timeSeries.length;
        int time=0;

        for(int i=1;i<n;i++){
            int diff = timeSeries[i] - timeSeries[i-1];

            if(diff<duration){
                time+=diff;
            }else{
                time+=duration;
            }
        }
        return time+duration;
    }
}