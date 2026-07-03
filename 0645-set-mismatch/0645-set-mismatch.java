class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int duplicate = -1;
        int missing = -1;

        // Find the duplicate number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                duplicate = entry.getKey();
                break;
            }
        }

        // Find the missing number
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}