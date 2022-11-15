package ParserPackage;

public class PY implements Parser{
    String Name;
    static String name= new String("Python");

    public PY()
    {
        this.Name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}