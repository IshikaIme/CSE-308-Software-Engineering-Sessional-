package Burger;
import FoodIngredients.*;

public class ChickenBurger extends Burger {
    private double cost =380.00;
    private double price;
    private String name ;

    public ChickenBurger()
    {
        this.setPrice();
        this.name=" Chicken-Burger ";
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