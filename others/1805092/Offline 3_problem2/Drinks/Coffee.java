package Drinks;
import FoodIngredients.*;

public class Coffee extends Drinks {
    private double cost =30.00;
    private double price;
    private String name ;

    public Coffee()
    {
        this.setPrice();
        this.name=" Coffee ";
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
