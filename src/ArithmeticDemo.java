public class ArithmeticDemo {
    public static void main(String[] args) {
        // Step 1: Declare and initialize integer variables
        int num1 = 10;
        int num2 = 5;

        // Step 2: Declare and initialize a double variable
        double num3 = 3.0;

        // Step 3: Perform addition
        int sum = num1 + num2;

        // Step 4: Perform subtraction
        int difference = num1 - num2;

        // Step 5: Perform multiplication
        int product = num1 * num2;

        // Step 6: Perform integer division
        int quotient = num1 / num2;

        // Step 7: Perform modulus operation
        int remainder = num1 % num2;

        // Step 8: Demonstrate operator precedence
        // The expression is num1 + num2 * 2 - (num1 / num2)
        // Operator precedence: multiplication and division happen before addition and subtraction
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // Step 9: Output the results with labels
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult);
        // Expression Result explanation: num1 + num2 * 2 - (num1 / num2)
        // Order of operations: First multiplication (num2 * 2), then division (num1 / num2),
        // and finally addition and subtraction from left to right.
    }
}
