
//1. Реализуйте структуру телефонной книги с помощью HashMap, 
//учитывая, что 1 человек может иметь несколько телефонов.
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Program0 {

    public static void main(String[] args) {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>(Map.of());

        List<String> values_1 = new ArrayList<String>();
        values_1.add("+71234561234");
        values_1.add("+74321654321");
        List<String> values_2 = new ArrayList<String>();
        values_2.add("+71234567890");
        List<String> values_3 = new ArrayList<String>();
        values_3.add("88002003030");
        map.put("Иванов", values_1);
        map.put("Петров", values_2);
        map.put("Сидоров", values_3);

        Scanner a = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String b = a.nextLine();
        boolean search = map.containsKey(b);
        if (search == true) {
            System.out.println(map.get(b));
        } else {
            System.out.println("Абонента с такой фамилией не существует!");
        }
    }
}
