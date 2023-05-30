package theoryAssignment_1;

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
                    // No matching open bracket, so mark this position as the start of a new sequence
                    lastInvalid = i;
                } else {
                    // Pop the top element (the matching open bracket) and update the max length
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
        System.out.println(longestValidBracketSequence("()()")); // prints 2
        System.out.println(longestValidBracketSequence("(()())")); // prints 6
        System.out.println(longestValidBracketSequence("()(()")); // prints 2
        System.out.println(longestValidBracketSequence(")()())")); // prints 4
    }
}

