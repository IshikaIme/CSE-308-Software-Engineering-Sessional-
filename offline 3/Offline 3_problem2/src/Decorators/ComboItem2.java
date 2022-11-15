package Decorators;

import Appetizers.OnionRings;
import Drinks.*;
import FoodIngredients.*;


public class ComboItem2 extends Decorator {

    Appetizer appetizer= new OnionRings();
    Drinks drinks= new Water();
    private static double ComboPrice;
    public ComboItem2(FoodItems newFood) {
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
