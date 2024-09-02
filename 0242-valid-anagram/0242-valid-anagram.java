class Solution {
    public boolean isAnagram(String s1, String s2) {
         if (s1.length() != s2.length()) return false;

        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (!mp1.containsKey(s1.charAt(i))) {
                mp1.put(s1.charAt(i), 1);
            } else {
                mp1.put(s1.charAt(i), mp1.get(s1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!mp2.containsKey(s2.charAt(i))) {
                mp2.put(s2.charAt(i), 1);
            } else {
                mp2.put(s2.charAt(i), mp2.get(s2.charAt(i)) + 1);
            }
        }
        return mp1.equals(mp2);
    }
}