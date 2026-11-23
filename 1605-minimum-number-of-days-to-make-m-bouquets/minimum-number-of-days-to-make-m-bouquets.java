class Solution {
    public int bouquetCount(int n, int[] nums, int k, int m, int mid) {
        int count = 0, total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                count++;
                if (count == k) {
                    total++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return total;
    }

    public int minDays(int[] nums, int m, int k) {
        if (m * k > nums.length) {
            return -1;
        }
        int n = nums.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int x : nums) {
            max = Math.max(x, max);
            min = Math.min(x, min);
        }
        int low = min;
        int high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (bouquetCount(n, nums, k, m, mid) >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}