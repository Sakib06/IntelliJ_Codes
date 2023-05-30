package LabAssgn04_DynamicProgramming;

import java.util.Scanner;

public class SpecialsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int caseNumber = 1; caseNumber <= t; caseNumber++) {
            String w = sc.next();
            int n = w.length();
            long[][] dp = new long[n][n];
            for (int i = 0; i < n; i++) {
                dp[i][i] = 1; // a single character string is always a palindrome
            }
            for (int len = 2; len <= n; len++) {
                for (int i = 0; i + len - 1 < n; i++) {
                    int j = i + len - 1;
                    if (w.charAt(i) == w.charAt(j)) {
                        dp[i][j] = dp[i+1][j-1] + dp[i+2][j] + dp[i][j-2];
                    } else {
                        dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                    }
                }
            }
            System.out.printf("Case #%d: %d\n", caseNumber, dp[0][n-1]);
        }
    }
}

