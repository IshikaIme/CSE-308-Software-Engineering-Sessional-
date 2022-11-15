package Product;

import Components.Application;
import Components.CommunicationSystem;
import Components.ControlUnit;
import Components.DisplayUnit;

public interface ProductPlan {
    public void setDisplayUnit(DisplayUnit DisplayUnit);
    public void setControlUnit(ControlUnit ControlUnit);
    public void setApplication(Application Application);
    public void setCommunicationSystem(CommunicationSystem CommunicationSystem);
    public void setNoOfDisplay(int noOfDisplay);

    public DisplayUnit getDisplayUnit();
    public ControlUnit getControlUnit();
    public Application getApplication();
    public CommunicationSystem getCommunicationSystem();
    public int getNoOfDisplay();




}
