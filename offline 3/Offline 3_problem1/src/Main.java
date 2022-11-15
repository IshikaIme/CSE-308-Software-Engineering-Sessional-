import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
           Scanner pathname = new Scanner(System.in);
           String filename= pathname.nextLine();
           File fileInput= new File(filename);

           if(fileInput.exists())
           {
               Target_Interface itarget= new AdapterClass(fileInput);
               System.out.println(itarget.CalculateSum());
           }
           else
           {
               System.out.println("Cant find the file");
           }

    }
}
