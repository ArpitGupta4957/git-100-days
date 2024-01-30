import java.util.Stack;

class git_28 {
    public int evalRPN(String[] tokens) {
        // Initialize a stack to store the operands
        Stack<Integer> stack = new Stack<>();

        // Iterate through the tokens
        for (int i = 0; i < tokens.length; i++) {
            // Check if the token is an operator
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                // If the stack is empty, throw an exception
                if (stack.isEmpty()) {
                    return 0;

                }
                // Pop the top two operands from the stack
                int num1 = stack.pop();
                int num2 = stack.pop();

                // Calculate the answer based on the operator
                int ans = 0;
                switch (tokens[i]) {
                    case "+":
                        ans = num2 + num1;
                        break;
                    case "-":
                        ans = num2 - num1;
                        break;
                    case "*":
                        ans = num2 * num1;
                        break;
                    case "/":
                        ans = num2 / num1;
                        break;
                }

                // Push the answer back onto the stack
                stack.push(ans);
            } else {
                // If the token is not an operator, push it onto the stack as an operand
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        // Return the final answer
        return stack.peek();
    }

    public static void main(String[] args) {
        git_28 g = new git_28();
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(g.evalRPN(tokens));
    }
}