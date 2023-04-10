// Дан список. Выведите те его элементы, которые встречаются в списке только
// один раз. Элементы нужно выводить в том порядке, в котором они встречаются 
// в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1


package zad007;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("cnt: ");
        int cnt = iScanner.nextInt();
        iScanner.close();
        int[] array = new int[cnt];
        for (int i = 0; i < array.length; i++) {
            array[i] = iScanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j])
                count++;
            }
            if (count==1) {
                System.out.println("\n" + array[i]);
            }
        }
    }
}

