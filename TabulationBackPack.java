public class TabulationBackPack {
    static int knapsack(int[] weight, int[] value, int capacity, int n) {
        int[][] dp = new int[n][capacity + 1];
              for (int c = weight[0]; c <= capacity; c++) {
            dp[0][c] = value[0];
        }
        for (int i = 1; i < n; i++) {
            for (int c = 0; c <= capacity; c++) {
                int notTake = dp[i - 1][c];
                int take = Integer.MIN_VALUE;
                if (weight[i] <= c) {
                    take = value[i] + dp[i - 1][c - weight[i]];
                }
                dp[i][c] = Math.max(take, notTake);
            }
        }
        return dp[n - 1][capacity];
    }
    public static void main(String[] args) {
        int[] weight = {1, 2, 4, 5};
        int[] value = {5, 4, 8, 6};
        int capacity = 5;
        int n = weight.length;
        int result = knapsack(weight, value, capacity, n);
        System.out.println("Maximum value in Knapsack = " + result);
    }
}