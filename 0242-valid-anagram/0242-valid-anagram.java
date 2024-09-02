class Solution {
    public boolean isAnagram(String s1, String s2) {
       
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> mp1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (!mp1.containsKey(s1.charAt(i))) {
                mp1.put(s1.charAt(i), 1);
            } else {
                mp1.put(s1.charAt(i), mp1.get(s1.charAt(i)) + 1);
            }
        }
        for(int i = 0 ;i<s2.length();i++){
            if(!mp1.containsKey(s2.charAt(i))) return false;
            mp1.put(s2.charAt(i),mp1.get(s2.charAt(i))-1);
        }
        
        for(var e : mp1.entrySet()){
            if(e.getValue()!=0) return false;
        }
        
        return true;
    }
}