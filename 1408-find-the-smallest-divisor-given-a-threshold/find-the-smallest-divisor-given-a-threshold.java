class Solution {
    public int func(int ele,int[] nums){
        int sum=0;
        for(int x : nums){
            sum+=(int) Math.ceil((double)x/ele);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int x:nums){
            if(x>=max){
                max=x;
            }
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(mid,nums)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return low;

    }
}