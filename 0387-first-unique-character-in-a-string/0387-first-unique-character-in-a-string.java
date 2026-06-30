class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(char nums:s.toCharArray()){
        if(map.containsKey(nums)){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }else{
            map.put(nums,1);
        }
        }
        for(int i=0;i<s.length();i++){
             if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
       
       return -1; 
    }
}