package ParserPackage;

public class ParseFactory {
    Parser parser;
    public ParseFactory() {
        //constructor
    }
    public Parser getParser(String ext)
    {
        if(ext.equalsIgnoreCase("C"))
            parser= new C();

        else if(ext.equalsIgnoreCase("CPP"))
            parser= new CPP();

        else if(ext.equalsIgnoreCase("py"))
            parser= new PY();

        return parser;
    }
}
