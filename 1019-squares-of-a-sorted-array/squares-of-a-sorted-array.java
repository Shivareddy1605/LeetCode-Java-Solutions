class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int arr[] = new int[nums.length];
        int index=arr.length-1;
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(leftSquare<rightSquare){
                arr[index]=rightSquare;
                right--;
            }else{
                arr[index]=leftSquare;
                left++;
            }

            index--;
        }
        return arr;
        
    }
}