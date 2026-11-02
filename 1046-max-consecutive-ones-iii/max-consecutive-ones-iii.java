class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int max=0;
        int zeroesCount=0;
        while(right<nums.length){
            if(nums[right]==0){
                zeroesCount++;
            }
            while(zeroesCount>k){
                if(nums[left]==1){
                    left++;
                }else{
                    zeroesCount--;
                    left++;
                }
            }

            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
        
    }
}