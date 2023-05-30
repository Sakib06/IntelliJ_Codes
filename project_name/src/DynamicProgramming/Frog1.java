package DynamicProgramming;

import java.util.Arrays;

public class Frog1 {
    public static void main(String[] args) {
        int[] h = {1, 2, 3, 4, 5};
        int N = 5;
        System.out.println(minCost(h, N));
    }

    public static int minCost(int[] h, int N) {
        int[] dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = Math.min(dp[i-1] + Math.abs(h[i-1] - h[i]), dp[i-2] + Math.abs(h[i-2] - h[i]));
        }

        return dp[N];
    }
}

