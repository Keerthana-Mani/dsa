class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String[]s1=s.split(" ");
        if(pattern.length()!=s1.length){
            return false;
        }int i=0;
        for(char ch:pattern.toCharArray()){
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(s1[i])){
                    return false;
                }
            }
            else{
                if (map.containsValue(s1[i])) {
    return false;
}
                map.put(ch,s1[i]);
            }
            i++;
        }
        return true;
    }
}