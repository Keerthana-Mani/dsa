class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
int maxKey = -1;

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxValue) {
        maxValue = entry.getValue();
        maxKey = entry.getKey();
    }
}

return maxKey;
        

    }
}