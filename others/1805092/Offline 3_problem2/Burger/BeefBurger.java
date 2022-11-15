package Burger;
import FoodIngredients.*;

public class BeefBurger extends Burger {
    private double cost =350.00;
    private double price;
    private String name ;

    public BeefBurger()
    {
        this.setPrice();
        this.name=" Beef-Burger ";
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
