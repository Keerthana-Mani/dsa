class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int r=0;
        while(r<haystack.length()){
            if(r-l+1==needle.length()){
                boolean match=true;
                for(int i=0;i<needle.length();i++){
                    if(haystack.charAt(l+i)!=needle.charAt(i)){
                        match=false;
                        break;
                    }
                    
                }
                if(match){
                        return l;
                    }
                l++;
            }
            r++;
        }
        return -1;

    }
}