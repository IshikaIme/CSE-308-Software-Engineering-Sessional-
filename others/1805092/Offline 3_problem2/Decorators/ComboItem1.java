package Decorators;

import Appetizers.FrenchFries;
import Burger.*;
import FoodIngredients.*;

public class ComboItem1 extends Decorator {
    Appetizer appetizer= new FrenchFries();
    Cheese cheese = new Cheese();
    private static double ComboPrice;

    public ComboItem1(FoodItems newFood) {
        super(newFood);
        setPrice();
    }


    @Override
    public void setPrice() {
        ComboPrice= super.getPrice()+appetizer.getPrice()+cheese.getPrice();
    }

    @Override
    public double getPrice() {
        return ComboPrice;
    }

    @Override
    public String PrepareFood() {
        return super.PrepareFood()+appetizer.PrepareFood()+cheese.PrepareFood() ;
    }
}
