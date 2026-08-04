class Solution{
    public List<Integer> findMissingElements(int[] nums){
        HashSet<Integer>s1=new HashSet<>();
        for(int num:nums){
            s1.add(num);
        }
        int min=Collections.min(s1);
        int max=Collections.max(s1);
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=min;i<max;i++){
        if(!s1.contains(i)){
            list.add(i);
        }
       }
      return list;
       
        
    }
}