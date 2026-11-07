class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0;
        int high=num/2;
        if(num==1){
            return true;
        }
        while(low<=high){
            int mid=(low+high)/2;
            long sqrt= (long)mid*mid;

            if(sqrt==num){
                return true;
            }else if(sqrt>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }   
        return false;     
    }
}