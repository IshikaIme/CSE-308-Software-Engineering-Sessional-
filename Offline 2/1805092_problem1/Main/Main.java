package Main;

import Product.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {

                Printer printer = new Printer();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Queue System:");
                String QueueSystem = scanner.nextLine();
                System.out.println("Enter  Communication Channel ");
                String CommunicationChannel = scanner.nextLine();
                System.out.println("Enter Number of Display Units:");
                int NoOfDisplayUnits = Integer.parseInt(scanner.nextLine());

                PackageBuilder packageBuilder = new PackageBuilder();
                Product product = packageBuilder.MakePackage(QueueSystem, CommunicationChannel, NoOfDisplayUnits);
                // packageBuilder.show();

                printer.ShowALl(product);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Wrong Input. Try again.");
            }
        }
    }
}


