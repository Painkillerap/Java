import java.util.ArrayList;

public class Buldojka {
    public int age;
    public int mass;
    public String type;
    public String name;
    public String master;
    public ArrayList<String> vistavki=new ArrayList<>();


    public Buldojka(int age, int mass, String type, String name, String master)
    {
        this.age=age;
        this.mass=mass;
        this.type=type;
        this.name=name;
        this.master=master;
    }
    void gladit()
    {
        System.out.println("RRR");
    }
    String getName()
    {
        return name;
    }
    void newVystavka(String name123)
    {
        vistavki.add(name);
    }
    void getVystavka()
    {
        System.out.println("Все выставки бульдожки");
        for (int i = 0; i < vistavki.size(); i++) {
            System.out.println(vistavki.get(i));
        }
    }
    void getAll()
    {
        System.out.println("Кличка - " + name);
        System.out.println("Вес - " + mass);
        System.out.println("Порода - " + type);
        System.out.println("Возраст - " + age);
        System.out.println("Владелец - " + master);

        getVystavka();
    }
}
