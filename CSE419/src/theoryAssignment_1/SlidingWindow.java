package theoryAssignment_1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // Step 1: remove elements that are smaller than the current element
            while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
                deque.removeLast();
            }

            // Step 2: add the current index to the deque
            deque.addLast(i);

            // Step 3: remove the front element if it is outside the window
            if (i - deque.getFirst() + 1 > k) {
                deque.removeFirst();
            }

            // Step 4: add the maximum element to the result array
            if (i + 1 >= k) {
                result[i - k + 1] = nums[deque.getFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by spaces: ");
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Enter the size of the sliding window: ");
        int k = scanner.nextInt();

        int[] result = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));

    }
}
