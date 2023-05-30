package theoryAssignment_1;
import java.util.Scanner;
import java.util.Stack;

public class BracketSequence {
    public static int longestValidBracketSequence(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        int lastInvalid = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    lastInvalid = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        maxLength = Math.max(maxLength, i - lastInvalid);
                    } else {
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int maxLength = longestValidBracketSequence(s);
        System.out.println("The length of the longest valid bracket sequence is: " + maxLength);
    }
}