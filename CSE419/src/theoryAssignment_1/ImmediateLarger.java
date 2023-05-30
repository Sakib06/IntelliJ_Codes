package theoryAssignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class ImmediateLarger {
    public static int[] findImmediateLarger(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int larger = -1; // initialise to -1 to indicate no larger number was found
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    larger = numbers[j];
                    break; // found a larger number, so we can stop searching
                }
            }
            result[i] = larger;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers: ");
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int[] result = findImmediateLarger(numbers);
        System.out.println(Arrays.toString(result));
    }
}

