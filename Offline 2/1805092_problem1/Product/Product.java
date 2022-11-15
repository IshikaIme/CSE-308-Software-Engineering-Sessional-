package Product;
import Components.*;


public class Product implements ProductPlan{
    private DisplayUnit DisplayUnit;
    private ControlUnit ControlUnit;
    private Application Application;
    private CommunicationSystem CommunicationSystem;
    private int NoOfDisplay;

//    public Product() {
//        //DisplayUnit = new DisplayUnit();
//       // ControlUnit = new ControlUnit();
//       // Application = new Application();
//       // CommunicationSystem = new CommunicationSystem();
//       // NoOfDisplay = 0;
//    }

    public Product(DisplayUnit displayUnit, ControlUnit controlUnit, Application application, CommunicationSystem communicationSystem, int noOfDisplay) {
        DisplayUnit = displayUnit;
        ControlUnit = controlUnit;
        Application = application;
        CommunicationSystem = communicationSystem;
        NoOfDisplay = noOfDisplay;
    }

    public int getNoOfDisplay() {
        return NoOfDisplay;
    }

    public void setNoOfDisplay(int noOfDisplay) {
        NoOfDisplay = noOfDisplay;
    }

    public void setDisplayUnit(DisplayUnit DisplayUnit)
    {
        this.DisplayUnit=DisplayUnit;
    };
    public void setControlUnit(ControlUnit ControlUnit)
    {
        this.ControlUnit=ControlUnit;
    };
    public void setApplication(Application Application)
    {
        this.Application=Application;
    };
    public void setCommunicationSystem(CommunicationSystem CommunicationSystem)
    {
        this.CommunicationSystem=CommunicationSystem;
    };

    public DisplayUnit getDisplayUnit() {
        return this.DisplayUnit;
    }

    public ControlUnit getControlUnit() {
        return this.ControlUnit;
    }

    public Application getApplication() {
        return this.Application;
    }

    public CommunicationSystem getCommunicationSystem() {
        return this.CommunicationSystem;
    }

}
