import java.util.*;
import java.util.HashSet;
import java.util.Random;

public class Program1 {
    public static void main(String[] args) {
        int array[]= new int[1000];
        array = initArray();
        for (int i = 0; i < 1000; i++) {
            System.out.println(array[i]);
        }
        getPercentUniqueValues(array);
        System.out.println();
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(){
        int array[]=new int[1000];
        Random rd =new Random();
        for (int i = 0; i < 1000; i++) {
            array[i]=rd.nextInt(25);
        }
        return array;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        HashSet<Integer> numbers=new HashSet<>(Arrays.asList());
        for (int i = 0; i < 1000; i++) {
            numbers.add(array[i]);
        }
        return numbers.size()*1000/array.length;
    }
}
