class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        int len=0;
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)!=' '){
                len++;
            }else{
                return len;
            }
        }
        return sb.length();


        
    }
}