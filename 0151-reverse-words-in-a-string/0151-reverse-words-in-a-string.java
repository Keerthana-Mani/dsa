class Solution {
    public String reverseWords(String s) {
     String []s1=s.trim().split("\\s+");
     int l=0;
     int r=s1.length-1;
     while(l<r){
        String c=s1[l];
        s1[l]=s1[r];
        s1[r]=c;
        l++;
        r--;
     }
     return String.join(" ",s1);
    }
}