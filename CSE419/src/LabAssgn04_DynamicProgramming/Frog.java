package LabAssgn04_DynamicProgramming;

import java.util.Scanner;

public class Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n+1];
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[1] = 0; // initialize dp[1] to be 0
        for (int i = 2; i <= n; i++) {
            // calculate the minimum cost to reach stone i
            dp[i] = Math.min(dp[i-1], dp[i-2]) + Math.abs(h[i] - h[i-1]);
        }
        System.out.println(dp[n]);
    }
}
