class Solution {
    public int compress(char[] chars) {
        int count = 0;
        int index = 0;
        char lastVisited = '\0';

        for (int i = 0; i < chars.length; i++) {
            if (count == 0) {
                lastVisited = chars[i];
                count = 1;
            } else if (chars[i] == lastVisited) {
                count++;
            } else {
                chars[index++] = lastVisited;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                lastVisited = chars[i];
                count = 1;
            }
        }

        chars[index++] = lastVisited;
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}
