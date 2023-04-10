// В первый день спортсмен пробежал x километров, а затем он каждый день
// увеличивал пробег на 10% от предыдущего значения. По данному числу y
// определите номер дня, на который пробег спортсмена составит не менее y
// километров.
// Входные данные
// Программа получает на вход действительные числа x и y
// Выходные данные
// Программа должна вывести одно натуральное число.
// Sample Input:
// 10
// 20
// Sample Output:
// 9
package zad003;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int x: ");
        double x = iScanner.nextInt();
        System.out.printf("int y: ");
        double y = iScanner.nextInt();

        iScanner.close();
        int count = 0;
        while (y > x){
            x = x + x*0.1;
            count++;
        }
        count++;
        System.out.println("На"+" "+ count+" спортсмен пробежит не менее" +" "+ y+" километров");
    }
}
