class Solution {
    public void merge(int[] nums, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                list.add(nums[left]);
                left++;
            } else {
                list.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            list.add(nums[left]);
            left++;
        }
        while (right <= high) {
            list.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }

    public int mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return 0;
        int mid = (low + high) / 2;

        int leftc = mergeSort(nums, low, mid);
        int rightc = mergeSort(nums, mid + 1, high);
        int cpairs = countpairs(nums, low, mid, high);
        merge(nums, low, mid, high);

        return leftc+rightc+cpairs;
    }

    public int countpairs(int nums[], int low, int mid, int high) {
        int c = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && nums[i] > nums[right] * 2L) {
                right++;
            }
            c += (right - (mid + 1));
        }
        return c;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}