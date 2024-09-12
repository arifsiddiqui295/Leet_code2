class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean check = true;
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (allowed.indexOf(c) == -1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return count;
    }
}
