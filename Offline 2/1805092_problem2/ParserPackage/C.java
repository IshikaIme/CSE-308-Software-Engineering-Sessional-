package ParserPackage;

public class C implements Parser{
    String Name;
    static String name= new String("C");

    public C()
    {
        this.Name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
