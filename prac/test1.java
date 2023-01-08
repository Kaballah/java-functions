import java.util.Scanner;

public class test1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first operand: ");
        int num1 = input.nextInt();
        System.out.print("Enter an operation: ");
        String operatorOne = input.next();
        System.out.print("Enter second operand: ");
        int num2 = input.nextInt();

        if(operatorOne.equals("+")) {
            System.out.println(num1 + " " + operatorOne + " " + num2 + " = " + sum(num1, num2));
        } else if(operatorOne.equals("-")) {
            System.out.println(num1 + " " + operatorOne + " " + num2 + " = " + diff(num1, num2));
        } else if(operatorOne.equals("*")) {
            System.out.println(num1 + " " + operatorOne + " " + num2 + " = " + mult(num1, num2));
        } else if(operatorOne.equals("/")) {
            System.out.println(num1 + " " + operatorOne + " " + num2 + " = " + div(num1, num2));
        }
    }

    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static int diff(int number1, int number2) {
        int diff = number1 - number2;
        return diff;
    }

    public static int mult(int number1, int number2) {
        int mult = number1 * number2;
        return mult;
    }

    public static float div(int number1, int number2) {
        float div = number1 / number2;
        return div;
    }
}