class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1=0,ele1=Integer.MIN_VALUE,count2=0,ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                ele1=nums[i];
                count1++;
            }else if(count2==0 && nums[i]!=ele1){
                ele2=nums[i];
                count2++;
            }else if(ele1==nums[i]){
                count1++;
            }else if(ele2==nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }          
        }
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1) c1++;
            if(nums[i]==ele2) c2++;
        }
        int x = nums.length/3;
        if(c1>x){
            list.add(ele1);
        }
        if(c2>x){
            list.add(ele2);
        }

        return list;
        
    }
}