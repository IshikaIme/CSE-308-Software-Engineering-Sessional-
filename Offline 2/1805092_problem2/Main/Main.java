package Main;

import FontPackage.FontFactory;
import FontPackage.Fonts;
import ParserPackage.Parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExtensionEditor editor = ExtensionEditor.getExtensionEditor();
        while (true) {
            try{

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter file name: ");
            String filename= scanner.nextLine();
            String [] ext = filename.split("\\.");
            //ExtensionFactory ext= new ExtensionFactory(filename);
            String extension= ext[1];

           // Builder builder= new Builder(ext[1]);
                System.out.println("Font name is: "+ editor.getFontFactory().getFont(extension).getName());
                System.out.println("Parser name is: "+ editor.getParseFactory().getParser(extension).getName());


            System.out.println();
        }

            catch (Exception e)
            {
                System.out.println("Error, try again");
            }
    }

}}

