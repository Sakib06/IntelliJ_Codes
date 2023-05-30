package LabAssgn04_DynamicProgramming;

import java.util.Scanner;

public class Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        long[][] dp = new long[n+1][2];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // initialize dp[i][0] to be 0
        }
        for (int i = n; i >= 1; i--) {
            // calculate the maximum score that Taro can achieve, given that there are i elements remaining in the sequence
            dp[i][1] = Math.max(a[i] + Math.min(dp[i-1][0], dp[i-1][1]), a[1] + Math.min(dp[i-1][0], dp[i-1][1]));
        }
        System.out.println(dp[1][1]);
    }
}

