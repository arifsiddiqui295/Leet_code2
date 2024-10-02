class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int newdigit = 0;
        int copy = x;
        while (x != 0) {
            int rem = x % 10;
            if (newdigit > (Integer.MAX_VALUE - rem)) {
                return false;
            }
            newdigit = newdigit * 10 + rem;
            x = x / 10;
        }
        if (newdigit == copy) {
            return true;
        }
        return false;
    }
}