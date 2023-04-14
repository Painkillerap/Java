import java.util.ArrayList;

public class Program2 {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны
    // для приложения, которое является
    // а) информационной системой ухода за ней
    // б) архивом выставки бульдожков
    // в) информационной системой Театра бульдожек имени Дарахвелидзе
    public static void main(String[] args) {
        Buldojka Sobaka = new Buldojka(5, 30, "Buldog","Gav","Anton");
        Buldojka Sobaka2 = new Buldojka(5, 15, "Чихуа-хуа", "Gav2", "Dmitriy");
        
        Sobaka.gladit();
        
        System.out.println(Sobaka.getName());

        Sobaka2.newVystavka("КОнкурс красоты");
        Sobaka2.newVystavka("Мисс вселенная");
        
        Sobaka2.getVystavka();
        
        Sobaka2.getAll();
    }
}
