package ParserPackage;


public class CPP implements Parser{
    String Name;
    static String name= new String("CPP");

    public CPP()
        {
            this.Name=name;
        }


    public String getName() {
        return name;
        }

}
