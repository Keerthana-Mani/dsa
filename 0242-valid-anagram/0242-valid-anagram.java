class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1=s.toCharArray();
        for(char nums:s1){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(int i=0;i<t.length();i++){
           char ch = t.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
}
        }
        if(map.isEmpty()){
            return true;
        }
      return false;  
    }
}