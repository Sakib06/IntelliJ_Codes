package theoryAssignment_1;

import java.util.*;

public class Catapult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Read the heights of the hills
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Process the queries
        int successfulDeliveries = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1; // Convert 1-based indexing to 0-based indexing
            int b = sc.nextInt() - 1;
            if (heights[a] <= heights[b]) {
                successfulDeliveries++;
            }
        }

        System.out.println(successfulDeliveries);
    }
}

