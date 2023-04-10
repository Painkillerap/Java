
/* 
Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка,
в которой перечислены слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй -сколько слов выписал Олег.
Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
8
5
*/
package zad022;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите любимую букву Маши: ");
        String a = iScanner.nextLine();
        System.out.printf("Введите любимую букву Олега: ");
        String b = iScanner.nextLine();
        // System.out.printf("Введите список слов через пробел: ");
        String str = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        // String str=iScanner.next();
        iScanner.close();
        String[] array = str.split(" ");
        int count1 = 0;
        int count2 = 0;
        for (String i : array) {
            System.out.println(i);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].indexOf(a) != -1) {
                count1++;
            }
            if (array[i].indexOf(b) != -1) {
                count2++;
            }
        }
        System.out.printf("%s\n%s", count1, count2);
    }

}
