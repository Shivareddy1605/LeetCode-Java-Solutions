class Solution {
    public boolean wordPattern(String pattern, String s) {
        int x =0;
        int wordsCount=1;
        int chCount=pattern.length();
        while(x<s.length()){
            if(s.charAt(x)==' '){
                wordsCount++;
            }
            x++;
        }

        if(wordsCount!=chCount){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int j=0;
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            StringBuilder sb = new StringBuilder();
            while(j<s.length() && s.charAt(j)!=' '){
                sb.append(s.charAt(j));
                j++;
            }
            j++;
            if(!map.containsKey(c)){
                if(set.contains(sb.toString())) return false;
                map.put(c,sb.toString());
                set.add(sb.toString());
            }else{
                if(!map.get(c).equals(sb.toString())){
                    return false;
                }
            }
        }
        return true;
    }
}