class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>s=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            s.add(ch);
        }
        int c=0;
        for(int i=0;i<stones.length();i++){
            if(s.contains(stones.charAt(i))){
                c++;
            }
        }
        return c;
    }
}