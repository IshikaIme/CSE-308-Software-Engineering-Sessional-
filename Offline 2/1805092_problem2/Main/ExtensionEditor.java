package Main;

import FontPackage.FontFactory;
import ParserPackage.ParseFactory;

public class ExtensionEditor {

    private static ExtensionEditor editor = null;

    private ExtensionEditor(){

        //this is constructor
    }
    public static ExtensionEditor getExtensionEditor(){
        if(editor== null)
            editor= new ExtensionEditor();
        return editor;
    }



    public ParseFactory getParseFactory(){
        return new ParseFactory();
    }

    public FontFactory getFontFactory(){
        return new FontFactory();
    }




}