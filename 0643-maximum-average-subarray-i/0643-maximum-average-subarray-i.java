class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double maxavg= Double.NEGATIVE_INFINITY;
      double ws=0;
      for(int i=0;i<nums.length;i++){
         ws+=nums[i];
        if(i>=k-1){
            double g=ws/k;
            maxavg=Math.max(maxavg,g);
            ws-=nums[i-k+1];
        }
      }
      return maxavg;  
    }
}