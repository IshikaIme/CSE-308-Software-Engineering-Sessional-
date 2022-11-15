package Burger;
import FoodIngredients.*;

public class VeggiBurger extends Burger {
    private double cost =250.00;
    private double price;
    private String name ;

    public VeggiBurger()
    {
        this.setPrice();
        this.name=" Veggi-Burger ";
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