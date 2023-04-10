//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Java.Seminar.Sem3.DZ.dz3;
import java.util.*;

public class Program3 {

    public static void main(String[] args) {
        ArrayList<Integer> s= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            s.add((int) Math.round((Math.random() * 90) + 10));
        }
        System.out.println(s);
        int sum=s.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Минимальное значение равно: ");
        System.out.println(Collections.min(s));
        System.out.println("Максимальное значение равно: ");
        System.out.println(Collections.max(s));
        System.out.println("Среднее значение равно: ");
        System.out.println(sum/s.size());
    }
}
