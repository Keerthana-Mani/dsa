class Solution {
    public boolean isPalindrome(String s) {
        String str="";
       for(char ch:s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
           str+=Character.toLowerCase(ch);  
        }
       }
       int l=0;
       int r=str.length()-1;
       while(l<r){
        if(str.charAt(l)==str.charAt(r)){
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