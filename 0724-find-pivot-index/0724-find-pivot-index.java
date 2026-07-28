class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int t=0;
       int ls=0;
       for(int n1:nums){
        t+=n1;
       }
       for(int i=0;i<n;i++){
        int rs=t-ls-nums[i];
       if(ls==rs){
        return i;
       }
       ls+=nums[i];
    }
    return -1;
}
}