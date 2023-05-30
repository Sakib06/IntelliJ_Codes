package theoryAssignment_1;

import java.util.*;

public class ConveyorBelts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        // Read the table
        char[][] table = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                table[i][j] = row.charAt(j);
            }
        }

        // Process the events
        for (int i = 0; i < q; i++) {
            String event = sc.next();
            if (event.equals("A")) {
                // Bread appears at position (x, y)
                int x = sc.nextInt() - 1; // Convert 1-based indexing to 0-based indexing
                int y = sc.nextInt() - 1;
                int[] position = {x, y};

                // Follow the conveyor belts until arriving at a seat
                Set<String> visited = new HashSet<>(); // Set to keep track of visited positions
                while (true) {
                    char belt = table[position[0]][position[1]];
                    if (belt == '^') {
                        position[0]--;
                    } else if (belt == '<') {
                        position[1]--;
                    } else if (belt == '>') {
                        position[1]++;
                    }
                    // Check if the bread has reached a seat or is stuck in an infinite loop
                    if (position[0] < 0 || position[0] > n || position[1] < 0 || position[1] > m) {
                        // The bread has reached a seat
                        System.out.println(position[0] + " " + position[1]);
                        break;
                    } else if (visited.contains(position[0] + " " + position[1])) {
                        // The bread is stuck in an infinite loop
                        System.out.println(-1 + " " + -1);
                        break;
                    }
                    visited.add(position[0] + " " + position[1]);
                }
            } else if (event.equals("C")) {
                // Change the conveyor belt at position (x, y) to c
                int x = sc.nextInt() - 1; // Convert 1-based indexing to 0-based indexing
                int y = sc.nextInt() - 1;
                char c = sc.next().charAt(0);
                table[x][y] = c;
            }
        }
    }
}

