class Solution {
    public int findMiddleIndex(int[] nums) {
        int t=0;int rs=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int ls=t-rs-nums[i];
            if(ls==rs){
                return i;
            }
            rs+=nums[i];
        }
    return -1;
}

}