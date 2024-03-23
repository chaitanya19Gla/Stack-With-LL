//public class RPN {
//}
import java.util.LinkedList;

public class RPN {
    public static int evaluateRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(operand1 / operand2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] expression = {"2", "1", "+", "3", "*"};
        System.out.println("Result: " + evaluateRPN(expression)); // Output: 9
    }
}
