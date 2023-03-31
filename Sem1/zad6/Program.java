// Вводится массив (сначала количество элементов, потом сами элементы).
//Найдите сумму его элементов с чётными индексами и выведите её.
//А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3
package zad6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("cnt: ");
        int cnt = iScanner.nextInt();
        // iScanner.close();
        int[] array = new int[cnt];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = iScanner.nextInt();
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("\n" + sum);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("\n" + array[i]);
            }
        }
    }
}
