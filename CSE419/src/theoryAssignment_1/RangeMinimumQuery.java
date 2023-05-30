package theoryAssignment_1;

import java.util.*;

public class RangeMinimumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Read the list of numbers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Process the queries
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for (int j = l; j <= r; j++) {
                min = Math.min(min, numbers[j]);
            }
            System.out.println(min);
        }
    }
}

