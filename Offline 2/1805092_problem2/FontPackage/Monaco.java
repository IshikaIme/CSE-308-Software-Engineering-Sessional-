package FontPackage;

public class Monaco implements Fonts{
    String Name;
    static String name= new String("Monaco");

    public Monaco()
    {
        this.Name= name;
    }

    @Override
    public String getName() {
        return Name;
    }
}
