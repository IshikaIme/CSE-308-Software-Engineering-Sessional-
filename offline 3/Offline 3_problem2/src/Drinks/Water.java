package Drinks;
import FoodIngredients.*;

public class Water extends Drinks {
    private double cost =15.00;
    private double price;
    private String name ;

    public Water()
    {
        this.setPrice();
        this.name=" Water ";
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
