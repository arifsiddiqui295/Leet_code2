class Solution {
    public boolean isSubsequence(String a, String b) {
        if (a.length() == 0) {
            return true;
        }
        if (b.length() == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        for (int k = 0; k < b.length(); k++) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
            if (i == a.length()) {
                return true;
            }
        }
        return false;
    }
}