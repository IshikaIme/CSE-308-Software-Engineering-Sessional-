package Components;

public class MobileSystem extends CommunicationSystem{
    static double cost =2100.00;
    static double monthly_cost= 500.00;
    static String name= "Mobile System";
    Double Price;
    String Name;
    Double monthly_bill;


    public MobileSystem() {
        this.Price = cost;
        this.Name = name;
        this.monthly_bill=monthly_cost;
    }
    @Override
    public Double getPrice() {
        return this.Price;
    }

    @Override
    public void setPrice() {
        this.Price= cost;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName() {
        this.Name= name;
    }

    public Double getMonthly_bill() {
        return monthly_bill;
    }

    public void setMonthly_bill() {
        this.monthly_bill = monthly_cost;
    }
}
