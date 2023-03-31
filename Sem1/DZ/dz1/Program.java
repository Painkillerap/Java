// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
// Затем вводятся 2 числа из этого диапазона. Используя данные из массива
// найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

package DZ.dz1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        int[] cub = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cub[i - 1] = i * i * i;
        }
        int[] results = getCub(cub, a, b);
    System.out.println("Куб первого числа: " + results[0]);
    System.out.println("Куб второго числа: " + results[1]);
    }
    public static int[] getCub(int[] cubes, int a, int b) {
        int[] results = new int[2];
        results[0] = cubes[a - 1];
        results[1] = cubes[b - 1];
        return results;
    }


}
