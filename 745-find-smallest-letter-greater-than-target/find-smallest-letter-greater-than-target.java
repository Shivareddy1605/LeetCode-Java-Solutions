class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        char ans=' ';
        while(low<=high){
            int mid=(low+high)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans==' '){
            return letters[0];
        }else{
            return ans;
        }
        

    }
}