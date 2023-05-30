package theoryAssignment_1;

import java.util.*;

public class LittleElephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Read the array
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Process the queries
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt() - 1; // Convert 1-based indexing to 0-based indexing
            int r = sc.nextInt() - 1;

            // Count the number of elements that occur exactly x times in the range [l, r]
            int count = 0;
            for (int x = l; x <= r; x++) {
                int occurrences = 0;
                for (int y = l; y <= r; y++) {
                    if (a[y] == a[x]) {
                        occurrences++;
                    }
                }
                if (occurrences == a[x]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

