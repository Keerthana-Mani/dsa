class Solution {
    public int hammingWeight(int n) {
        String t="";
        while(n>0){
            int n1=n%2;
            t+=n1;
            n=n/2;
        }
        int c=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}