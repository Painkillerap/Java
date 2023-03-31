// Напишите программу, которая выводит в столбик целые числа от 
// a до b (a >= b) с шагом c. Границы включаются.
// Входные данные
// Заданы три целых числа а, b, с, где a > b
// Выходные данные
// Выведите единственное число - ответ на задачу.
// Sample Input:
// 20
// 1
// 2
// Sample Output:
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2
package zad5;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int a = iScanner.nextInt();
        System.out.printf("int b: ");
        int b = iScanner.nextInt();
        System.out.printf("int c: ");
        int c = iScanner.nextInt();
        iScanner.close();
        for (int i = a; i >= b; i-=c) {
            System.out.println(i);
            }
    }
}
