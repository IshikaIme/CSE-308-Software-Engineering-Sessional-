import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdapterClass extends SpaceSeparatedClass implements Target_Interface {
    File fileRead=null;
    File filewrite;
    ArrayList<Integer> IntNumbers;


    AdapterClass(File str)
    {
        //filewrite=null;
        filewrite=new File("out.txt");
        IntNumbers=new ArrayList<>();
        fileRead=str;
    }


    public void makeSpecialToSpace() throws IOException {

        String[] numbers = new String[0];
        Scanner scn= new Scanner(fileRead);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filewrite));
        while(scn.hasNextLine()) {
            String line = scn.nextLine();
            numbers = line.split("~");
        }
        for (int i = 0; i <numbers.length ; i++) {
            IntNumbers.add(Integer.parseInt(numbers[i]));

          //  System.out.println(numbers[i]);
            writer.write(numbers[i]);
            writer.write(" ");
        }


        setFin(filewrite);
        writer.close();


    }

    @Override
    public int CalculateSum() throws IOException {
        this.makeSpecialToSpace();
        int sum= this.CalculateSumSpace(filewrite);
        return sum;
    }


}
