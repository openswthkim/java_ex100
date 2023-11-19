package java_ex100;

import java.util.Scanner;

public class ex100_78 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        boolean isFirstOperand = true;
        boolean isOperatorSet = false;
        char operator = ' ';

        while (scanner.hasNext()) {
            String input = scanner.next();

            if (input.equals("=")) {
                System.out.println(result);
                break;
            }

            if (isFirstOperand) {
                result = Integer.parseInt(input);
                isFirstOperand = false;
            } else {
                if (!isOperatorSet) {
                    operator = input.charAt(0);
                    isOperatorSet = true;
                } else {
                    int operand = Integer.parseInt(input);

                    // Perform calculation based on the operator
                    switch (operator) {
                        case '+':
                            result += operand;
                            break;
                        case '-':
                            result -= operand;
                            break;
                        case '*':
                            result *= operand;
                            break;
                        case '/':
                            if (operand != 0) {
                                result /= operand;
                            } else {
                                System.out.println("Error: Division by zero");
                                scanner.close();
                                return;
                            }
                            break;
                        default:
                            System.out.println("Invalid operator");
                            scanner.close();
                            return;
                    }
                    isOperatorSet = false;
                }
            }
        }
        scanner.close();
    }
}
