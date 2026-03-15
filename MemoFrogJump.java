import java.util.Arrays;

public class MemoFrogJump {

    static int frogJump(int i, int[] heights, int[] dp) {

        // Base case
        if (i == 0)
            return 0;

        // If already calculated
        if (dp[i] != -1)
            return dp[i];

        // Jump from i-1
        int jump1 = frogJump(i - 1, heights, dp)
                + Math.abs(heights[i] - heights[i - 1]);

        int jump2 = Integer.MAX_VALUE;

        // Jump from i-2
        if (i > 1) {
            jump2 = frogJump(i - 2, heights, dp)
                    + Math.abs(heights[i] - heights[i - 2]);
        }

        // Store result in dp
        dp[i] = Math.min(jump1, jump2);
        return dp[i];
    }

    public static void main(String[] args) {

        int[] heights = {10, 20, 30, 10};
        int n = heights.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        System.out.println(frogJump(n - 1, heights, dp));
    }
}