// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа.
//Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10
package DZ.dz2;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество чисел: ");
        int n = iScanner.nextInt();
        int[] arrray = new int[n];
        for (int i = 0; i < n; i++) {
            arrray[i] = iScanner.nextInt();
        }
        System.out.printf("Введите число на которое нужно умножить: ");
        int b = iScanner.nextInt();
        iScanner.close();
        for (int i = 0; i <= n; i++) {
            System.out.println(arrray[i] * b);
        }
    }
}