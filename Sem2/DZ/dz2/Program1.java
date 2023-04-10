// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
package DZ.dz2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String S = iScanner.nextLine();
        System.out.println("Введите массив индексов через запятую(1, 2, 3): ");
        String num = iScanner.nextLine();
        iScanner.close();
        String StrArr[] = num.split(", ");
        int[] index = new int[StrArr.length];
        for (int i = 0; i < StrArr.length; i++) {
            index[i] = Integer.parseInt(StrArr[i]);
        }
        System.out.print(shuffle(S, index));
    }

    public static String shuffle(final String S, final int[] index) {
        String result = "";
        for (int i = 0; i < index.length; i++) {
            int j = index[i];
            result += S.charAt(j - 1);
        }
        return result;
    }
}
