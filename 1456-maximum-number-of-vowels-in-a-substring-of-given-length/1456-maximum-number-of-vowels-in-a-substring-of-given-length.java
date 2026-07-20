class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int maxc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }
           if (i >= k - 1) {
    maxc = Math.max(maxc, c);

    char ch = s.charAt(i - k + 1);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        c--;
    }
}
        }
        return maxc;
    }
}