package Components;

public abstract class ControlUnit implements Components{
    Double Price;
    String Name;
    Double monthly_bill;
    public abstract Double getPrice() ;

    public abstract void setPrice() ;

    public abstract String getName() ;

    public abstract void setName() ;

    public abstract Double getMonthly_bill() ;

    public abstract void setMonthly_bill() ;
}
