class Solution {
    public List<Integer> rows(int row){
        List<Integer> list = new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans/=i;
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();
       for(int i=1;i<=numRows;i++){
            ans.add(rows(i));
       }
       return ans;
        
    }
}