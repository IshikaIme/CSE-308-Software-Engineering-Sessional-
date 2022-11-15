package Main;

import Components.*;
import Product.Product;

import java.util.ArrayList;

public class Printer {
    private double DisplayCost, YearlyCommCost, YearlyTotalCost;
    private ArrayList<Components> ComponentList;
    private double totalCost;
    Printer()
    {
        YearlyTotalCost=0.0;
        totalCost=0.0;
        YearlyCommCost=0.0;
        DisplayCost=0.0;
        ComponentList=new ArrayList<>();
    }

    public void ShowALl(Product product)
    {
        ComponentList.add(product.getDisplayUnit());
        ComponentList.add(product.getControlUnit());
        ComponentList.add(product.getApplication());
        ComponentList.add(product.getCommunicationSystem());


        System.out.println("Your ordered products are below: ");

        System.out.println("Display Unit: "+ ComponentList.get(0).getName() +" ,Price: "+ ComponentList.get(0).getPrice());
        System.out.println("Control Unit: "+ ComponentList.get(1).getName() +" ,Price: "+ ComponentList.get(1).getPrice());
        System.out.println("Application: "+ ComponentList.get(2).getName() +" ,Price: "+ ComponentList.get(2).getPrice());
        System.out.println("Communication System: "+ ComponentList.get(3).getName() +" ,Price: "+ ComponentList.get(3).getPrice()+", Monthly bill: " +ComponentList.get(3).getMonthly_bill());
        System.out.println("You ordered "+ product.getNoOfDisplay()+ " Numbers of " +ComponentList.get(0).getName() );

        for(int i=1; i<ComponentList.size(); i++)
        {

            totalCost= totalCost+ComponentList.get(i).getPrice();
        }

        DisplayCost= product.getNoOfDisplay() * ComponentList.get(0).getPrice();
        totalCost+=DisplayCost;

        System.out.println("Price of the display is " + DisplayCost );
        System.out.println("Total price is " + totalCost);

        YearlyCommCost= 12*  ComponentList.get(3).getMonthly_bill();

        System.out.println("Yearly cost of "+ ComponentList.get(3).getName() + " is " + YearlyCommCost );
        YearlyTotalCost = totalCost+YearlyCommCost;

        System.out.println("Yearly total cost is  "+ YearlyTotalCost );

    }
}
