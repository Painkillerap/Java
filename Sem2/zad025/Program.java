// Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю,
// что знаки препинания и пробелы, например. не являются ни тем ни другим. Если в
// строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
// Если же их равное количество, то выведите слово "Equal".
// Sample Input:
// 34Hi56
// Sample Output:
// Digit

package zad025;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст: ");
        String text = iScanner.nextLine().toLowerCase();
        iScanner.close();
        int Dig_count = 0;
        int Char_count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)>='0'&& text.charAt(i)<='9')
            Dig_count++;
            else if(text.charAt(i)>='a'&& text.charAt(i)<='z')
            Char_count++;
        }
        if(Dig_count>Char_count)
        System.out.println("Digit");
        if(Dig_count<Char_count)
        System.out.println("Letter");
        if(Dig_count==Char_count)
        System.out.println("Equal");
    }
}
