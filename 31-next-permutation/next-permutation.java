class Solution {
    public void reverse(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        if(nums.length==1){
            return;
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums);
            return;
        }
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        Arrays.sort(nums, index + 1, nums.length);
    }
}