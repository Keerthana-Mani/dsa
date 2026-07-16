class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int ms=Integer.MAX_VALUE;
        int ws=0;
        for(int r=0;r<nums.length;r++){
            ws+=nums[r];
            while(ws>=target){
                int s=r-l+1;
                ms=Math.min(s,ms);
                ws-=nums[l];
                l++;
            }
        }
        return ms == Integer.MAX_VALUE ? 0 : ms;
    }
}