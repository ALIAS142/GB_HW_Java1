//3) Реализовать простой калькулятор (+-/*)
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int answer = 0;
        char operation;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number one: ");
        num1 = reader.nextInt();
        System.out.print("Enter number two: ");
        num2 = reader.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        operation = reader.next().charAt(0);
        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.printf("Error!");
                return;
        }

        System.out.printf("%d", answer);

    }
}






//num1 + " " + operation + " " + num2 + " = " +


