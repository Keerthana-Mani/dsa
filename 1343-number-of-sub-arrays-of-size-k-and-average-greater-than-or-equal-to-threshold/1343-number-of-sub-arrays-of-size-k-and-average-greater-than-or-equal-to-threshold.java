class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ws=0;
        int ma=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            ws+=arr[i];
            if(i>=k-1){
                int avg=ws/k;
                if(avg>=threshold){
                    c++;
                }
                ws-=arr[i-k+1];
            }
        }
        return c;
    }
}