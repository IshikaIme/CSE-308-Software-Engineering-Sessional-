package Drinks;
import FoodIngredients.*;

public class Coke extends Drinks {
    private double cost =40.00;
    private double price;
    private String name ;

    public Coke()
    {
        this.setPrice();
        this.name=" Coke ";
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
