class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int o=x;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(o==rev){
            return true;
        }
        return false;
    }
}