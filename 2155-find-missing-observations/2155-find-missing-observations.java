class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum1 = 0;
        int sum2 = 0;
        int sum = 0;

        // Calculate the sum of the existing rolls
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }

        // Calculate the sum of the missing rolls
        sum2 = mean * (rolls.length + n) - sum1;

        // If the required sum cannot be achieved, return an empty array
        if (sum2 < n || sum2 > 6 * n) {
            return new int[0];
        }

        int div = sum2 / n;
        int[] arr = new int[n];

        // Fill the array with the base value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = div;
            sum += arr[i];
        }

        // Distribute the remaining difference across the array
        int diff = sum2 - sum;
        for (int i = 0; i < diff; i++) {
            arr[i]++; // Increase some elements by 1 to match the required sum
        }

        return arr;
    }
}
