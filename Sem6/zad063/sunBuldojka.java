public class sunBuldojka extends Buldojka {
    int massInStart;
    public sunBuldojka(int age, int mass,String type, String name, String master, int massInStart)
    {
        super(age,mass,type,name,master);
        this.massInStart=massInStart;
    }
@Override
    void gladit()
    {
        System.out.println("yyyr");
    }
}
