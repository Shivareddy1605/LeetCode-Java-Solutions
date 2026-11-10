class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int left=0;
        int right=k-1;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        while(right<nums.length-1){
            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            max=Math.max(max,sum);
        }
        return (double) max/k;
        
    }
}