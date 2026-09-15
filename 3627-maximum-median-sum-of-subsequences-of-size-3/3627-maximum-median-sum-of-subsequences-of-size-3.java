class Solution {
    public long maximumMedianSum(int[] nums) {

        Arrays.sort(nums);

        long sum = 0;
        int n = nums.length;

        int i = n - 2;

        while (i >= n / 3) {
            sum += nums[i];
            i -= 2;
        }

        return sum;
    }
}