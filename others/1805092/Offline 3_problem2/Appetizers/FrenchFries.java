package Appetizers;
import FoodIngredients.*;

public class FrenchFries extends Appetizer {
    private double cost =200.00;
    private double price;
    private String name ;
    public FrenchFries()
    {
        this.setPrice();
        this.name=" French-Fries ";
    }

    @Override
    public void setPrice() {
        this.price=cost;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String PrepareFood() {
        return this.name;
    }
}
