package Components;

public class Application implements Components{
    Double Price;
    String Name;
    Double monthly_bill;
    static double cost= 800.00;
    static double monthly_cost= 0.00;
    static String name= "Application";
    public Application()
    {
        this.Price= cost;
        this.Name=name;
        this.monthly_bill=monthly_cost;
    }


    public Double getPrice() {
        return this.Price;
    }

    public void setPrice() {
        this.Price=cost;
    }

    public String getName() {
        return this.Name;
    }

    public void setName() {
        this.Name=name;
    }

    @Override
    public Double getMonthly_bill() {
        return this.monthly_bill;
    }
    @Override
    public void setMonthly_bill() {
        this.monthly_bill = monthly_cost;
    }
}



