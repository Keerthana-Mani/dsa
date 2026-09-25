class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        char []t1=t.toCharArray();
        int i=0;
        if(s.length()!=t1.length){
            return false;
        }
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(t1[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(t1[i])){
                    return false;
                }
                 map.put(ch,t1[i]);
            }
            i++;
    
        }
        return true;
    }
}