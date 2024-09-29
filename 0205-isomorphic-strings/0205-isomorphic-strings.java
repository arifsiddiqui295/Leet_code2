class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                char curr_value = map.get(ch);
                if (curr_value != (t.charAt(i))) {
                    return false;
                }
            } else {
                if (set.add(t.charAt(i))) {
                    map.put(ch, t.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}