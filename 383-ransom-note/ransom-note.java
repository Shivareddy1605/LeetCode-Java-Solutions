class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char arr : magazine.toCharArray()){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        for(char x : ransomNote.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0){
                return false;
            }
            map.put(x,map.get(x)-1);
        }

        return true;
    }
}