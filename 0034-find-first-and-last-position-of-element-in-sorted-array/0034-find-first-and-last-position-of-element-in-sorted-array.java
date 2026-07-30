class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            findFirst(nums, target),
            findLast(nums, target)
        };
    }

    private int findFirst(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                e = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                ans = mid;
                s = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}