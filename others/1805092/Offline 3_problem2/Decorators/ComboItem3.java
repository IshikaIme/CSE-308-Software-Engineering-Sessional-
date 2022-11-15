package Decorators;

import Appetizers.FrenchFries;
import Drinks.*;
import FoodIngredients.*;

public class ComboItem3 extends Decorator {
    Appetizer appetizer= new FrenchFries();
    Drinks drinks= new Coke();
    private static double ComboPrice;
    public ComboItem3(FoodItems newFood) {
        super(newFood);
        setPrice();
    }

    @Override
    public void setPrice() {
        ComboPrice= super.getPrice()+appetizer.getPrice()+drinks.getPrice();
    }

    @Override
    public double getPrice() {
        return ComboPrice;
    }

    @Override
    public String PrepareFood() {
        return super.PrepareFood()+appetizer.PrepareFood()+drinks.PrepareFood() ;
    }
}
