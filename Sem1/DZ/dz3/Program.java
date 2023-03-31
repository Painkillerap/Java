// Реализовать простой калькулятор (+,-,*,/), только с целыми числами.
package DZ.dz3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = iScanner.nextInt();
        System.out.printf("Введите операцию (+, -, *, /): ");
        char operator = iScanner.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Введите корректную операцию");
                return;
        }
        System.out.println("Результат операции равен: " + result);
    }
}