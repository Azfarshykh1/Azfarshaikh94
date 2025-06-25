import java.util.Stack;

public class ParenthesesMatcher {

    // Method to check if parentheses are balanced
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty(); // True if all parentheses matched
    }

    public static void main(String[] args) {
        // Example balanced
        String expr1 = "(a+b)*(c+d)";
        String expr2 = "((a+b)";

        // Unbalanced
        String expr3 = "a+b))";

        System.out.println(expr1 + " : " + (isBalanced(expr1) ? "Balanced" : "Not Balanced"));
        System.out.println(expr2 + " : " + (isBalanced(expr2) ? "Balanced" : "Not Balanced"));
        System.out.println(expr3 + " : " + (isBalanced(expr3) ? "Balanced" : "Not Balanced"));
    }
}