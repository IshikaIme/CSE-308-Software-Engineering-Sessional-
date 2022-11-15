package Components;

public interface Components {
    Double Price=null;
    String Name = null;
    Double monthly_bill=null;

    public abstract Double getPrice();

    public abstract void setPrice();

    public abstract String getName();

    public abstract void setName();


    public abstract Double getMonthly_bill();

    public abstract void setMonthly_bill();


}
