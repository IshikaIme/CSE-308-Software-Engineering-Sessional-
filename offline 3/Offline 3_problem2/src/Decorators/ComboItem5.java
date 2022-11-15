package Decorators;

import FoodIngredients.*;

public class ComboItem5 extends Decorator {
    private static double ComboPrice;
    public ComboItem5(FoodItems newFood) {
        super(newFood);
        setPrice();
    }

    @Override
    public void setPrice() {
        ComboPrice= super.getPrice();

    }

    @Override
    public double getPrice() {
        return ComboPrice;
    }

    @Override
    public String PrepareFood() {
        return super.PrepareFood();
    }
}
