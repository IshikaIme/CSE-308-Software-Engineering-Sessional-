import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpaceSeparatedClass {
    File fin=null;
    int sum;

    public File getFin() {
        return fin;
    }

    public void setFin(File fin) {
        this.fin = fin;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public SpaceSeparatedClass()  {
       fin= null;
       sum= 0;
    }

    int CalculateSumSpace (File filename) throws FileNotFoundException {
        sum=0;
        fin= filename;
        Scanner myReader = new Scanner(fin);
        while(myReader.hasNextLine())
        {
            String line= myReader.nextLine();
            String[] numbers= line.split(" ");
            for (int i = 0; i < numbers.length; i++) {
              //  System.out.println();
                sum+= Integer.parseInt(numbers[i]);
            }

        }
        setSum(sum);
        return this.getSum();

    }
};
