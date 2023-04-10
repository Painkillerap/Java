//Реализовать алгоритм сортировки слиянием и выборкой.
//(Самое эффективное , это изучить эти сортировки на Питоне ,
//и постараться написать их на java)
import java.util.*;
//Слияние

public class Program0 {

    public static void main(String[] args) {
        Integer[] S=new Integer[10];
        for (int i = 0; i < S.length; i++) {
            S[i]=(int)Math.round((Math.random()*90)+10);
        }
        System.out.println(Arrays.toString(S));
        System.out.println(Arrays.toString(Sort_list(S)));
    }

public static Integer[] Sort_list(Integer[] S) {
    if(S.length==1){
        return S;
    }
    int middle = S.length/2;
    Integer[] left_part=Sort_list(Arrays.copyOfRange(S, 0, middle));
    Integer[] right_part=Sort_list(Arrays.copyOfRange(S, middle, S.length));
    return mergeArrays(left_part,right_part);
}

public static Integer[] mergeArrays(Integer[] a, Integer[] b) {
    Integer[] res = new Integer[a.length + b.length];
    Integer n = a.length;
    Integer m = b.length;
    Integer i = 0, j = 0, k = 0;
    while (i < n && j < m) {
        if (a[i] <= b[j]) {
            res[k] = a[i];
            i++; }
        else {
            res[k] = b[j];
            j++; }
        k++; }
    while (i < n) {
        res[k] = a[i];
        i++;
        k++; }
    while (j < m) {
        res[k] = b[j];
        j++;
        k++; }
    return res;
}
}
