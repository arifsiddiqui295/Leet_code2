class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;

        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }

        sum2 = mean * (rolls.length + n) - sum1;

        if (sum2 < n || sum2 > 6 * n) {
            return new int[0];
        }

        int div = sum2 / n;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = div;
            sum += arr[i];
        }

        int diff = sum2 - sum;
        for (int i = 0; i < diff; i++) {
            arr[i]++; 
        }

        return arr;
    }
}
