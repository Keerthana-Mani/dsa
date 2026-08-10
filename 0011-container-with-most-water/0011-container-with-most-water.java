class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int width=r-l;
            int mn=Math.min(height[l],height[r]);
            int area=width*mn;
            maxarea=Math.max(area,maxarea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    
    }
}