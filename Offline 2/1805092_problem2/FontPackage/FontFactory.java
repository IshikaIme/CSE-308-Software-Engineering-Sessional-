package FontPackage;

public class FontFactory {
    Fonts font;

    public FontFactory() {
        //constructor
    }

    public Fonts getFont(String ext)
    {
        if(ext.equalsIgnoreCase("C"))
            font= new CourierNew();

        else if(ext.equalsIgnoreCase("CPP"))
            font= new Monaco();

        else if(ext.equalsIgnoreCase("py"))
            font= new Consolas();

        return font;
    }
}
