//Напишите программу, которая принимает с консоли число в формате byte и записывает 
//его в файл ”result.txt”.Требуется перехватить все возможные ошибки и вывести их в логгер.
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
// public static void main(String[] args) {
// }
// public String findJewelsInStones(String jewels, String stones){
//     return "";
// }

package zad026;

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
