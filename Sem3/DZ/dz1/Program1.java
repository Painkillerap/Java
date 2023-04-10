import java.util.*;
// Сортировка выборкой
public class Program1 {
    public static void main(String[] args) {
        Integer[] s = new Integer[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) Math.round((Math.random() * 90) + 10);
        }
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(sort_list(s)));
    }
    public static Integer[] sort_list(Integer[] s) {
        for (int i = 0; i < s.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[minimum]){
                    minimum = j;
                }
            }
            int t = s[minimum];
            s[minimum] = s[i];
            s[i] = t;
        }
        return s;
    }
}
