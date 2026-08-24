class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean match =true;
        boolean match1=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               match=false;
            }
            else if (arr[i]<arr[i+1]){
                match1=false;
            }
            
        }
        return match || match1;
    }
}