package FoodIngredients;


public abstract class Decorator implements FoodItems {
    private FoodItems newFood;
    public Decorator(FoodItems newFood)  {
        this.newFood=newFood;
    }
    @Override
    public String PrepareFood(){
        return newFood.PrepareFood();
    }
    public double getPrice(){
        return newFood.getPrice();
    }
}

