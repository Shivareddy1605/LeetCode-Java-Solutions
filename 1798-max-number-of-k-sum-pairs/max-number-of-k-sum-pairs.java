class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0;
        int ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            sum=nums[i]+nums[j];
            if(sum>k){
                j--;
            }else if(sum<k){
                i++;
            }else{
                ans++;
                i++;
                j--;
            }
        }
        return ans;
    }
}