package Decorators;

import Appetizers.OnionRings;
import FoodIngredients.*;
import Drinks.*;


public class ComboItem4 extends Decorator {
    Appetizer appetizer= new OnionRings();
    Drinks drink1= new Coffee();
    Drinks drink2= new Water();
    private static double ComboPrice;
    public ComboItem4(FoodItems newFood) {
        super(newFood);
        setPrice();
    }

    @Override
    public void setPrice() {
        ComboPrice= super.getPrice()+appetizer.getPrice()+drink1.getPrice()+drink2.getPrice();
    }

    @Override
    public double getPrice() {
        return ComboPrice;
    }

    @Override
    public String PrepareFood() {
        return super.PrepareFood()+appetizer.PrepareFood()+drink1.PrepareFood()+drink2.PrepareFood()  ;
    }
}
