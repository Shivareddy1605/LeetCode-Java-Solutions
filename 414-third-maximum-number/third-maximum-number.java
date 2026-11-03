class Solution {
    public int thirdMax(int[] nums) {
        long FM=Long.MIN_VALUE;
        long SM=Long.MIN_VALUE;
        long TM=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==FM || nums[i]==SM || nums[i]==TM){
                continue;
            }

            if(nums[i]>FM){
                TM=SM;
                SM=FM;
                FM=nums[i];
            }else if(nums[i]>SM && nums[i]<FM){
                TM=SM;
                SM=nums[i];
            }else if (nums[i] > TM){
                TM=nums[i];
            }
        }
        if (TM == Long.MIN_VALUE) {
            return (int) FM;
        } else {
            return (int) TM;
        }
    }
}