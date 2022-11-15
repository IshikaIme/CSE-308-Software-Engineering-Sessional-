package Systems;

import Components.ControlUnit;
import Components.DisplayUnit;
import Components.LCDPanel;
import Components.RaspberryPi;

public class Delux implements QueueSystem {
   // private Product product;
    private LCDPanel lcdPanel;
    private RaspberryPi raspberryPi;
    private DisplayUnit displayUnit;
    private ControlUnit controlUnit;


    public Delux()
    {
       // this.product= new Product();
        this.lcdPanel=new LCDPanel();
        this.raspberryPi=new RaspberryPi();
        BuildControlUnit();
        BuildDisplayUnit();
       // this.displayUnit=new DisplayUnit();
       // this.controlUnit=new ControlUnit();

    }
    public void BuildDisplayUnit()
    {
        this.displayUnit=lcdPanel;
    };
    public void BuildControlUnit() {
        this.controlUnit = raspberryPi;
    }

//    public Product getProduct(){
//        return this.product;
//    }

        public DisplayUnit getDisplayUnit()
        {
            return this.displayUnit;
        };
        public ControlUnit getControlUnit()
        {
            return this.controlUnit;
        };
}
