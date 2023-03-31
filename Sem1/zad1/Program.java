package zad1;

/* Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
 а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
Sample Input 1:
10
3
2
Sample Output 1:
8 
*/
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int h: ");
        int h = iScanner.nextInt();
        System.out.printf("int a: ");
        int a = iScanner.nextInt();
        System.out.printf("int b: ");
        int b = iScanner.nextInt();
        iScanner.close();
        int count = 0;
        while (h - a> 0){
            h = h - a + b;
            count++;
        }
        count++;
        System.out.println("На"+" "+ count+" день улитка доползёт до вершины шеста");
    }
}
