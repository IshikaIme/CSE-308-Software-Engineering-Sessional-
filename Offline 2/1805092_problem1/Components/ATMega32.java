package Components;

public class ATMega32 extends ControlUnit{
    static double cost =1500.00;
    static double monthly_cost= 0.00;
    static String name= "ATmega32";
    Double Price;
    String Name;
    Double monthly_bill;

    public ATMega32() {
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

    @Override
    public Double getMonthly_bill() {
        return this.monthly_bill;
    }
    @Override
    public void setMonthly_bill() {
        this.monthly_bill = monthly_cost;
    }
}
