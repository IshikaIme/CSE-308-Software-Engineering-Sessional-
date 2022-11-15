package Decorators;

import Burger.*;
import FoodIngredients.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Welcome to Ime's Burger Shop. Choose your Favorite Combo:");
                System.out.println("1. Beef burger with French fry and cheese");
                System.out.println("2. Veggi Burger with onion rings and Bottle of Water");
                System.out.println("3. A combo meal with Veggi burger, French Fry and Coke");
                System.out.println("4.A combo meal with Veggi burger, Onion Rings, Coffee and Water");
                System.out.println("5. A Beef burger only");
                System.out.println("Enter your choice ");

                Scanner scanner= new Scanner(System.in);
                int choice= scanner.nextInt();


                switch (choice) {
                    case 1: {
                        FoodItems item = new ComboItem1(new BeefBurger());
                        System.out.print("You have ordered: ");
                        System.out.println(item.PrepareFood());
                        System.out.print("Total cash: ");
                        System.out.println(item.getPrice());
                        System.out.println();
                        break;
                    }
                    case 2: {
                        FoodItems item = new ComboItem2(new VeggiBurger());
                        System.out.print("You have ordered: ");
                        System.out.println(item.PrepareFood());
                        System.out.print("Total cash: ");
                        System.out.println(item.getPrice());
                        System.out.println();
                        break;
                    }
                    case 3: {
                        FoodItems item = new ComboItem3(new VeggiBurger());
                        System.out.print("You have ordered: ");
                        System.out.println(item.PrepareFood());
                        System.out.print("Total cash: ");
                        System.out.println(item.getPrice());
                        System.out.println();
                        break;
                    }
                    case 4: {
                        FoodItems item = new ComboItem4(new VeggiBurger());
                        System.out.print("You have ordered: ");
                        System.out.println(item.PrepareFood());
                        System.out.print("Total cash: ");
                        System.out.println(item.getPrice());
                        System.out.println();
                        break;
                    }
                    case 5: {
                        FoodItems item = new ComboItem5(new BeefBurger());
                        System.out.print("You have ordered: ");
                        System.out.println(item.PrepareFood());
                        System.out.print("Total cash: ");
                        System.out.println(item.getPrice());
                        System.out.println();
                        break;
                    }
                    default:{
                        System.out.println("Not Available until now!");

                    }
                    return;
                }

            } catch (Exception e) {
                System.out.println("Something went wrong, try again");
            }
        }
    }
}
