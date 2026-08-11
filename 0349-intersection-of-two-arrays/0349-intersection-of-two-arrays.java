class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>l=new ArrayList<>();
        for(int nums:nums1){
            set.add(nums);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                l.add(nums2[i]);
                set.remove(nums2[i]);
            }

        }
        int[] arr = l.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
        return arr;
    }
}