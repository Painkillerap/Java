// +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
// заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
// выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
// что его нет.
package DZ.dz4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Уравнение вида q + w = e.\n Введите q: ");
        String q = iScanner.nextLine();
        System.out.printf("Введите w: ");
        String w = iScanner.nextLine();
        System.out.printf("Введите e: ");
        Integer e = iScanner.nextInt();
        boolean f = true;
        for (int i = 0; i <= 10; i++) {
            String s = String.valueOf(i);
            char digit = s.toCharArray()[0];
            String num1 = q.replace('?', digit);
            String num2 = w.replace('?', digit);
            if ((Integer.parseInt(num1) + Integer.parseInt(num2)) == e) {
                String oldString = num1 + "+" + num2 + "=" + e;
                System.out.printf(oldString);
                f = false;
                break;
            }
        }
        if (f == true) {
            System.out.println("Решения нет");
        }
    }
}