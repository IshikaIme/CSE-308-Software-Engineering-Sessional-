package FontPackage;

public class CourierNew implements Fonts{
    String Name;
    static String name= new String("Courier new");

    public CourierNew()
    {
        this.Name= name;
    }

    @Override
    public String getName() {
        return Name;
    }
}
