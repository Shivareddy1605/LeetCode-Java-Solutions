class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(set.contains(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }else{
                if(map.get(s.charAt(i))==t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}