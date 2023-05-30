package cse419_theoryAssignment_1;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static int getMaxArea(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int max_area = arr[0];
        int left_smaller[] = new int[n];
        int right_smaller[] = new int[n];
        for (int i = 0; i < n; i++) {
            left_smaller[i] = -1;
            right_smaller[i] = n;
        }

        int i = 0;
        while (i < n) {
            while (!s.empty() && s.peek() != -1 && arr[i] < arr[s.peek()]) {
                right_smaller[s.peek()] = (int)i; s.pop();
            }
            if (i > 0 && arr[i] == arr[(i - 1)]) {
                left_smaller[i] = left_smaller[(int)(i - 1)];
            }
            else {
                left_smaller[i] = s.peek();
            }
            s.push(i);
            i++;
        }

        for (i = 0; i < n; i++) {
            max_area = Math.max(max_area, arr[i] * (right_smaller[i] - left_smaller[i] - 1));
        }

        return max_area;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // number of cases
        int[] hist = new int[0];

        for(int x=0; x<m; x++) {
            int n = sc.nextInt(); // values of heights
            hist = new int[n];
            for (int i = 0; i < n; i++) {
                hist[i] = sc.nextInt();
            }
            System.out.println("Case " + (x+1) + ": " + getMaxArea(hist, hist.length));
        }
        /*for(int j=0; j<m; j++) {
            System.out.println("Case " + m + ": " + getMaxArea(hist, hist.length));
        }*/
    }
}
