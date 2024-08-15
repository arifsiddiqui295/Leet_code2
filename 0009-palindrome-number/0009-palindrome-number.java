class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int copy = x;
        int newDigit = 0;
        while (x != 0) {
            int rem = x % 10;
            newDigit = newDigit * 10 + rem;
            x = x / 10;
        }
        if (copy == newDigit)
            return true;

        return false;
    }
}