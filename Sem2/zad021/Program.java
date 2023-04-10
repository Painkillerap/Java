package zad021;

// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. 
// Определите индексы первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 28
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку чисел через пробел: ");
        String str = iScanner.nextLine();
        System.out.printf("Введите число: ");
        int a = iScanner.nextInt();
        String s=String.valueOf(a);
        iScanner.close();
        //str.indexOf(a);
        System.out.println(str.indexOf(s));
        System.out.println(str.lastIndexOf(s));
    }
}
