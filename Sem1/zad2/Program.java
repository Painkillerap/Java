
/* 
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
если разрешается сделать один разлом по прямой между дольками (то есть разломить 
шоколадку на два прямоугольника).
Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек 
в шоколадке не превосходит 30000.
Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, 
в противном случае вывести слово NO.
Sample Input 1:
3 2 4
Sample Output 1:
YES
*/
package zad2;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        System.out.printf("int m: ");
        int m = iScanner.nextInt();
        System.out.printf("int k: ");
        int k = iScanner.nextInt();
        iScanner.close();
        int count = 0;
        if (k < n * m && k % n == 0 || k % m == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
