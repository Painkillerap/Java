// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение 
//всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120

package zad004;

import java.util.Scanner;
public class Program4 {
public static int factor(int n) {
    if(n==1 || n==0)return 1;
    return n * factor(n-1);
}
public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println(factor(n));
    }
}

