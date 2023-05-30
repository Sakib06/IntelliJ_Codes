package LabAssgn04_DynamicProgramming;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] = 0; // initialize dp[0] to be 0
        for (int i = 1; i <= n; i++) {
            // calculate the maximum points of happiness that Taro can gain on the i-th day
            dp[i] = Math.max(Math.max(dp[i-1] + a[i][0], dp[i-1] + a[i][1]), dp[i-1] + a[i][2]);
        }
        System.out.println(dp[n]);
    }
}
