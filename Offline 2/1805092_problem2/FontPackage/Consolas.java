package FontPackage;

public class Consolas implements Fonts{
    String Name;
    static String name= new String("Consolas");

    public Consolas()
    {
        this.Name= name;
    }

    @Override
    public String getName() {
        return Name;
    }
}
