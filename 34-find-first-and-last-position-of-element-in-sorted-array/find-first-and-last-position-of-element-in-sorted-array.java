class Solution {
    public int findFirst(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public int findLast(int[] nums, int target) {
        int index=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index-1;

    }

    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last = findLast(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        return new int[]{first,last};

    }
}