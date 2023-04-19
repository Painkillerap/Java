/*
 * 1 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2 Создать множество ноутбуков.
3 Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Класс сделать в отдельном файле
приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var shop = new Shop<Computer>();
        var comp = new ArrayList<Computer>();
        addProduct(comp);
        shop.setComputersFromShop(comp);


        Map<String, String> sortStore = new HashMap<>();
        sortStore.put(String.valueOf(OS.Windows), String.valueOf(RAM.RAM_16GB));
        sortStore.put(String.valueOf(OS.linux), String.valueOf(Color.blue));

        var filteredTable = Filter.getFilteredComputersBy(sortStore, shop.getComputersFromShop());
        System.out.println(filteredTable);

        System.out.println(SortingList.sortByPrice(filteredTable));
    }

    static void addProduct(List<Computer> product){
        product.add(new Computer(
                CPU.i7,
                RAM.RAM_16GB,
                Disk.SSD_256GB,
                GPU.nvidia_GTX1060,
                OS.Windows,
                Color.blask,
                70000));
        product.add(new Computer(
                CPU.i5,
                RAM.RAM_8GB,
                Disk.HDD_258GB,
                GPU.nvidia_GTX1030,
                OS.linux,
                Color.blue,
                60000));
        product.add(new Computer(
                CPU.i3,
                RAM.RAM_4GB,
                Disk.HDD_258GB,
                GPU.nvidia_GTX1030,
                OS.linux,
                Color.blue,
                50000));
    }
}
