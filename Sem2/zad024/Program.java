// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита.
// Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите,
// что цифры не имеют разницы в записи нижнего и верхнего регистров.
// Sample Input:
// Good morning my dear friend. My fish.
// m
// Sample Output:
// 3

package zad024;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String text = iScanner.nextLine().toLowerCase();
        //System.out.printf("Введите букву: ");
        char simvol ='m';
        iScanner.close();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.toCharArray()[i]==simvol) {
                count++;
            }
        }
        System.out.printf("%s", count);
    }
}
