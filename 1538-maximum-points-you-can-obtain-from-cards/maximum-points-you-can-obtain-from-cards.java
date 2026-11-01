class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=cardPoints.length-1;
        int max=0,sum=0;

        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
            max=sum;
        }

        for(int i=k-1;i>=0;i--){
            sum-=cardPoints[i];
            sum+=cardPoints[right];
            right--;
            max=Math.max(max,sum);
        }
        return max;
        
    }
}