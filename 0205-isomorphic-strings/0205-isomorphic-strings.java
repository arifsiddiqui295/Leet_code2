class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Character> mp1 = new HashMap<>();
        HashSet<Character> st1 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            if (!mp1.containsKey(s1.charAt(i))) {
                if (st1.add(s2.charAt(i))) {
                    mp1.put(s1.charAt(i), s2.charAt(i));
                } else {
                    return false;
                }
            } else {
                Character curr_value = mp1.get(s1.charAt(i));
                if (curr_value != s2.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}