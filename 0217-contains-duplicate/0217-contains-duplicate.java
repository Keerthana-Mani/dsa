class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int num:nums){
            if(h.containsKey(num)){
                return true;
            }
            h.put(num,1);
        }
        return false;

    }
}