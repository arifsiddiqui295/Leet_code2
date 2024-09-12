class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <=right; i++) {
            char firstChar = words[i].charAt(0);
            char lastChar = words[i].charAt(words[i].length() - 1);
            if ((firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') &&
                    (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u')) {
                count++;
            }
        }
        return count;
    }
}
