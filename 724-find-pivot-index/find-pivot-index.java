class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int pivot = -1;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                pivot = i;
                break;
            }
            leftSum += nums[i];
        }
        return pivot;

    }
}