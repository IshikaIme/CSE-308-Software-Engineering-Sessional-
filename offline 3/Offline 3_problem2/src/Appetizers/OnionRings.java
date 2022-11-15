package Appetizers;
import FoodIngredients.*;

public class OnionRings extends Appetizer {
    private double cost =400.00;
    private double price;
    private String name ;
    public OnionRings()
    {
        this.setPrice();
        this.name=" Onion-Rings ";
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
