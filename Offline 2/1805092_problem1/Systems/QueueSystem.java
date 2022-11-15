package Systems;

import Components.ControlUnit;
import Components.DisplayUnit;


public interface QueueSystem {


    public void BuildDisplayUnit();
    public void BuildControlUnit();
    public DisplayUnit getDisplayUnit();
    public ControlUnit getControlUnit();

   // public Product getProduct();
}
