class Solution {
    public boolean isPalindrome(String s) {
        String ch="";
        for(char nums:s.toCharArray()){
            if(Character.isLetterOrDigit(nums)){
                ch+=Character.toLowerCase(nums);
            }

        }
        int l=0;
        int r=ch.length()-1;
         while(l<r){
            if(ch.charAt(l)==ch.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
         }
         return true;
    }
}