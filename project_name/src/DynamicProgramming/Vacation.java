package DynamicProgramming;

import java.util.Arrays;

public class Vacation {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 2}, {5, 2, 1}, {4, 1, 5}};
        int N = 3;
        System.out.println(maxHappiness(a, N)); // prints 9
    }

    public static int maxHappiness(int[][] a, int N) {
        // Initialize the dp table with -1
        int[][] dp = new int[N+1][3];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }

        // The maximum happiness on day 0 is 0
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;

        // Fill in the rest of the table using the recurrence
        for (int i = 1; i <= N; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2])) + a[i-1][0];
            dp[i][1] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2])) + a[i-1][1];
            dp[i][2] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2])) + a[i-1][2];
        }

        // Return the maximum happiness on the last day
        return Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2]));
    }
}

