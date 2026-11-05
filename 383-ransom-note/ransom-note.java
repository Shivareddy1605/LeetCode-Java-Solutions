class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        TreeMap<Character,Integer> mag = new TreeMap<>();

        for(int i=0;i<ransomNote.length();i++){
            map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(char key : map.keySet()){
            if(mag.containsKey(key)){
                if(map.get(key)<=mag.get(key)){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;

    }
}