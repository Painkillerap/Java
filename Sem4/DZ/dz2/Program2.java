//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
package Java.Seminar.Sem4.DZ.dz2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Program2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        // result [6,6,0,1]
        LinkedList<Integer> LL = new LinkedList<Integer>();
        String S = new String();
        String S1 = new String();
        int d1Size = d1.size();
        int d2Size = d2.size();
        for (int i = 0; i < d1Size; i++) {
            S += d1.pollLast();
        }
        for (int j = 0; j < d2Size; j++) {
            S1 += d2.pollLast();
        }
        int Sum = Integer.parseInt(S) + Integer.parseInt(S1);

        while (Sum > 0) {
            LL.add(Sum % 10);
            Sum = Sum / 10;
        }
        System.out.println(LL);
    }
}
