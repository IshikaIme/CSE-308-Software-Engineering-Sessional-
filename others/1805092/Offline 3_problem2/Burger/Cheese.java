package Burger;
import FoodIngredients.*;

public class Cheese implements FoodItems {
    private double cost =60.00;
    private double price;
    private String name ;

    public Cheese()
    {
        this.setPrice();
        this.name="Cheese";
    }

    @Override
    public void setPrice() {
        this.price=cost;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String PrepareFood() {
        return this.name;
    }
}