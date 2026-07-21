class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
      int mc=0;
      int ml=0;
      for(int i=0;i<s.length();i++){
        mc+=Math.abs(s.charAt(i) - t.charAt(i));
        while(mc>maxCost){
            mc -= Math.abs(s.charAt(l) - t.charAt(l));
            l++;
        }
        ml = Math.max(ml, i - l+ 1);
      }
      return ml;
    }
}