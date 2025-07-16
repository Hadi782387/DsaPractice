import java.io.*;
import java.util.Stack;

public class InfixConversions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Character> op = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                op.push(ch);
            } else if (Character.isLetterOrDigit(ch)) {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    process(op, postfix, prefix);
                }
                op.pop(); // remove '('
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.isEmpty() && op.peek() != '(' && precedence(ch) <= precedence(op.peek())) {
                    process(op, postfix, prefix);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            process(op, postfix, prefix);
        }

        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
    }

    public static void process(Stack<Character> op, Stack<String> postfix, Stack<String> prefix) {
        char operator = op.pop();

        // Postfix
        String postVal2 = postfix.pop();
        String postVal1 = postfix.pop();
        String post = postVal1 + postVal2 + operator;
        postfix.push(post);

        // Prefix
        String preVal2 = prefix.pop();
        String preVal1 = prefix.pop();
        String pre = operator + preVal1 + preVal2;
        prefix.push(pre);
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        return 0;
    }
}
