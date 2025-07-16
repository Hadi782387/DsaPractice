import java.io.*;
import java.util.*;

public class InfixEvaluation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    display(operators,operands);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && operators.peek() != '(' &&
                        precedence(ch) <= precedence(operators.peek())) {
                        display(operators,operands);

                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
         display(operators,operands);
        }

        System.out.println(operands.peek());
    }
    public static void display(Stack<Character>operators,Stack<Integer>operands){
        char Operator = operators.pop();
        int v2 = operands.pop();
        int v1 = operands.pop();
        int opv = operation(Operator, v1, v2);
        operands.push(opv);
    }
    public static int precedence(char Operator) {
        if (Operator == '+' || Operator == '-') return 1;
        else if (Operator == '*' || Operator == '/') return 2;
        return 0;
    }

    public static int operation(char Operator, int v1, int v2) {
        if (Operator == '+') return v1 + v2;
        else if (Operator == '-') return v1 - v2;
        else if (Operator == '*') return v1 * v2;
        else if (Operator == '/') return v1 / v2;
        return 0;
    }
}
